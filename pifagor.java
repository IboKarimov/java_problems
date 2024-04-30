import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypothenus is " + c);
        scanner.close();
    }
}
