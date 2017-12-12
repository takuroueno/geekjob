
import java.util.Date;
import java.text.SimpleDateFormat;

public class DATE {

    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.print(sdf.format(now));
    }
}
