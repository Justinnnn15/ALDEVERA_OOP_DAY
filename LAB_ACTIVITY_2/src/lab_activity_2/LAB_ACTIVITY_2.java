package lab_activity_2;

import java.util.Scanner;

public class LAB_ACTIVITY_2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the message: ");
        String msg = input.nextLine();

        String[] resultWords = msg.split("\s+");

        boolean multiCap = false;

        for (String word : resultWords) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    multiCap = true;
                    break;
                }
            }
        }

        if (multiCap) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }

}
