import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");

        int n = scan.nextInt();
//        int gaussian_sum = 1;
//
//
//        for (int i=2 ; i < n+1; i++){
//            // System.out.println("gaussian " + gaussian_sum + " i " + i);
//            gaussian_sum += i;
//
//        }

        int gaussian_sum = 0;


        for (int i=1 ; i < n+1; i++){
            // System.out.println("gaussian " + gaussian_sum + " i " + i);
            gaussian_sum += i;

        }





        System.out.println(gaussian_sum + " is the sum you seek.");



    }
}
