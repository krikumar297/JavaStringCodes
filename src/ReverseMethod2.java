import java.util.Scanner;

public class ReverseMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println("Your reverse String :"+sb);
    }
}
