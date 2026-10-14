
package com.example;

public class App {

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        App app = new App();

        int number = 7;

        System.out.println(number + " is " + app.checkEvenOdd(number));
    }
}
