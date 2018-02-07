import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
            Scanner userNumber = new Scanner(System.in);
            System.out.println("Please enter an integer");
            int numb = userNumber.nextInt();
            int sum = 0;
            for(int i = 0; i<= numb; i++) {
                sum = sum + i;
            }
        System.out.println(sum);
    }


    }

