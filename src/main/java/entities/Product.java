package entities;

public class Product {
  int id;
  String name;
  double unitPrice;

  public Product(int id, String name, double unitPrice) {
    this.id = id;
    this.name = name;
    this.unitPrice = unitPrice;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + "]";
  }
}
