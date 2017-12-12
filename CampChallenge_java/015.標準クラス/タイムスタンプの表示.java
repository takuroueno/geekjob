
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date day = sdf.parse("2016-11-4 10:0:0");

        System.out.println(day.getTime());

        System.out.println(sdf.format(day));
        
        

    }
}
