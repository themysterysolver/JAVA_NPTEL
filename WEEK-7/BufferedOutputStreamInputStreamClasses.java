import java.io.*;
public class BufferedOutputStreamInputStreamClasses {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("hello.txt");
            FileOutputStream fout=new FileOutputStream("output.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            BufferedInputStream bin=new BufferedInputStream(fin);
            bout.write("She is my best friend and her name is abiarama varshini!".getBytes());
            int i=0;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println("\nBuffered input and output has been implemented successfully!!");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
