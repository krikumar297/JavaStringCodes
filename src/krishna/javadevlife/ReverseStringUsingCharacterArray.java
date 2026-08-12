package krishna.javadevlife;

import java.util.Scanner;

public class ReverseStringUsingCharacterArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        System.out.print("Reversed String: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}