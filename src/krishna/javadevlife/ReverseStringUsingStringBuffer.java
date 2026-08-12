package krishna.javadevlife;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rev = new StringBuffer(str)
                .reverse()
                .toString();

        System.out.println("Reversed String: " + rev);
    }
}