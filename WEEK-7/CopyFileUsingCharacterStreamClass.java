import java.io.*;
public class CopyFileUsingCharacterStreamClass {
    public static void main(String[] args) {
        File inf=new File("hello.txt");
        File outf=new File("output.txt");
        FileReader inread=null;
        FileWriter outwriter=null;
        try {
            inread=new FileReader(inf);
            outwriter=new FileWriter(outf);
            int c;
            while((c=inread.read())!=-1){
                outwriter.write(c);
            }
            System.out.println("File copy sucessfull!!");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
