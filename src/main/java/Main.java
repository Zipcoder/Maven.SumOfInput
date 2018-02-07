/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {
// this is mine now!
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

 // lets get that input
        System.out.println("What is your number?");
        int input = in.nextInt();
        int newInput = 0;

        for (int i = 0; i <= input; i++) {
            newInput = newInput + i;
        }
        System.out.println("Your total is " + newInput);
    }
}
