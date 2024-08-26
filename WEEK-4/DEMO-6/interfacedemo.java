interface geoAnalyser{
    final static float pi=3.14159f;
    float area();
    float perimeter();
}
class circle implements geoAnalyser{
    float radius;
    circle(float r){
        radius=r;
    }
    public float area(){ //should be public!  attempting to assign weaker access privileges; was public
        return (pi*radius*radius);
    }
    public float perimeter(){
        return (2*pi*radius);
    }
}
class rectangle implements geoAnalyser{
    float length,width;
    rectangle(float l,float w){
        length=l;
        width=w;
    }
    public float area(){
        return (width*length);
    }
    public float perimeter(){
        return (2*(width+length));
    }
}

class interfacedemo{
    public static void display(float x,float y){
        System.out.println("Area: "+x+" Perimeter: "+y);
    }
    public static void main(String[] args){
        circle c=new circle(5);
        rectangle r=new rectangle(5,10);
        display(c.area(),c.perimeter());
        display(r.area(),r.perimeter());
    }
}