import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        int decision;
        int num1, num2, result = 0;

        System.out.println("Welcome to the calculator\n-------------------------------");

        System.out.println("1.Addition\n2.Minus\n3.Multilication\n4.Division\n-------------------------------");

        System.out.print("Enter your choice[1,2,3,4] >> ");
        decision = scanner.nextInt();
        if (decision > 4) {
            System.out.println("You did smth wrong");
        }
        else{
            System.out.print("Enter num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter num2: ");
            num2 = scanner.nextInt();

            switch(decision){
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = minus(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = division(num1, num2);
                default:
                    break;
            }
            System.out.println("The answer is " + result);
            scanner.close();
        }
    }
    static int add(int num1, int num2){
        return num1 + num2;
    }
    static int minus(int num1, int num2){
        return num1 - num2;
    }
    static int multiply(int num1, int num2){
        return num1 * num2;
    }
    static int division(int num1, int num2){
        return num1 / num2;
    }

}
