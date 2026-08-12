import java.util.Scanner;

public class LastNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Last Non Repeated character is : "+ LastNonRepeatedChar(str));

    }
    public static String LastNonRepeatedChar(String str){
        String result = "";
        for(int i = str.length()-1;i != 0; i--){
            int count = 0;
            if(str.charAt(i) != ' '){
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j) && i != j){
                        count++;
                        break;
                    }
                }
                if(count == 0 ){
                    result += str.charAt(i);
                    break;
                }
            }
        }
        return result;

    }
}
