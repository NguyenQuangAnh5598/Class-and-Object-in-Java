import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getABC() {
        return "a = " + this.a + " , b = " + this.b + " , c = " + this.c;
    }
    public double getDiscriminant() {
       return b*b - (4*a*c);

    }
    public double  getRoot1() {
           return ((-b) + Math.sqrt(b*b-(4*a*c)))/(2*a);
    }
    public double  getRoot2() {
        return ((-b) - Math.sqrt(b*b-(4*a*c)))/(2*a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a vào đây: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b vào đây: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c vào đây: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0 ) {
            System.out.println("Phương trình bậc 2 có 2 nghiệm :");
            System.out.println("x1 = " + quadraticEquation.getRoot1() + "\t x2 = " + quadraticEquation.getRoot2());
        }
        else {
            if (delta == 0) {
                System.out.print("Phương trình bậc 2 có 1 nghiệm : x = " + quadraticEquation.getRoot1());
            }
            else {
                System.out.println("The equation has no roots");
            }
        }
    }

}
