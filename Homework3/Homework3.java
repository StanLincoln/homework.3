package Homework3;

import java.util.Scanner;

public class Homework3 {
//    № 1
//    Создайте строку через new - I study Basic Java!
//    Распечатать пред-последний символ строки. Используем метод String.charAt().
//    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//    Вырезать строку Java c помощью метода String.substring().
//    Заменить все символы “а” на “о”.
//    Преобразуйте строку к верхнему регистру.
//    Преобразуйте строку к нижнему регистру.
//
//    № 2
//    Создайте программу, в которой нужно ввести 2 параметра, сделайте  операции с математическими операциями +, -, *, /
//    Результат распечатайте в консоль

    public static void main(String[] args) {
        String myStr = "I study Basic Java!";
        System.out.println(myStr.charAt(myStr.length()-2));
        System.out.println(myStr.contains("Java"));
        System.out.println(myStr.substring(14, 18));
        System.out.println(myStr.replace('a', 'o'));
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите два числа:  ");
        int myInt1 = myScanner.nextInt();
        int myInt2 = myScanner.nextInt();
        System.out.println("Сумма чисел = " + (myInt1+myInt2));
        System.out.println("Разница чисел = " + (myInt1-myInt2));
        System.out.println("Произведение чисел = " + (myInt1*myInt2));
        System.out.println("Деление чисел = " + (myInt1/myInt2));
    }
}
