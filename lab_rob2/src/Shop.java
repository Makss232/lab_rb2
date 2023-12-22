import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Shop {
    private List<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void printAllProducts(List<Category> categories) {
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                System.out.println(product.toString()); // using overridden toString()
            }
            if (!category.getProducts().isEmpty()) {
                System.out.println();
            }
        }
    }

    // New recursive method
    public void recursiveMethod(int n) {
        if (n <= 0) {
            return;
        }

        recursiveMethod(n - 1);
        System.out.println("Recursive call: " + n);
    }
}
