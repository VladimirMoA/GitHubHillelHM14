public class SlctionSort {

    private long[] a;
    private  int nElems;

    public SlctionSort(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean insert(long value) {
        a[nElems] = value;
        nElems++;
        return true;
    }

    public boolean display() {
        for (int j=0; j<nElems;j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        return true;
    }

    public boolean insertionSort() {
        int in,out;
        for (out = 0; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in>0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        } return true;
    }

    public static void main(String[] args) {
        int maxSize = 100;
        SlctionSort arr;
        arr = new SlctionSort(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.insertionSort();
        arr.display();

    }

}
