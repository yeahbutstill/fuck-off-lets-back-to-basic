package com.mazeeko.oop;

import java.util.List;

public class Flying extends Animal {
  // propertie atau field
  private List<Object> food;
  private String activity;

  // Di dalam class Java, kita bisa membuat constructor,
  // constructor adalah method yang akan dipanggil saat pertama kali Object dibuat
  public Flying() {}

  // Mirip seperti di method, kita bisa memberikan parameter pada constructor
  public Flying(List<Object> food, String activity) {
    this.food = food;
    this.activity = activity;
  }

  // Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau
  // return value
  public Flying(String name, String type, List<Object> food, String activity) {
    super(name, type);
    this.food = food;
    this.activity = activity;
  }

  // method
  public List<Object> getFood() {
    return food;
  }

  public void setFood(List<Object> food) {
    this.food = food;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Flying flying)) return false;
    if (!super.equals(o)) return false;

    if (getFood() != null ? !getFood().equals(flying.getFood()) : flying.getFood() != null) return false;
    return getActivity() != null ? getActivity().equals(flying.getActivity()) : flying.getActivity() == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getFood() != null ? getFood().hashCode() : 0);
    result = 31 * result + (getActivity() != null ? getActivity().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Flying{" +
            "food=" + food +
            ", activity='" + activity + '\'' +
            "} " + super.toString();
  }
}
