
import static java.lang.System.out;
import java.util.ArrayList;
public class User extends Human {

    @Override
    int open() {
        int total = 0;//合計値

        //手札の数の合計値
        for (int i = 0; i < myCards.size(); i++) {
            // 「i」ではない
            total = total + myCards.get(i);
        }
        out.print(total);
        return total;

    }

    @Override
    boolean checkSum() {
        int c = 11;
        int total = 0;//合計値

        //手札の数の合計値
        for (int i = 0; i < myCards.size(); i++) {
            total = total + myCards.get(i);
        }
        //if else
        return c > total;

    }

    @Override
    void setCard(ArrayList<Integer> input) {
        for (int i = 0; i < input.size(); i++) {
            myCards.add(input.get(i));
        }

    }

    void open(ArrayList<Integer> deal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Integer> myCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
