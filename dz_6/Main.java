package dz_6;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
   
    public static void Filter(Set<notebook> notebooks) {
        System.out.println("\nВведите параметр фильтра для поиска:\n1 - Объем ОЗУ\n2 - Объем жесткого диска\n3 - Операционная система\n4 - Цвет\n5 - Бренд\n0 - Выход.");
        Scanner iScanner = new Scanner(System.in);
        String menu = iScanner.nextLine();
        while (!menu.equals("0")) {
            switch (menu) {
                case "1":
                    System.out.println("Введите объем ОЗУ: 4, 8, 16 или 32 Гб.");
                    Integer ram = Integer.parseInt(iScanner.nextLine());
                    for (var element : notebooks) {
                        if (element.ram == ram)
                            System.out.println(element);
                    }
                    break;

                case "2":
                    System.out.println("Введите объем жесткого диска: 128, 256, 512 Гб.");
                    Integer SSD = Integer.parseInt(iScanner.nextLine());
                    for (var element : notebooks) {
                        if (element.SSD == SSD)
                            System.out.println(element);
                    }
                    break;

                case "3":            
                System.out.println("Введите наименование операционной системы: Linux, iOS, Windows");
                    String OS = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.OS.toLowerCase().equals(OS))
                            System.out.println(element);
                    }
                    break;

                case "4":
                    System.out.println("Введите цвет ноутбука: black, grey, red, white.");
                    String color = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.color.equals(color))
                            System.out.println(element);
                    }
                    break;
                case "5":
                    System.out.println("Введите бренд производителя: Apple, HP, Asus, Acer, Lenovo.");
                    String brand = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.brand.toLowerCase().equals(brand))
                            System.out.println(element);
                    }
                    break;
            }
            System.out.println(
                    "\nВведите параметр фильтра для поиска:\n1 - Объем ОЗУ\n2 - Объем жесткого диска\n3 - Операционная система\n4 - Цвет\n5 - Бренд\n0 - Выход.");
            menu = iScanner.nextLine();
        }
        iScanner.close();
    }

    public static void main(String[] args) {

        notebook note1 = new notebook(1, "Acer", 4, 128, "Linux", "grey");
        notebook note2 = new notebook(2, "HP", 8, 256, "Windows", "black");
        notebook note3 = new notebook(3, "Asus", 32, 512, "Windows", "red");
        notebook note4 = new notebook(4, "Lenovo", 16, 128, "Windows", "white");
        notebook note5 = new notebook(5, "Apple", 32, 512, "iOS", "grey");
        notebook note6 = new notebook(6, "HP", 16, 128, "Windows", "white");
       

        Set<notebook> notebooks = new HashSet<notebook>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        notebooks.add(note4);
        notebooks.add(note5);
        notebooks.add(note6);
    
        Filter(notebooks);
    }
}
