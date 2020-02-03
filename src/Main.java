import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Main {

    public static void writeBashFile(String filePath, String translation) {
        try {
            FileWriter wr = new FileWriter(filePath);
            wr.write("#!/bin/bash \n");
            wr.write(translation);
            wr.flush();
            wr.close();
        } catch (Exception e) {
            System.err.println("Writing bash file " + e);
        }
    }

    public static void executeBashFile(String filePath) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "sh " + filePath);

        try {
            Process process = processBuilder.start();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            BufferedReader reader_error =
                    new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line_error;
            while ((line_error = reader_error.readLine()) != null) {
                System.out.println(line_error);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with code : " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            //System.out.println("#### Translation");
            //System.out.println(listener.translate);
            String file = "src/out/output.sh";
            writeBashFile(file, listener.translate);
            executeBashFile(file);
        } catch (Exception e) {
            System.err.println("Error (Basement) " + e);
        }
    }
}
