
public class Equation {
    public static void main(String[] args) {
     int a = 2, b = 4, c = 2;
     System.out.println("a,b,c are Real.");
     calculateRoot(a,b,c);
    }
    public static void calculateRoot(float a, float b, float c) {
        double x1, x2;
        float delta = b * b - 4 * a * c;

        if(a == 0)
            calculateRoot(b,c);

        else if (delta == 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.print("double root : " + x1);
        }

        else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("roots : " + x1 + " " + x2);
        }

        else
            System.out.println("Equasion doesn't have any roots.");
    }
    public static void calculateRoot(float a, float b) {
        if(a == 0)  System.out.print("function is constans.");
        else System.out.print("root : " + -b/a);
    }
}