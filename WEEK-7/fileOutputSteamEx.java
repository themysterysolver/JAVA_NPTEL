import java.io.FileOutputStream;
import java.io.*;
class fileOutputSteamEx{
    public static void main(String[] args){
        String content="I am the true programmer!";
        String fname="hello.txt";
        try{
           FileOutputStream f=new FileOutputStream(fname);
           f.write(content.getBytes());
           f.close();
           System.out.println("File write sucessfull!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}