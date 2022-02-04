package chapter4ntroducinglassesbjectsandethods.classs.test;

public enum TestFor {
  AA("A"),
  BB("B"),
  CC("C");

  private final String shortCode;

  TestFor(String shortCode) {
    this.shortCode = shortCode;
  }

  public String getShortCode() {
    return shortCode;
  }
}
