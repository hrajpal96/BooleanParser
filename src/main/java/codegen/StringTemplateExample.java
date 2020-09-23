package codegen;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import antlrsource.BooleanExprParserBaseListener;
import antlrsource.BooleanExprParser.ParseContext;
import antlrsource.BooleanExprLexer;
import antlrsource.BooleanExprParser;

public class StringTemplateExample {
    public static void main(final String[] args) {

        final STGroup stGroup = new STGroupFile("exampleTemplate.stg");
        final ST stringTemplateExample = stGroup.getInstanceOf("templateExample");

        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                new File("C:\\Users\\Lenovo\\IdeaProjects\\BooleanParser\\src\\main\\antlr\\input.txt"))))) {
            List<String> lines = reader.lines().collect(Collectors.toList());
            String functionName = "generated_function_%1$s";
            List<Map> functions = new ArrayList<>();
            Map <String,String> function;
            for (int i = 0; i < lines.size(); i++) {
                BooleanExprLexer lexer = new BooleanExprLexer(CharStreams.fromString(lines.get(i)));
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                BooleanExprParser parser = new BooleanExprParser(tokens);
                
                ParseTree tree = parser.parse();
                ParseContext context = (ParseContext) tree;
                System.out.println(context.str);
                BooleanExprParserBaseListener booleanExprBaseListener = new BooleanExprParserBaseListener();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(booleanExprBaseListener, tree);
                List<String> identifiers = booleanExprBaseListener.getIdentifiersList();
                function =  new HashMap<>();
                function.put("function_name", String.format(functionName, i));
                function.put("expression", context.str);
                function.put("params_list", identifiers.stream().collect(Collectors.joining(", ")));
                functions.add(function);
                booleanExprBaseListener.clearIdentifiers();
                
            }
            stringTemplateExample.add("functions", functions);
            System.out.println(stringTemplateExample.render());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
