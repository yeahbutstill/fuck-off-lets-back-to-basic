package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public enum JenisKlamin {
  LAKI_LAKI("L", "Laki-Laki"),
  PEREMPUAN("P", "Perempuan");

  private String symbol;
  private String name;

  JenisKlamin() {}

  JenisKlamin(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "JenisKlamin{"
        + "symbol='"
        + symbol
        + '\''
        + ", name='"
        + name
        + '\''
        + "} "
        + super.toString();
  }
}
