/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minal
 */
public class Quicksort<E extends Comparable<E>>
{

    private E[] numbers;
    private int number;

    public void sort(E[] values)
    {
        // check for empty or null array
        if (values == null || values.length == 0)
        {
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    public void sort(E[] values, int low, int high)
    {
        // check for empty or null array
        if (values == null || values.length == 0)
        {
            return;
        }
        this.numbers=values;
        quicksort(low, high);
    }

    private void quicksort(int low, int high)
    {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        E pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j)
        {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i].compareTo(pivot) < 0)
            {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j].compareTo(pivot) > 0)
            {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j)
            {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
        {
            quicksort(low, j);
        }
        if (i < high)
        {
            quicksort(i, high);
        }
    }

    private void exchange(int i, int j)
    {
        E temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
