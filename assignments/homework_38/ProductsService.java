package homework_38;

import java.util.Scanner;

public class ProductsService {

    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public void addNewProduct(Product newProduct) {
        if(!productsRepository.existsByTitle(newProduct.getTitle())) {
            productsRepository.addNewProduct(newProduct);
        } else {
            System.err.println("Error: this product already exists.");
        }
    }

    public Product[] getAllProducts() {
        return productsRepository.getAllProducts();
    }
}
