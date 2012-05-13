package QuickSort;

public class Main {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] array={1,6,4,28,3,5,7};
        QuickSort qs=new QuickSort();
        qs.quicksort(array);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
	}

}
