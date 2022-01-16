package impl;

public interface InterfaceA {

    public void methodA(); // interface method(does not have a body)

    public void methodB(); // interface method(does not have a body)

}

class KelasB implements InterfaceA {
    public void methodA() {
        // The body of methodA() is provided here
        System.out.println("");
    }

    public void methodB() {
        // The body of methodB() is provided here
        System.out.println("");
    }
}
