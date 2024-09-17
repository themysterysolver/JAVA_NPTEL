import java.io.File;
class forFile{
    public static void main(String[] args){
        File toCheck;
        String a="hello.txt";
        toCheck=new File(a);
        System.out.println("name:"+toCheck.getName());
        System.out.println("path:"+toCheck.getPath());
        System.out.println("parent:"+toCheck.getParent());
        File f=toCheck;
        if(f.exists()){
            System.out.println("READABLE:"+f.canRead());
            System.out.println("WRITABLE:"+f.canWrite());
            System.out.println("LAST MODIFIED ON:"+f.lastModified());
            System.out.println("FILE IN BYTES:"+f.length());
        }
    }
}