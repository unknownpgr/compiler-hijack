package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import generated.HijackLexer;
import generated.HijackParser;
import generated.HijackParser.SContext;

public class Main {
	public static void main(String[] args) throws IOException {
//		Read file
		CharStream charStream = CharStreams.fromFileName("./source.txt");
//		Parse file
		HijackLexer lexer = new HijackLexer(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		HijackParser parser = new HijackParser(commonTokenStream);
		SContext context = parser.s();

		Visitor visitor = new Visitor();

		String code = visitor.visit(context);

		System.out.println("Raw source code : \n" + charStream);
		System.out.println("Destination code : \n" + code);
	}
}
