package com.javaintro;

public class TestDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {


            System.out.println("Main method started!");

            // Load Java built-in classes
            System.out.println(Class.forName("java.lang.String"));
            System.out.println(Class.forName("java.lang.System"));

            // Load your own class
            System.out.println(Class.forName("com.javaintro.Welcome"));

            // Load MySQL Driver
            System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

            System.out.println("Driver Loaded Successfully.");



    }
}