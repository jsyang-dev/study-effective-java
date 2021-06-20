package item10;

public class Main {

    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber(2, 1234, 5678);
        PhoneNumber pn2 = new PhoneNumber(2, 1234, 5678);
        PhoneNumber pn3 = new PhoneNumber(2, 2345, 6789);

        System.out.println("pn1.equals(pn2): " + pn1.equals(pn2));
        System.out.println("pn1.equals(pn3): " + pn1.equals(pn3));
    }
}
