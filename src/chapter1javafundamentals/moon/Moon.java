package chapter1javafundamentals.moon;

public class Moon {
    public static void main(String[] args) {
        double earthWeight; // weight on earth
        double moonWeight; // weight on moon

        earthWeight = 165;
        moonWeight = earthWeight * 0.17;

        System.out.println(
                earthWeight + " earth-pounds is equivalent to " + moonWeight + " moon-pounds.");
    }
}
