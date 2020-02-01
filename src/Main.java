import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {

    public  static void main(String[] args) throws Exception {
        try {
            basementLexer lexer;
            if(args.length>0)
                lexer = new basementLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new basementLexer(CharStreams.fromStream(System.in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            basementParser parser = new basementParser(tokens);
            ParseTree tree = parser.init();
            ParseTreeWalker walker = new ParseTreeWalker();
            BasementToBashCode listener = new BasementToBashCode();
            walker.walk(listener, tree);
            System.out.println("#### Translation");
            System.out.println(listener.translate);
        } catch (Exception e) {
            System.err.println("Error (Test) " + e);
        }
    }
}
