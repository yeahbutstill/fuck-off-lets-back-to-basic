package com.mazeeko.oop;

import java.util.ArrayList;

public class Flying extends Animal {
  private ArrayList<Object> food;
  private String activity;

  public Flying() {}

  public Flying(ArrayList<Object> food, String activity) {
    this.food = food;
    this.activity = activity;
  }

  public Flying(String name, String type, ArrayList<Object> food, String activity) {
    super(name, type);
    this.food = food;
    this.activity = activity;
  }

  public ArrayList<Object> getFood() {
    return food;
  }

  public void setFood(ArrayList<Object> food) {
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
