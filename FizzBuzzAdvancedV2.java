import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter max number");
        int maxNum = Integer.parseInt(number.nextLine());

        int[] modulus = new int[] {3,5,7,13,17};

        String[] toAdd = new String[] {"Fizz","Buzz","Bang","Fezz","Fozz"};   

        String[] userMessages = new String[6];
        for (int i=0;i<5;i++){
            userMessages[i] = "Change multiples of " + modulus[i] + " to " + toAdd[i] + "?";
        }
        userMessages[5] = "Change multiples of 11 to Bong?";

        boolean[] options = new boolean[userMessages.length];

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