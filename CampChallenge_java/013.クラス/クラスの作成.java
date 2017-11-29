/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uenotakuro
 */
public class Human {

    //field
    public String name = "";
    public int age = 0;
    
    

    public void setHuman(String n, int a) {

        this.name = n;
        this.age = a;
    }

    void printHuman() {

        // aiueo と表示される
        // System.out.print("aiueo");
        System.out.println(name);
        System.out.println(age);

    }
    

}

class Test {

    public static void main(String[] args) {

        Human hito = new Human();

        
        hito.age = 40;
        hito.name = "suzuki";
        hito.printHuman();
        
        
        
        
        hito.setHuman("添田亮司", 34);

        //Human クラスのインスタンスの hito 変数を使って
        //printHumanメソッドを呼び出す
        
        hito.printHuman();
        
Human hito2 = new Human();



 hito.setHuman("aoki", 22);
        hito.printHuman();
        
        

    }

}
