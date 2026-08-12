package krishna.javadevlife;

import java.util.Scanner;

public class ReverseStringUsingForLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
//Reverse a String Means ?
// 