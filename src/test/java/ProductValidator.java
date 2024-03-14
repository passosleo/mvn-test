import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entities.Product;
import services.ProductService;

public class ProductValidator {
  ProductService productService = new ProductService();

  @Test
  public void addProductNotNull() {
    Product example = new Product(1, "Golden Earring", 30);
    assertTrue(productService.addProduct(example));
  }

  @Test
  public void addProductNull() {
    Product example2 = new Product(0, null, 0);
    assertFalse(productService.addProduct(example2));
  }
}
