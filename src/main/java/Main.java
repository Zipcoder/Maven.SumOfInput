import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer for me to add");
        int number = input.nextInt();
        System.out.println("The sum of all integers between 1 and " + number + " is: \n" + quickMaffs(number));
        System.out.println("Quick Maffs");

    }

    public static int quickMaffs (int number){
        int answer = 0;
        for (int i = 1; i <= number; i++){
            answer = answer +i;
        }
        return answer;
    }
}
