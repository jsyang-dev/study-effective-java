package item09;

import java.io.IOException;
import java.util.Objects;

public class Main {

    private static final String INPUT_FILE = "input.txt";
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) throws IOException {
        String path = Objects.requireNonNull(Main.class.getResource("")).getPath();

        File.copy(path + INPUT_FILE, path + OUTPUT_FILE);
        System.out.println(File.firstLineOfFile(path + OUTPUT_FILE, "default value"));
    }
}
