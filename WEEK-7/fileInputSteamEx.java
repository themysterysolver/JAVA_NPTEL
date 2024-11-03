import java.io.FileInputStream;
import java.io.*;
class fileInputSteamEx{
    public static void main(String[] args){
        String name="hello.txt";
        try{
            FileInputStream f=new FileInputStream(name);
            int content;
            while((content=f.read())!=-1){
                System.out.print((char)content);
            }
            f.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}