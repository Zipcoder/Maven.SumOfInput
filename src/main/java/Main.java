import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Insert Number here");

        int test = in.nextInt();

        int result = 0;


        for (int i=0;i <=test; i++){
            result +=i;
            System.out.println(result);
        }






    }
}
