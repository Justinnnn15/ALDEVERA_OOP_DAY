
package lab_activity_1;


import java.util.Scanner;


public class LAB_ACTIVITY_1 {

     static Scanner InputString = new Scanner(System.in);
     static Scanner InputInteger = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Enter full name: ");
        String name = InputString.nextLine();


        System.out.print("Enter age: ");
        int age = InputInteger.nextInt();


        System.out.print("Enter Gender: ");
        String gender = InputString.nextLine();


        System.out.print("Enter Full Address: ");
        String address = InputString.nextLine();


        System.out.print("Enter Civil Status: ");
        String status = InputString.nextLine();


        System.out.print("Enter # of brother/sister: ");
        int siblings = InputInteger.nextInt();
        InputString.nextLine();


        System.out.println("Full name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address " + address);
        System.out.println("Civil Status" + status);
        System.out.println("# of brothers/sister: " + siblings);

    }

}