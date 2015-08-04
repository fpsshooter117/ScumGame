/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minal
 */
public class Sort
{
    public void sort(Card arr[], int low, int high)
    {
        if (arr == null || arr.length == 0)
        {
            return;
        }
        if (low >= high)
        {
            return;
        }
        //picks the pivot
        int middle = low + (high - low) / 2;
        Card pivot = arr[middle];
        //System.out.println(" the pivot is "+pivot);

        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            while (arr[i].getGameValue() < pivot.getGameValue())
            {
                i++;
            }
            while (arr[j].getGameValue() > pivot.getGameValue())
            {
                j--;
            }
            if (i <= j)
            {
                Card temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
