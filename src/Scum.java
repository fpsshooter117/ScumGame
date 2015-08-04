/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minal
 */
public class Scum
{

    Deck deck;

    public Scum()
    {
        deck = new Deck(true);
    }

    public void setGameValues()
    {
        int cardValue=0;
        for (int i = 0; i < deck.getSize(); i++)
        {
            cardValue=deck.getCard(i).getValue();
            if (cardValue == 0)
            {
                deck.setGameValue(i, 14);
            }
            else if (cardValue == 1)
            {
                deck.setGameValue(i, 12);
            }
            else if(cardValue==2)
            {
                deck.setGameValue(i, 13);
            }
            else
            {
                deck.setGameValue(i, cardValue-2);
            }
        }
    }
    @Override
    public String toString()
    {
        return deck.toString();
    }
    
    public static void main(String[] args)
    {
        Scum s = new Scum();
        s.setGameValues();
        System.out.println(s.toString());
    }

}
