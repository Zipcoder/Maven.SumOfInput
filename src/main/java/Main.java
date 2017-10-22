import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prompt the user
        //test
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= userNumber; i++) {
            sum += userNumber;
            System.out.println(sum);
        }

    }
}
