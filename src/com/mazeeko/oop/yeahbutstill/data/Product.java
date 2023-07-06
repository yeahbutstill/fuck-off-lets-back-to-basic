package com.mazeeko.oop.yeahbutstill.data;

public class Product {
  private String name;
  private Integer price;

  public Product() {}

  public Product(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;

    if (!getName().equals(product.getName())) return false;
    return getPrice().equals(product.getPrice());
  }

  @Override
  public int hashCode() {
    int result = getName().hashCode();
    result = 31 * result + getPrice().hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
  }
}
