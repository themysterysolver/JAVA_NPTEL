import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamImplementation {
    public static void main(String[] args) throws IOException {
        FileInputStream a=new FileInputStream("hello.txt");
        FileInputStream b=new FileInputStream("output.txt");
        SequenceInputStream f=new SequenceInputStream(a,b);
        int c;
        while((c=f.read())!=-1){
            System.out.print((char)c);
        }
    }
}
