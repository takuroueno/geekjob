
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file2 extends file {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(fp);
        try (BufferedReader br = new BufferedReader(fr)) {
            System.out.print(br.readLine());
            br.close();
        }
    }
}
