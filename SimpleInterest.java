import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount = ");
        double p = sc.nextDouble();
        System.out.print("Enter Interest Rate = ");
        double r = sc.nextDouble();
        System.out.print("Enter Time in years = ");
        int t = sc.nextInt();

        double si = (p*r*t)/100;
        System.out.println("Total interest = "+ si);
    }
}
//Simple Interest = P × r x t / 100
//P → Principal
//r → Interest Rate
//•t Time in Years