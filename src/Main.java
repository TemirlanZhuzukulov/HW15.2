public class Main {
    public static void main(String[] args) {

        Circle circle= new Circle(Math.PI,20);
        System.out.println("Area:"+circle.area(Math.PI, circle.radius));
        System.out.println("circumference:"+Circle.circumference(Math.PI,circle.radius));
    }
}