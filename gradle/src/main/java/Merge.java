/**
 * Created by webonise on 22/8/16.
 */
public class Merge {
    private int input_nos[];
    private int length;
    private int temp[];
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
        temp=new int[input_nos.length];
    }
    public void partition(int lowerindex, int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int middle=lowerindex+(higherindex-lowerindex)/2;
            partition(lowerindex,middle);
            partition(middle+1,higherindex);

            MergeSort(lowerindex,middle,higherindex);
        }

    }

    public void initializeTemp(int lowerIndex, int middle, int higherIndex)
    {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = input_nos[i];
        }
    }
    public void MergeSort(int lowerIndex, int middle, int higherIndex) {

        initializeTemp(lowerIndex,middle,higherIndex);

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                input_nos[k] = temp[i];
                i++;
            } else {
                input_nos[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            input_nos[k] = temp[i];
            k++;
            i++;
        }

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
    public int[] getTempArray()
    {
        return this.temp;
    }
}
