// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package dz_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zadacha_1 {

    public static List<Integer> reversList(LinkedList<Integer> list) {       
        LinkedList<Integer> reverslist = new LinkedList<>(); 
        for (int j = list.size() - 1; j >= 0; j--) {
            reverslist.addLast(j);
        }
        return reverslist;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер списка:");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        LinkedList<Integer> list = new LinkedList<>(); 
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(reversList(list));        
    }
}


