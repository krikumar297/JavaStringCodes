import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("After removing duplicates : "+RemoveDuplicateChar(str));

    }
    public static String RemoveDuplicateChar(String str){
        String result = "";
        for(int i = 0 ; i < str.length(); i++){
            int count = 0;
            if(str.charAt(i) != ' '){
                for(int j = 0 ; j < str.length(); j++){
                    if(str.charAt(i)==str.charAt(j) && (i != j)){
                        count++;
                        break;
                    }
                }

            }
            if(count == 0){
                result += str.charAt(i);
            }

        }
        return result;
    }
}
