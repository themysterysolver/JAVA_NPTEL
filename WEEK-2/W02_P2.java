import java.util.Scanner;
class Student {
  private String Name="";
  private int Age=0;
  Student(String name,int age){
  	this.Name=name;
    this.Age=age;
  }
  public String getName(){
  		return Name;
  	}
 public int getAge(){
  		return Age;
  }
}
class W02_P2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    Student student = new Student(name, age);
    System.out.println("Student Name: " + student.getName());
    System.out.print("Student Age: " + student.getAge());

    scanner.close();
  }
}