package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator(new Adder());
        System.out.print("Результат сложения a и b: ");
        calculator.calc(a, b);
        calculator = new Calculator(new Subtractor());
        System.out.print("Результат вычитания a и b: ");
        calculator.calc(a, b);
        calculator = new Calculator(new Multiplier());
        System.out.print("Результат умножения a и b: ");
        calculator.calc(a, b);
        calculator = new Calculator(new Divider());
        System.out.print("Результат деления a и b: ");
        calculator.calc(a, b);
    }
}
