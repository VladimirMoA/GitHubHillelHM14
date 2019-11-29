import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HM12Test {
    InterSearch interSearch;
    SlctionSort slctionSort;
    int [] arr;

    @Before
    public void init() {
        arr = new int[] {1,1,1,2,2,2,2,2,3,4,4,4,5,5,6,6,7,7,7,7,8,8,9,9,9,9};
        slctionSort = new SlctionSort(10);
    }


    @Test
    public void interSearchTest() {
        assertEquals(15,interSearch.interpolationSearch(arr,6));
    }

    @Test
    public void insertTest() {
        assertTrue(slctionSort.insert(20));
    }

    @Test
    public void displayTest() {
        assertTrue(slctionSort.display());
    }

    @Test
    public void insertionSort() {
        assertTrue(slctionSort.insertionSort());
    }



}
