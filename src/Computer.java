/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minal
 */
public class Computer extends Player
{
    public Computer()
    {
        super();
    }
    
    
    
    public static void main(String[] args)
    {
        Computer com = new Computer();
        com.dealPlayer(new Card(23));
        com.dealPlayer(new Card(1));
        com.dealPlayer(new Card(12));
        com.dealPlayer(new Card(11));
    }
    
}
