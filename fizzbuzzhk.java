import java.util.Scanner;

public class fizzbuzz {

        public static void main(String[] args) {
            {
                Scanner input = new Scanner(System.in);

                int number;

                System.out.print("Enter a number for printing fizzbuzz:");
                number = input.nextInt();

                for (int i = 1; i <= number; i++) {
                    if (i % 3 == 0 && i % 5 == 0)
                        System.out.println("Fizz Buzz");
                    else if (i % 3 == 0)
                        System.out.println("Fizz");
                    else if (i % 5 == 0)
                        System.out.println("Buzz");
                    else
                        System.out.println(i);
                }
            }
        }
    }
