import java.io.*;

class data{
    public static void main(String[] args){
        //DataInputStream in =new DataInputStream(System.in); DEPRECATED
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ENTER VALUE:");
            String temp=in.readLine();
            System.out.println("THE VALUE:"+temp);}
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}