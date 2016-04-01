import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {
	private Sorting sorting;
	@Before
	public void setUp() throws Exception{
		sorting = new Sorting();
		}
	@Test
	public void test() {
		int a[] = {2,4,3,5,6,2,4,3,7,8,9,1};
		int b[] = {2,4,3,5,6,2,4,3,7,8,9,1};
		assertFalse(sorting.isSorted(a));
		assertTrue(insertionSort(a));
		assertTrue(quicksort(b));
	}
	
	public boolean insertionSort(int []a)
	{
		sorting.insertionSort(a);
		return sorting.isSorted(a);
	}
	
	public boolean quicksort(int []a)
	{
		Sorting.quicksort(a);
		return sorting.isSorted(a);
	}

}
