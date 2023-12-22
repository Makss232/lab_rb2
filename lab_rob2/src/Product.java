
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Конструктор класу для ініціалізації полів
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Геттери для отримання значень полів
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //Перевизначений метод toString для коректного виведення об'єкта
    @Override
    public String toString() {
        return "Продукт: " + name + ", Ціна: " + price;
    }

    // Overridden method
    public void processData(Object data) {
        // Process data logic
    }

    // Static method
    public static void staticMethod() {
        // Static method logic
    }

    // Constructor overloading
    public Product() {
        // Default constructor
    }

    public Product(String name, int value) {
        this.name = name + " " + value;
    }
}