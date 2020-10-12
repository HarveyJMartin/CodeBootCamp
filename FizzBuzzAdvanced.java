import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter max number");
        int maxNum = Integer.parseInt(number.nextLine());

     

        String[] userMessages = {
            "Change multiples of 3 to Fizz?",
            "Change multiples of 5 to Buzz?",
            "Change multiples of 7 to Bang?",
            "Change multiples of 11 to Bong?",
            "Change multiples of 13 to Fezz?",
            "Change multiples of 17 to Fozz?",
        };

        boolean[] options = new boolean[userMessages.length];

        int[] modulus = new int[] {3,5,7,13,17};

        String[] toAdd = new String[] {"Fizz","Buzz","Bang","Fezz","Fozz"};

        for (int i = 0; i < userMessages.length; i++) {
            options[i] = getOption(userMessages[i]);
        }
        for (int i =1;i<maxNum+1;i++) {
            String result = "";
            for (int x=0;x<5;x++){
                if (i % modulus[x] == 0 && options[x]) result+=toAdd[x];
            }

            
            if (i % 11 == 0 && options[5]) result=("Bong");
            
            if (result.equals("")) System.out.println(i);
            else System.out.println(result);
        }
    }
    
    private static boolean getOption(String userMessage) {
        Scanner setting = new Scanner(System.in);
        System.out.println(userMessage);
        String output = setting.nextLine();
        return output.equalsIgnoreCase("yes");
    }
}