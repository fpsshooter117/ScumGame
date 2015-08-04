/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author ziheng.wei
 */
public class RecursiveSorting {

    public void bubbleSort(int[] array) {
        recursiveBubble(array, 0, 0);
    }

    public void selectionSort(int[] array) {
        recursiveSelection(array, 0, 0);
    }

    private void recursiveBubble(int[] array, int outterLoop, int innerLoop) {
        if (innerLoop == (array.length - 1)) {
            if (++outterLoop < array.length) {
                recursiveBubble(array, outterLoop, 0);
            }
        } else {
            if (array[innerLoop] > array[innerLoop + 1]) {
                int bigger = array[innerLoop];
                array[innerLoop] = array[innerLoop + 1];
                array[innerLoop + 1] = bigger;
            }
            recursiveBubble(array, outterLoop, ++innerLoop);
        }
    }

    private void recursiveSelection(int[] array, int outterLoop, int innerLoop) {
        if (innerLoop == 0) {
            if (++outterLoop < array.length) recursiveSelection(array, outterLoop, outterLoop);
        } else {
            if (array[innerLoop] < array[innerLoop - 1]) {
                int bigger = array[innerLoop];
                array[innerLoop] = array[innerLoop - 1];
                array[innerLoop - 1] = bigger;
            }
            recursiveSelection(array, outterLoop, --innerLoop);
        }
    }

    public static void main(String[] args) {
        RecursiveSorting sort = new RecursiveSorting();
    }

    public static String arrayToString(int[] array) {
        String output = "[";
        for (int i = 0; i < array.length; i++) {
            output = output + array[i] + " ";
        }
        output = output.trim() + "]";
        return output;
    }

}
