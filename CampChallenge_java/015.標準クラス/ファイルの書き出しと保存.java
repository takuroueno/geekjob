
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {

    static File fp = new File("ueno");
//継承
    public static void main(String[] args) throws IOException {

        try (FileWriter fw = new FileWriter(fp)) {
            fw.write("上野拓朗です");
            //自動的にcloset
        }
    }
}
