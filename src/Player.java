/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Minal
 */
public class Player {
    protected String Name, Title;
    protected int amount, inHand;
    protected Hand hand;


    public Player() {
        Name = "Player";
        Title = "";
        inHand = 0;
        amount = 13;
        hand = new Hand(amount);
    }

    public Player(String Name) {
        this.Name = Name;
        this.amount = 13;
        this.Title = "";
        this.inHand = 0;
        this.hand = new Hand(amount);
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setHand(int amount) {
        this.hand = new Hand(amount);
        this.amount = amount;
    }

    public boolean dealCard(Card card) {
        if (inHand == amount) {
            System.out.println("hand is full");
            return false;
        }
        this.hand.addCard(card);
        this.inHand++;
        return true;
    }

    public String toString() {
        String s = "";

        s += "Player Name: " + Name + "\n" + "Cards:" + "\n";
        s += hand.toString();
        return s;

    }

    public void sortHand() {
        //System.out.println(inHand);
        hand.sort(0, inHand - 1);
    }

    public static void main(String[] args) {
        Player p = new Player("peter");
        p.setHand(13);
        p.dealCard(new Card(10));
        p.dealCard(new Card(5));
        p.dealCard(new Card(8));
        p.dealCard(new Card(9));
        System.out.println(p.toString());
        p.sortHand();
        System.out.println("\n" + p.toString());
    }
}
