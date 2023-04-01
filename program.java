import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class program {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));

        createFile("TEXT");
    }

    static String buildString(int n, char c1, char c2) {
        String result = "";

        for (int i = 0; i < n / 2; i++) {
            result += c1;
            result += c2;
        }

        return result;
    }

    static void createFile(String input) {
        Path path = Path.of("file.txt");
        
        try {
            Files.createFile(path);
        } catch (Exception e) {
            System.out.println(e);
        }

        String result = "";
        for (int i = 0; i < 100; i++) {
            result += input;
        }

        try {
            Files.writeString(path, result);
        } catch (Exception e) {
            System.out.println(e);
        }
    
}
}