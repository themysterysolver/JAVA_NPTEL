import java.io.*;
public class RandomAcess {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f=new RandomAccessFile("RAF.txt","rw");
        f.writeChar('x');
        f.writeBoolean(true);
        f.writeInt(100);
        f.seek(0);
        System.out.println(f.readChar());
        System.out.println(f.readBoolean());
        System.out.println(f.readInt());
        System.out.println("-------------------------");
        f.seek(2);
        System.out.println(f.readBoolean());
        System.out.println(f.readInt());
        System.out.println("-------------------------");
        f.seek(2);
        f.writeBoolean(false);
        f.seek(2);
        System.out.println(f.readBoolean());
        System.out.println(f.readInt());
        System.out.println("-------------------------");

    }
}
