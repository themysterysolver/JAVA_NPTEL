import java.io.*;

public class SequenceInputStreamImplementaionUsingBuffer {
    public static void main(String[] args) throws IOException {
        FileInputStream a=new FileInputStream("hello.txt");
        FileInputStream b=new FileInputStream("output.txt");
        SequenceInputStream f=new SequenceInputStream(a,b);
        BufferedInputStream bin=new BufferedInputStream(f);
        BufferedOutputStream bout=new BufferedOutputStream(System.out);
        int c;
        while((c=bin.read())!=-1){
            bout.write(c);
        }
        bout.flush();
    }
}

