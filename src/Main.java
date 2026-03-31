import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World \n" +
                "Lets make simple calculator and\n" +
                "Temperature conversion\n");

           Scanner input =  new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double firstNumber = input.nextDouble();
        System.out.println("Enter Second Number: ");
        double  secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Sum is: "+ sum);
        System.out.println("Subtraction is: "+ subtraction);
        System.out.println("Multiplication is: "+ multiplication);
        System.out.println("Division is: "+ division);


        System.out.println("\nEnter Temperature in Celsius:");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit is: "+ fahrenheit);
        }
    }
