package service;


import api.ProductService;
import enity.Boots;
import enity.Cloth;

import org.junit.Test;
import org.junit.Assert;

import java.sql.Struct;
import java.util.List;
import java.util.ArrayList;

import enity.Product;


public class ProductServiceTest {

    @Test
    public void testGetAllProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));
        products.add(new Boots(1l, "Sneakers", 250f, 0.8f, "Black", 3, 46, false));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();

        Assert.assertEquals(products, productsFromTestClass);
    }

    @Test
    public void testGetCountProductsWithProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));
        products.add(new Boots(1l, "Sneakers", 250f, 0.8f, "Black", 3, 46, false));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        int result = productService.getCountProducts();

        Assert.assertEquals(result, 2);
    }

    @Test
    public void testGetCountProductsWithoutProducts(){
        ProductServiceImpl productService = new ProductServiceImpl();

        int result = productService.getCountProducts();

        Assert.assertEquals(result, 0);
    }

    @Test
    public void testGetProductNameExist(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));
        products.add(new Boots(1l, "Sneakers", 250f, 0.8f, "Black", 3, 46, false));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product result = productService.getProductName("Sneakers");

        Assert.assertEquals(result, result);
    }

    @Test
    public void testGetProductNameNotExist(){
        ProductServiceImpl productService = new ProductServiceImpl();

        Product result = productService.getProductName("Brak");

        Assert.assertEquals(result, null);
    }

    @Test
    public void testIsProductOnWarehouseWhenIs(){
        List<Product> products = new ArrayList<Product>();
        Cloth tshirt = new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton");
        products.add(tshirt);

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductOnWarehouse = productService.isProductOnWarehouse("T-shirt");

        Assert.assertTrue(isProductOnWarehouse);
    }

    @Test
    public void testIsProductOnWarehouseWhenNotIs(){
        List<Product> products = new ArrayList<Product>();
        Cloth tshirt = new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 0, "L", "Cotton");
        products.add(tshirt);

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductOnWarehouse = productService.isProductOnWarehouse("T-shirt");

        Assert.assertFalse(isProductOnWarehouse);
    }

    @Test
    public void testIsProductExistByNameTrue(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductExist = productService.isProductExistByName("T-shirt");

        Assert.assertTrue(isProductExist);
    }

    @Test
    public void testIsProductExistByNameFalse(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductExist = productService.isProductExistByName("Brak");

        Assert.assertFalse(isProductExist);
    }

    @Test
    public void testIsProductExistByIdTrue(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductExist = productService.isProductExistById(1l);

        Assert.assertTrue(isProductExist);
    }
    @Test
    public void testIsProductExistByIdFalse(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-shirt", 70.5f, 0.5f, "Red", 2, "L", "Cotton"));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductExist = productService.isProductExistById(2l);

        Assert.assertFalse(isProductExist);
    }

}
