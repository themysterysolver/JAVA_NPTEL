import java.io.File;
class forFile{
    public static void main(String[] args){
        File toCheck;
        String a="hello.txt";
        toCheck=new File(a);
        System.out.println("name:"+toCheck.getName());
        System.out.println("path:"+toCheck.getPath());
        System.out.println("parent:"+toCheck.getParent());
    }
}