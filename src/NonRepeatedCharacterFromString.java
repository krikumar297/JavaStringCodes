import java.util.Scanner;

public class NonRepeatedCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String :");
        String str = sc.nextLine();

        System.out.println("Your Answer is : "+FirstNonRepeatedCharacterFromString(str));
    }

    public static String FirstNonRepeatedCharacterFromString(String str){
        String result = "";
        for(int i = 0; i<str.length();i++){
            int count = 0;
            if(str.charAt(i) != ' '){
                for(int j = 0; j< str.length();j++){
                    if(str.charAt(i)==str.charAt(j) && i != j){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    result += str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
}
