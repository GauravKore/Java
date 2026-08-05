import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args){
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("file not found ");
        }

    }
    private static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("abcd.txt");
    }
}