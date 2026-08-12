package krishna.hacker_rank_problem;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    public static void main(String[] args) {
       {
            Scanner sc = new Scanner(System.in);
           System.out.print("Enter the value of Breadth : ");
            B = sc.nextInt();
           System.out.print("Enter the value of  Height : ");
            H = sc.nextInt();
            if(B <= 0 || H <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
        if(B > 0 && H > 0){
            int area = B * H;
            System.out.println(area);

        }
    }
}
