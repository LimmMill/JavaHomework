/* Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент Иванов получил 5 по предмету Математика.*/

package dz_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class zadacha_2 {
    public static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }
    public static void main(String[] args) throws IOException {
        File file = new File("dz_2\\jurnal.txt");
        if (!isFileExists(file)) {
            System.out.println("Файл не найден");            
        } 
        else {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                line = line.replace("\"", "")
                        .replaceAll("[, :]", " ")
                        .replace("фамилия", "Студент")
                        .replace("оценка", "получил")
                        .replace("предмет", "по предмету");
                sb.append(line);
                sb.append("\n");
            }
            br.close();
            System.out.println(sb);            
        }

    }
}
