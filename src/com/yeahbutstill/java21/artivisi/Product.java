package com.yeahbutstill.java21.artivisi;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

// implement ini menyatakan bahwa kelas kita ini aman untuk di serializable
public class Product implements Serializable {
  @Serial private static final long serialVersionUID = 6969508081853909783L;
  // biasanya jarang dipake, kebanyakan di jadiin JSON atau Protobuf
  // nah biasanya kelas yang aman ini yang menyimban value saja atau value object
  private String code;
  private String name;
  private transient BigDecimal price; // menyatakan jangan di serializ
  private Category category;

  public Product() {}

  public Product(String code, String name, BigDecimal price, Category category) {
    this.code = code;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;

    if (getCode() != null ? !getCode().equals(product.getCode()) : product.getCode() != null)
      return false;
    if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null)
      return false;
    if (getPrice() != null ? !getPrice().equals(product.getPrice()) : product.getPrice() != null)
      return false;
    return getCategory() != null
        ? getCategory().equals(product.getCategory())
        : product.getCategory() == null;
  }

  @Override
  public int hashCode() {
    int result = getCode() != null ? getCode().hashCode() : 0;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
    result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Product{"
        + "code='"
        + code
        + '\''
        + ", name='"
        + name
        + '\''
        + ", price="
        + price
        + ", category="
        + category
        + '}';
  }
}
