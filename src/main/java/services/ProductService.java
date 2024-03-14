package services;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductService {
  List<Product> listProducts = new ArrayList<Product>();

  public boolean checkProduct(Product product) {
    if (product.getId() != 0
        && product.getName() != null && product.getName() != ""
        && product.getUnitPrice() != 0) {
      return true;
    }
    return false;
  }

  public boolean addProduct(Product product) {
    if (checkProduct(product)) {
      listProducts.add(product);
      return true;
    }
    return false;
  }
}
