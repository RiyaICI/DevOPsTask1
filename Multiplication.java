import java.util.Scanner;

public class Multiplication {
        public static void main(String[] args) {
                int n1,n2;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter first number ===> ");
                n1 = input.nextInt();
                System.out.println("Enter second number ===> ");
                n2 = input.nextInt();
                System.out.println("Multiplication is ===> "+(n1*n2));
        }
}
