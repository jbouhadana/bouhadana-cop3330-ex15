/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        String password = "JeremyIsTheKing";

        System.out.print("What is the password? ");
        String attemptpassword = jb.nextLine();

        if(attemptpassword.equals(password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

    }
}
