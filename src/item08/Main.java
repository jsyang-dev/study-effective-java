package item08;

public class Main {

    public static void main(String[] args) {
        try (Room room = new Room(7)) {
            System.out.println("Normal room");
        }

        new Room(99);
        System.out.println("Dirty room");
    }
}
