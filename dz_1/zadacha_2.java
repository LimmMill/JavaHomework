/*Вывести все простые числа от 1 до 1000*/

package dz_1;
public class zadacha_2 {
    public static boolean is_simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
        is_simple(i);
        if (is_simple(i)) System.out.printf("%d ", i);
        }
        }
        
    }

