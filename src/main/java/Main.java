import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Write a number and we will give you the sum from 0 to it ...");


        SumOfInput sumOfInput = new SumOfInput();

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        sumOfInput.sumCalculation(userInput);


    }
}
