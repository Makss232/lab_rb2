import java.util.List;
import java.util.ArrayList;

class Category {
    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    // Метод для додавання продукту до категорії
    public void addProduct(Product product) {
        products.add(product);
    }
    // Метод для отримання списку продуктів в категорії
    public List<Product> getProducts() {
        return products;
    }

    public void printCategoryInfo() {
        System.out.println("Категорія: " + name);
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
    public Category() {
        // Default constructor
    }

    public Category(String name, int value) {
        this.name = name + " " + value;
    }
}