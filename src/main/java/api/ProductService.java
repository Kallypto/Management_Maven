package api;

import java.util.List;

import enity.Product;
import enity.User;

public interface ProductService {

    List<Product> getAllProducts();
    Integer getCountProducts();
    Product getProductName(String  productName);
    boolean isProductExistByName(String productName);
    boolean isProductOnWarehouse(String productName);
    boolean isProductExistById(Long productId);
}
