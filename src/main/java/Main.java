import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        int answer = 0;
        for (int i =1; i <= num; i++) {
            answer = answer + i;
        }
        System.out.println(answer);
    }
}
