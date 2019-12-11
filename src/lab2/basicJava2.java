package lab2;

import java.util.Scanner;

public class basicJava2 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name:");
//        String name = sc.nextLine();
//        System.out.print("Your name is " + name);
//
//        System.out.print("Enter your  email:");
//        String email = sc.nextLine();
//        System.out.print("Your email is "+ email);
//
//
//        System.out.print("Enter your  Age:");
//        String Age = sc.nextLine();
//        System.out.print("Your Age is "+ Age);

        //input integer and floating
        System.out.print("Enter an numder");
        int num = sc.nextInt();
        System.out.println("Your enterd number:" +num);

        System.out.print("Enter a real number: ");
        double d = sc.nextDouble();
        System.out.println(d);


    }
}
