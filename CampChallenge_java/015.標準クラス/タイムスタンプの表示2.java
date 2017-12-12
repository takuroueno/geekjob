
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class time3 {

    public static void main(String[] args) {

        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date day = null;
        try {
            day = sdf.parse("2015-1-1 0:0:0");
        } catch (ParseException ex) {
            System.out.print("エラー発生");
        }

        // System.out.println(sdf.format(day));
        SimpleDateFormat sd
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = null;
        try {
            time = sd.parse("2015-12-31 23:59:59");
        } catch (ParseException ex) {
            System.out.print("エラー発生");
        }

        //  System.out.println(sd.format(time));
        System.out.println(time.getTime() - day.getTime());

    }
}
