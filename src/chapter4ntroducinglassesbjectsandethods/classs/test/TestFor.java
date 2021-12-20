package chapter4ntroducinglassesbjectsandethods.classs.test;

public enum TestFor {
    AA("A"),
    BB("B"),
    CC("C");

    TestFor(String shortCode) {
        this.shortCode = shortCode;
    }

    private final String shortCode;

    public String getShortCode() {
        return shortCode;
    }
}
