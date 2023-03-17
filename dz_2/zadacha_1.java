// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package dz_2;
import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class zadacha_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(zadacha_1.class.getName());
        FileHandler fh = new FileHandler("dz_2\\log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] arr = new int[]{7, 6, 1, 8, 5, 3, 9, 2, 4};
        int tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }       
            } 
            logger.info(String.format("Отсортирован элемент %s в массиве ", arr[i]) + Arrays.toString(arr));           
        }
        System.out.println(Arrays.toString(arr));
    }
    
}