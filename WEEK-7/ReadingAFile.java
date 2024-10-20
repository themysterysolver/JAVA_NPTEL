import  java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;

public class ReadingAFile {
    public static void main(String[] args) {
        try {
            FileInputStream newFile = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
