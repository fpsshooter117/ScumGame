/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minal
 */
public class Player
{
    String Name, Title;
    int amount, inHand;
    Hand hand;
    
    
    public Player()
    {
        Name="Player";
        Title="";
        inHand=0;
        amount=13;
        hand = new Hand(amount);
    }
    public Player(String Name)
    {
        this.Name=Name;
        amount =13;
        Title="";
        inHand=0;
        hand = new Hand(amount);
    }
    public void setTitle(String Title)
    {
        this.Title=Title;
    }
    public void setPlayerHand(int amount)
    {
        hand = new Hand(amount);
        this.amount=amount;
    }
    public boolean dealPlayer(Card card)
    {
        if(inHand==amount)
        {
            System.out.println("hand is full");
            return false;
        }
        hand.addCard(card);
        inHand++;
        return true;
    }
    public String toString()
    {
        String s = "";
        
        s+="Player Name: "+Name+"\n"+"Cards:"+"\n";
        s+=hand.toString();
        return s;
                
    }
    public void sortHand()
    {
        //System.out.println(inHand);
        hand.sort(0,inHand-1);
    }
    
    public static void main(String[] args)
    {
        Player p = new Player("peter");
        p.setPlayerHand(13);
        p.dealPlayer(new Card(10));
        p.dealPlayer(new Card(5));
        p.dealPlayer(new Card(8));
        p.dealPlayer(new Card(9));
        System.out.println(p.toString());
        p.sortHand();
        System.out.println("\n"+p.toString());
    }
}
