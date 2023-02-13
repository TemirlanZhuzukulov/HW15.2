import java.util.Scanner;

public class Circle {

    double PI;
    int radius;

    static double area(double a,int b){
        double area= a*(b*b);
        return area;
    }
    static  double circumference(double a, int b){
     double  circumference = a*2*b;
     return circumference;
    }

    public Circle( double PI, int radius) {

        this.PI = PI;
        this.radius = radius;
    }


}
