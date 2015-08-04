
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmy4988
 */
public class Card implements Comparable<Card>
{

    int value, gameValue;
    String suite;
    Color color;
    int Cardindex;

    public Card(int Cardindex)//1-52 for cards
    {
        this.Cardindex = Cardindex;
        gameValue = getValue();
    }

    public Card(int Cardindex, int gameValue)
    {
        this.Cardindex = Cardindex;
        this.gameValue = gameValue;
    }

    public String getSuite()
    {
        if (Cardindex == 0)
        {
            suite = "Joker";
        }
        else if (Cardindex >= 1 && Cardindex <= 13)
        {
            suite = "Spade";
        }
        else if (Cardindex >= 14 && Cardindex <= 26)
        {
            suite = "Hearts";
        }
        else if (Cardindex >= 27 && Cardindex <= 39)
        {
            suite = "Clubs";
        }
        else
        {
            suite = "Diamonds";
        }
        return suite;
    }

    public int getValue()
    {
        if (Cardindex <= 13)
        {
            value = Cardindex;
        }
        else if (Cardindex <= 26)
        {
            value = Cardindex - 13;
        }
        else if (Cardindex <= 39)
        {
            value = Cardindex - 26;
        }
        else if (Cardindex <= 59)
        {
            value = Cardindex - 39;
        }
        return value;
    }

    public void color()
    {
        if (getSuite().equals("Club") || getSuite().equals("Spade") || getSuite().equals("Joker"))
        {
            color = Color.BLACK;
        }
        else
        {
            color = Color.RED;
        }
    }

    @Override
    public String toString()
    {
        String s = "" + getSuite();
        int v = getValue();
        switch (v)
        {
            case 0:
                s += "(" + getGameValue() + ")";
                break;
            case 1:
                s += "A";
                s += " (" + getGameValue() + ")";
                break;
            case 11:
                s += "J";
                s += " (" + getGameValue() + ")";
                break;
            case 12:
                s += "Q";
                s += " (" + getGameValue() + ")";
                break;
            case 13:
                s += "K";
                s += " (" + getGameValue() + ")";
                break;
            default:
                s += v;
                s += " (" + getGameValue() + ")";
        }
        return s;
    }

    public void setGameValue(int gameValue)
    {
        this.gameValue = gameValue;
    }

    public int getGameValue()
    {
        return gameValue;
    }

    public void paintThis(Graphics g)
    {

    }

    @Override
    public int compareTo(Card o)
    {
        return this.gameValue-o.getValue();
    }

    public static void main(String[] args) // this is to test the card class
    {
        Card c1 = new Card(1);
        Card c2 = new Card(22);
        //Card c3 = new Card(1);
        //Card c4 = new Card(22);
        //Card c5 = new Card(45);
        //Card c6= new Card(38);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.getValue());
        //System.out.println(c3.toString());
        //System.out.println(c4.toString());
        //System.out.println(c5.toString());
        //System.out.println(c6.toString());
    }

}
