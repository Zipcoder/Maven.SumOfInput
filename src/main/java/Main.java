import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int userNumber;
        int sum = 0;

        System.out.println("Enter a number!");
        Scanner input = new Scanner(System.in);
        userNumber = input.nextInt();

        for (int i = 0; i <= userNumber; i++){
            sum+= i;
        }

        System.out.println(sum);





    }
}
