import java.util.Scanner;
class Point{
    private double x;
    private double y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double slope(Point p2){
        double slope;
        slope=(p2.y-this.y)/(p2.x-this.x);
        return slope;
    }
}
public class W04_P2{         
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        System.out.print("Slope: "+p1.slope(p2));
    }
}