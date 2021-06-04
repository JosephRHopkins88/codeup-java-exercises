package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of said circle?");
        Input in = new Input();

        // longer, more explicit way.
//        double userRadius = in.getDouble();
        // then plug this variable into the constructor to instantiate a new Circle object.
//        Circle c = new circle(userRadius);

        Circle c = new Circle(in.getDouble());

        System.out.printf("The area of the circle is: %.2f%n",c.getArea());
        System.out.printf("The circumference of the circle is: %.2f%n", c.getCircumference());

    }
}
