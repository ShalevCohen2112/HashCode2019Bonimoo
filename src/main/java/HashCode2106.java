import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HashCode2106 {



    public static void main(String[] args) {
        readFile("./src/main/resources/test.txt");
    }


    public static void readFile(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
