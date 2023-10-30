package homework_38;

import java.util.Arrays;

public class ProductsRepository {
    private final int MAX_PRODUCT_CAPACITY = 10;
    private Product[] productStorage;
    private int productCount = 0;

    public ProductsRepository() {
        this.productStorage = new Product[MAX_PRODUCT_CAPACITY];
    }

    public void addNewProduct(Product newProduct) {
        productStorage[productCount] = newProduct;
        productCount++;
    }

    public Product[] getAllProducts() {
        return Arrays.copyOf(productStorage, productCount);
    }

    public boolean existsByTitle(String title) {
        for (int i = 0; i < productCount; i++) {
            if(productStorage[i].getTitle().equals(title)) return true;
        }

        return false;
    }
}
