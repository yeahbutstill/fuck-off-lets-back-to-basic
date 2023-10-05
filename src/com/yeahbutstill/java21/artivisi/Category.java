package com.yeahbutstill.java21.artivisi;

import java.io.Serial;
import java.io.Serializable;

public class Category implements Serializable {
  @Serial private static final long serialVersionUID = 5654879524136690958L;
  private String code;
  private String name;

  public Category() {}

  public Category(String code, String name) {
    this.code = code;
    this.name = name;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category category)) return false;

    if (getCode() != null ? !getCode().equals(category.getCode()) : category.getCode() != null)
      return false;
    return getName() != null ? getName().equals(category.getName()) : category.getName() == null;
  }

  @Override
  public int hashCode() {
    int result = getCode() != null ? getCode().hashCode() : 0;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Category{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
  }
}
