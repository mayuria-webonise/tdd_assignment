import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Created by webonise on 19/8/16.
 */
public class Quick {
    private int input_nos[];
    private int length;
    public void input(String nos) throws Exception {

        String[] ar=null;

        try {
            ar = nos.split("\n");
        }
        catch (Exception e){}

        this.input_nos=new int[ar.length];

            for (int i = 0; i < ar.length; i++) {
                //if(ar[i])
                if (ar[i].matches("[0-9]+") ) {
                    input_nos[i] = (Character.getNumericValue(ar[i].charAt(0)));
                }
                else
                    throw new Exception();

            }
        length = input_nos.length;
        quickSort(0, length - 1);
        }



        public int getPivot(int lowerIndex,int higherIndex)
        {
            int pivot = input_nos[lowerIndex+(higherIndex-lowerIndex)/2];
            return pivot;
        }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = this.getPivot(lowerIndex,higherIndex);

        while (i <= j) {

            while (input_nos[i] < pivot) {
                i++;
            }
            while (input_nos[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    public void exchangeNumbers(int i, int j)
    {

        int temp = input_nos[i];
        input_nos[i] = input_nos[j];
        input_nos[j] = temp;
    }

    public int getNo(int i)
    {
        return this.input_nos[i];
    }
    public int getLength(){

        return this.length;
    }
    public int[] getSortedArray()
    {
        return this.input_nos;
    }
 }
