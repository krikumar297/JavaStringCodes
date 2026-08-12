package krishna.hacker_rank_problem;

import java.util.Scanner;

public class End_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()){
            System.out.println(count+" "+sc.nextLine());
            count++;
        }
    }
}
