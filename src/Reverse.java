import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();
        int len = str.length();

        for(int i = len-1; i >= 0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
