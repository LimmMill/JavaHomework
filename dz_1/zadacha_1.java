/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

package dz_1;

import java.util.Scanner;

public class zadacha_1 {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            result += i; 
            factorial *= i;
        }
        System.out.printf("Теугольное число равно %d \n", result);
        System.out.printf("Факториал числа %d равен %d \n", n, factorial);   
        }
    }
 
