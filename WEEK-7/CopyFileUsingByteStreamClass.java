import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingByteStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("hello.txt");
            FileOutputStream fout=new FileOutputStream("output.txt");
            byte b;
            while((b=(byte)fin.read())!=-1){
                //System.out.println((char)b);
                fout.write((char)b);
                System.out.println("File copy successfull");
            }
        }
        catch(IOException E){
            System.out.println(E.getMessage());
        }
    }
}
