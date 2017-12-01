/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uenotakuro
 */
public class person extends Human {

    //String msg = "講師の" + this.name + "です。講義を始めます。";

}

class Test2 {

    public static void main(String[] args) {

        Human hito = new Human();
        hito.setHuman("添田亮司", 34);

        hito.setHuman("", 0);
        hito.printHuman();

    }
}
