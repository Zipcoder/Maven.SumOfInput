import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int total = 0;
        int input;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a number >>");
            input = in.nextInt();
        }while(input<=0);

        for (int i = 1; i <= input; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
