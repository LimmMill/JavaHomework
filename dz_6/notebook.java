package dz_6;

public class notebook {
    int id;
    String brand;
    int ram;
    int SSD;
    String OS;
    String color;

    public notebook(int id, String brand, int ram, int SSD, String OS, String color) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.SSD = SSD;
        this.OS = OS;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, ОЗУ: %d Гб, жесткий диск: %d Гб, операционная система: %s, цвет: %s", brand, ram, SSD, OS, color);
    }
}
