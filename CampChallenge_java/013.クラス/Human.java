
import java.util.ArrayList;


abstract class Human {

    abstract int open();

    abstract boolean checkSum();

    abstract void setCard(ArrayList<Integer>input);

    ArrayList<Integer> myCards = new ArrayList<>();

}
