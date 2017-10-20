import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me a number and I'll add it!");
        int inputNumber = scanner.nextInt();
        System.out.println("");
        int results = addition(inputNumber);
        System.out.println("I added it all up! Your sum is " + results);
    }

    public static int addition(int input) {
        int sum = 0;
        for(int x = 1; x <= input; x++ ){
            //System.out.println(x + "");
            sum = sum + x;}

        return sum;

    }
}
