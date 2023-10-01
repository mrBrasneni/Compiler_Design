package main;

import parser.ParseException;
import parser.Parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Reader reader = new FileReader("src/main/resources/input.mj");
        Parser parser = new Parser(reader);
        parser.Program();
        reader.close();
    }
}
