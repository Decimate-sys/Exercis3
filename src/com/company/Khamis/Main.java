//Yunis khamis, csci 1660, Mr. Killoran, 1/30/20

/*Write a program that prompts a user to enter a temperature in Fahrenheit, converts it to Celsius, and displays the
Celsius temperature. Separate the code that collects user input, the code that converts temperatures, and the code that
displays the output into different methods. The program should repeat until the user enters a value less than -460
(approximately absolute zero).
 */
package com.company.Khamis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double temperature = getFarenheit();

        while (temperature>-460) {
            double celsius = tempFahrenheit(temperature);
            displayTemperature(celsius);
            temperature = getFarenheit();
        }
        System.out.println("The program is ending");

    }

    //method1
    static double tempFahrenheit(double f) {
        double value= ((f - 32) * 5 / 9);
        return value;
    }
    //method2
    static double getFarenheit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        return temperature;
    }
    //method3
    static void displayTemperature(double a){
        System.out.println("The temperature in degrees celcius is: " + a);

    }


}
