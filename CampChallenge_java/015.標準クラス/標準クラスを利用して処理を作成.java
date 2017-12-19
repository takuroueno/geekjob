
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class file3 {

    public enum MyEnum {
        Apple("青森"),
        banana("フィリピン"),
        orange("愛媛");
        
        // フィールドの定義
        private final String id;

        // コンストラクタの定義
        private MyEnum(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static void main(String[] args) throws IOException {
        Date now = new Date();

        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        File fp = new File("log");

        Date d = new Date();
        FileReader fr = new FileReader(fp);

        FileWriter fw = new FileWriter(fp);
        BufferedReader br = new BufferedReader(fr);

        String hogeId = MyEnum.Apple.getId();
        String Id = MyEnum.banana.getId(); 
        String I = MyEnum.orange.getId();

        fw.write(sdf.format(now) + "開始");
        fw.write("出社");

        fw.write(hogeId);
        fw.write(Id);
        fw.write(I);

        fw.write(sdf.format(d) + "終了");
        fw.close();

        System.out.println(br.readLine());

        br.close();

    }

}
