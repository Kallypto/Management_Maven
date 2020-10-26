package service;

import api.ProductService;
import enity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    List<Product> products;

    public ProductServiceImpl(){
        this.products = new ArrayList<Product>();
    }

    public ProductServiceImpl(List<Product> products){
        this.products = products;
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Integer getCountProducts(){
        return products.size();
    }

    public Product getProductName(String productName){
        for(Product product:products){
            if (product.getProductName().equals(productName)){
                return product;
            }
        }
        return null;
    }

    public boolean isProductExistByName(String productName){
        for(Product product:products){
            if(product.getProductName().equals(productName)){
                return true;
            }
        }
        return false;
    }

    public boolean isProductOnWarehouse(String productName){
        for(Product product:products){
            if(isProductExistByName(productName) && product.getProductCount()>0){
                return true;
            }
        }
        return false;
    }

    public boolean isProductExistById(Long productId){
        for(Product product:products){
            if(product.getId().equals(productId)){
                return true;
            }
        }
        return false;
    }
}
