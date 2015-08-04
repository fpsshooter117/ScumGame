
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minal
 */
public class Hand
{

    int limit;
    int next;
    int amount;
    Card[] Hand;
    Quicksort<Card> sorter;

    public Hand(int limit)
    {
        this.limit = limit;
        next = 0;
        amount = 0;
        Hand = new Card[limit];
        sorter=new Quicksort();

    }

    public void sort(int low, int high)
    {
        sorter.sort(Hand, low, high);
    }
    public void sort()
    {
        sorter.sort(Hand);
    }

    public void addCard(Card card)
    {
        Hand[next] = card;
        amount++;
        next++;
    }

    public void addCard(int cardindex)
    {
        Hand[next] = new Card(cardindex);
        amount++;
        next++;
    }

    public void printHand()
    {

    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i < Hand.length; i++)
        {
            if (Hand[i] == null)
            {
                break;
            }
            s += "[" + i + "]" + Hand[i].toString() + "\n";
        }
        return s;
    }

    public static void main(String[] args)
    {
        Hand h = new Hand(6);

        h.addCard(10);
        h.addCard(9);
        h.addCard(11);
        h.addCard(12);
        h.addCard(13);
        h.addCard(1);

        System.out.println(h.toString());

        h.sort(0,5);

        System.out.println(h.toString());
    }

}
