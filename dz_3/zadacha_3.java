//3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class zadacha_3 {
       
    public static int getRandomNum() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        return (int) num;
        }
    
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {            
                list.add(getRandomNum());
            }
            System.out.println(list.toString()); 
            int min = list.get(0);
            int max = min;
            float mean = 0;            
            for (int i = 0; i < list.size(); i++) {
                if(min > list.get(i)) {
                    min = list.get(i);
                }
                if(max < list.get(i)) {
                    max = list.get(i);
                }
                mean += list.get(i);                
            }
            mean /= list.size();
            System.out.printf("Мин-е число равно %d\nМакс-е число равно %d\nСреднее арифметическое значение %.2f", min, max, mean);
        }
}

