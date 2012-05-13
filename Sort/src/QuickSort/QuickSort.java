package QuickSort;

public class QuickSort<T extends Comparable<T>> {
	
	public QuickSort(){

    }

	public void quicksort(T[] array){
        this.quicksort(array, 0, array.length-1);
    }
    public  void quicksort(T[] array, int min, int max){
        int pivot;
        if(max-min>0){
           pivot=this.find(array, min, max);
           this.quicksort(array, min, pivot-1);
           this.quicksort(array, pivot+1, max);
        }
    }
    public int find(T[]array, int min,int max){
        int left=min;
        int right=max;
        T privotElement=array[min];

        while(left<right){
               while(array[left].compareTo(privotElement)<=0 && left < right){
                   left++;
               }
               while(array[right].compareTo(privotElement)>0){
                   right--;
               }
               if(left<right) this.swap(array,left,right);
        }

        this.swap(array,min,right);
        return right;
    }
    public void swap(T[] array, int left, int right){
        int tmp;
        tmp=left;
        left=right;
        right=tmp;
    }

	
     }


