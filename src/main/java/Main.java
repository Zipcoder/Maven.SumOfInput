/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args){
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int inputNumber = input.nextInt();
        for(int i=1;i<=inputNumber;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
