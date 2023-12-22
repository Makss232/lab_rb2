import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p1 = new Product("Молоко", 20.0);
        Product p2 = new Product("Хліб", 10.0);
        Product p3 = new Product("Цукерки", 30.0);

        Category c1 = new Category("Продукти харчування");
        c1.addProduct(p1);
        c1.addProduct(p2);
        c1.addProduct(p3);

        Shop shop = new Shop();
        shop.addCategory(c1);

        shop.printAllProducts(shop.getCategories());

        System.out.println("Введіть назву продукту:");
        String productName = scanner.nextLine();

        Product userProduct = findProduct(shop.getCategories(), productName);

        if (userProduct != null) {
            System.out.println("Ціна за 1 кг " + userProduct.getName() + ": " + userProduct.getPrice());

            System.out.println("Введіть кількість кілограмів:");
            double weight = scanner.nextDouble();

            double totalPrice = calculateTotalPrice(userProduct.getPrice(), weight);
            System.out.println("Загальна ціна: " + totalPrice);
        } else {
            System.out.println("Продукт не знайдено у магазині.");
        }

        // Calling recursive method
        shop.recursiveMethod(3);

        // Calling overridden and overloaded methods
        c1.processData("Data");
        c1.staticMethod();
        p1.processData("Data");
        p1.staticMethod();
    }

    public static Product findProduct(List<Category> categories, String productName) {
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                if (product.getName().equalsIgnoreCase(productName)) {
                    return product;
                }
            }
        }
        return null;
    }

    public static double calculateTotalPrice(double pricePerKg, double weight) {
        return pricePerKg * weight;
    }
}