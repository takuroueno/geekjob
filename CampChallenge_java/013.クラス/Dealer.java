
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;

public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<>();

    public Dealer() {
//if 11~13=10       1=1||11
        for (int sum = 1; sum <= 13; ++sum) {
            for (int num = 1; num <= 4; ++num) {
               
                cards.add(sum);
            }
        }
    }

    /*
    ディーラーはカードを自分自身を含めた参加者全員に2枚ずつ配る
     */
    public ArrayList<Integer> deal() {
        ArrayList<Integer> dealC = new ArrayList<>();

        for (int sum = 1; sum <= 2; ++sum) {
            Collections.shuffle(cards);
            dealC.add(cards.get(0));
            cards.remove(0);
        }
        return dealC;
    }

    /*
    カードをもう1枚引く。

     */
    public ArrayList<Integer> hit() {
        ArrayList<Integer> hitC = new ArrayList<>();
        Collections.shuffle(cards);
        hitC.add(cards.get(0));

        cards.remove(0);

        return hitC;
    }

    /*
    手札の合計ちを計算して戻り値にする。
     */
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
        int c = 17;
        int total = 0;//合計値

        //手札の数の合計値
        for (int i = 0; i < myCards.size(); i++) {
            total = total + myCards.get(i);

        }
        if (c > total) {
            return true;
        } else {
            return false;
        }

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
