/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Minal
 */
public class Computer extends Player {
    public Computer() {
        super();
        this.Name = "Computer" + (int) (Math.random() * 50 + 1);
    }

    public Computer(String name) {
        super(name);
    }


    public static void main(String[] args) {
        Computer com = new Computer();
        System.out.println(com);
    }

}
