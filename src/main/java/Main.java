/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;


public class Main {



    public static void main(String[] args){

        Scanner newScan = new Scanner(System.in);

        System.out.print("Please enter a number to calculate: ");

        int usrNumber = newScan.nextInt();

        int numToCalc = 0;

        for(int x = usrNumber; x > 0; --x  ){
            numToCalc +=x;

        }
        System.out.print("Your total is: " + numToCalc );
    }
}
