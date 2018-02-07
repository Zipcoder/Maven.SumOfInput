import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number: ");

        int input = scan.nextInt();
        int sum = 0;

        for(int i = 0; i <= input; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
