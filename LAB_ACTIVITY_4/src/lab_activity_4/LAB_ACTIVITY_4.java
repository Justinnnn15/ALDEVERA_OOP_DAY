
package lab_activity_4;

import java.util.Scanner;


public class LAB_ACTIVITY_4 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.println("Choose editor type (1 for Print, 2 for Advanced):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            PrintTextEditor editor = new PrintTextEditor(initialText);
            System.out.println("Enter code:");
            int code = scanner.nextInt();
            if (code == 1) {
                editor.print();
                System.out.println("SUCCESS");
            }
        } else if (choice == 2) {
            AdvancedTextEditor editor = new AdvancedTextEditor(initialText);
            System.out.println("Enter code:");
            int code = scanner.nextInt();
            if (code == 1) {
                editor.append("New Text");
                System.out.println("SUCCESS");
            } else if (code == 2) {
                editor.print();
                System.out.println("SUCCESS");
            } else if (code == 3) {
                editor.undo();
                System.out.println("SUCCESS");
            }
        }

        scanner.close();
    }
    }
    

