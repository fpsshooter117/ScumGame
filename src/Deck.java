
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmy4988
 */
public class Deck
{

    boolean jokers;
    int head, end;
    Card[] deck;

    public Deck()
    {
        head=0;
        end=51;
        deck = new Card[52];
        jokers = false;
        for (int i = 0; i < 52; i++)
        {
            deck[i] = new Card(i + 1);
        }
    }

    public Deck(boolean jokers)
    {
        this.jokers = jokers;
        head=0;
        if (jokers)
        {
            end=53;
            deck = new Card[54];
            for (int i = 0; i < 52; i++)
            {
                deck[i] = new Card(i + 1);
            }
            deck[52] = new Card(0);
            deck[53] = new Card(0);
        }
        else
        {
            end=51;
            deck = new Card[52];
            this.jokers = jokers;
            for (int i = 0; i < 52; i++)
            {
                deck[i] = new Card(i + 1);
            }
        }

    }

    @Override
    public String toString()
    {
        int n = 0;
        String str = "";
        if (jokers)
        {
            n = 54;
        }
        else if (!jokers)
        {
            n = 52;
        }
        for (int i = 0; i < n; i++)
        {
            str += deck[i].toString() + "\n";
        }
        return str;
    }

    public void Shuffle()
    {
        int i = 0;
        ArrayList<Card> d = new ArrayList();
        Collections.addAll(d, deck);
        Collections.shuffle(d);
        for (Card c : d)
        {
            deck[i] = c;
            i++;
        }
    }

    public Card deal()
    {
        if(head>end)
            return null;
        Card card = deck[head];
        head++;
        return card;
    }
    public int getSize()
    {
        return deck.length;
    }
    public void setGameValue(int index,int value)
    {
        deck[index].setGameValue(value);
    }
    public Card getCard()//top card at head
    {
        return deck[head];
    }
    public Card getCard(int index)
    {
        return deck[index];
    }

    public static void main(String[] args)
    {
        Deck d = new Deck(true);
        System.out.println(d.toString());
        System.out.println(d.getSize());
        d.Shuffle();
        System.out.println(d.toString());
    }
}
