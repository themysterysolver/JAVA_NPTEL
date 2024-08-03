import java.util.Scanner;
public class Dog {

    private String name;
    private String breed;
    private int age;
    private String color;
    Dog(String name,String breed,int age,String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getColor(){
        return color;
    }
    String getBreed(){
        return breed;
}public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String breed = scanner.nextLine();
        int age = scanner.nextInt();
        String color = scanner.next();
        
        Dog tommy = new Dog(name, breed, age, color);
        
        System.out.println("Hi my name is: " + tommy.getName());
        System.out.println("My breed is: " + tommy.getBreed());
        System.out.println("My age is: " + tommy.getAge());
        System.out.print("My color is: " + tommy.getColor());
        
        scanner.close();
    }
}