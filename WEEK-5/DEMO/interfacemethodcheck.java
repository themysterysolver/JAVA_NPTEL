//METHODS-by default set a spublic and abstract!
//Memebers are set as static,final,public
interface hello{
    void display();
    void display1();
}
class a implements hello{
    public void display(){ //should be public,else takes default which is week!
        System.out.println("Displayed1");
    }
    /*error: a is not abstract and does not override abstract method display1() in hello*/
    //hence we also have to overrdie diplay1()
    public void display1(){}
}
class interfacemethodcheck{
    public static void main(String[] args){
        a b=new a();
        b.display();
    }
}