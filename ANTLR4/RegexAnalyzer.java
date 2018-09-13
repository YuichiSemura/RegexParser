package def2opt;

import def2opt.ANTLRv4Parser.RegexLexer;
import def2opt.ANTLRv4Parser.RegexParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class RegexAnalyzer {
    public static void main(String[] args) {
        new RegexAnalyzer().runInstance(args);
    }

    private void runInstance(String[] args) {
        if (args.length == 0) {
            System.out.println("no args");
        }
        createParser(args[0]);
    }

    private void createParser(String someString) {
        CharStream stream = CharStreams.fromString(someString);
        RegexLexer lexer = new RegexLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RegexParser parser = new RegexParser(tokens);
        RegexParser.RegexContext a = parser.regex();
        explore(a, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(!(element instanceof TerminalNodeImpl)) {
                System.out.println(ctx.getText());
                explore((RuleContext) element, indentation + 1);
            }
            if(element instanceof RegexParser.DigitContext){
                RegexParser.DigitContext dc = (RegexParser.DigitContext)element;
                dc.getStates();
            }
        }
    }
}
