package demo;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        int phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number");
        phone = sc.nextInt();
        System.out.println("Enter your age");
        double age = sc.nextDouble();
        System.out.println("Enter your blood group");
        char blood = sc.next().charAt(0);
        System.out.println("Integer Value: " + phone);
        System.out.println("Double Value: " + age);
        System.out.println ("Character Value: " + blood);
    }
}

