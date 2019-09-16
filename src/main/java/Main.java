import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = Integer.parseInt(firstNumber.nextLine());
        System.out.println(n+1);


    }
}
