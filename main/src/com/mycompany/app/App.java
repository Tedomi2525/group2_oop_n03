package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 2);
        System.out.println(book);

        Time time = new Time();
        System.out.println(time);

        Recursion recursion = new Recursion();
        long result = recursion.factorial(5);
        System.out.println("Factorial of 5 is: " + result);

        NNCollection nnCollection = new NNCollection();
        nnCollection.findNumber("George Orwell");
        nnCollection.findNumber("Quan");
        System.out.println(nnCollection);
    }
}
