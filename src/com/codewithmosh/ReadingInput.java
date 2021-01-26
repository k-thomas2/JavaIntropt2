package com.codewithmosh;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner1.nextLine().trim(); //method chaining
        System.out.println("You are " + name);
    }
}
