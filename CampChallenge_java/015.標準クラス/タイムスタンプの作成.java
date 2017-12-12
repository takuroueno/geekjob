
import java.util.Date;
import java.util.Calendar;

class time {

    public static void main(String[] args) {
        // 当日の日時で日付情報を作成

        Calendar c = Calendar.getInstance();
        c.set(2016, 0, 1, 0, 0, 0);
        Date d = c.getTime();
        //Date day = sdf.parse("2016/1/1 0:0:0")

        System.out.println(d.getTime());

    }
}
