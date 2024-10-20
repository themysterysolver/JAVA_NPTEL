import java.io.FileOutputStream;
import java.io.*;
class fileOutputSteamEx{
    public static void main(String[] args){
        String content="I am the true programmer!";
        String fname="hello.txt";
        byte her[]={'b','i','!'};
        try{
           FileOutputStream f=new FileOutputStream(fname);
           f.write(content.getBytes());
           f.write(65);
           f.write(her);
           f.close();
           System.out.println("File write sucessfull!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}