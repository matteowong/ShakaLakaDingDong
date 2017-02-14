/*======================================
  class MergeSortTester

  ALGORITHM:
  1. check list being passed to you. If length is 1, return it
  2. if length is not one, split it in two and pass it on recursively 
  3. when lists are received from lower computers, sort with mergeSort 

  BIG-OH CLASSIFICATION OF ALGORITHM: O(nlogn)
  Merge() is O(n) because it creates a new array the size of the two given arrays added together, which means it increases linearly with the size of the inputs
  Sort(), then, is O(n*logn) because you have to split the array logn times (since you are dividing by two), then bring it back together logn times. However, putting the array back together requires merging, which is O(n), so you multiply and get logn+n*logn, which is really just n*logn

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/



public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
we will use System.nanoTime()
    ******************************/
    public static void main( String[] args ) 
    {

	int[] a1={1};
	int[] a10 = new int[10];
	for (int i=0;i<10;i++){
	    a10[i]=(int)(Math.random()*37);
	}
	int[] a100=new int[100];
	for (int i=0;i<100;i++){
	    a100[i]=(int)(Math.random()*370);
	}
	//System.out.println("Testing MergeSort");
	//System.out.println("Array length 1");
	int mergeSortLength1=0;
	for (int count=0;count<10000;count++) {
	    long sort1Start =System.nanoTime();
	    MergeSort.sort(a1);
	    long sort1End=System.nanoTime();
	    mergeSortLength1+=(sort1End - sort1Start);
	    MergeSort.mess(a1);
	}
	mergeSortLength1/=10000;
	//System.out.println(mergeSortLength1);

	//System.out.println("mergeSort length 10");
	
	int mergeSortLength10=0;
	
	for (int count=0;count<10000;count++) {
	    long sort2Start =System.nanoTime();
	    MergeSort.sort(a10);
	    long sort2End=System.nanoTime();
	    mergeSortLength10+=(sort2End - sort2Start);
	    MergeSort.mess(a10);
	}
	mergeSortLength10/=10000;
	//System.out.println(mergeSortLength10);


	//System.out.println("Array of length 100");
	int mergeSortLength100=0;

	for (int count=0;count<10000;count++) {
	    long sort3Start =System.nanoTime();
	    MergeSort.sort(a100);
	    long sort3End=System.nanoTime();
	    mergeSortLength100+=(sort3End - sort3Start);
	    MergeSort.mess(a100);
	}
	mergeSortLength100/=10000;
	//System.out.println(mergeSortLength100+"\n");


	
	//System.out.println("Comparing to bubbleSort\n");
	//System.out.println("Array of length 1");

	int bubbleSortLength1=0;
	for (int count=0;count<10000;count++) {
	    long bubbleSort1Start =System.nanoTime();
	    BubbleSort.bubbleSort(a1);
	    long bubbleSort1End=System.nanoTime();
	    bubbleSortLength1+=(bubbleSort1End - bubbleSort1Start);
	    MergeSort.mess(a1);
	}
	bubbleSortLength1/=10000;
	//System.out.println(bubbleSortLength1);
	
	//System.out.println("Array of length 10");

	int bubbleSortLength10=0;

	for (int count=0;count<10000;count++) {
	    long bubbleSort2Start =System.nanoTime();
	    BubbleSort.bubbleSort(a10);
	    long bubbleSort2End=System.nanoTime();
	    bubbleSortLength10+=(bubbleSort2End - bubbleSort2Start);
	    MergeSort.mess(a10);
	}
	bubbleSortLength10/=10000;
	//System.out.println(bubbleSortLength10);

	
	//System.out.println("Array of length 100");

	int bubbleSortLength100=0;
	for (int count=0;count<10000;count++) {
	    long bubbleSort3Start =System.nanoTime();
	    BubbleSort.bubbleSort(a100);
	    long bubbleSort3End=System.nanoTime();
	    bubbleSortLength100+=(bubbleSort3End - bubbleSort3Start);
	    MergeSort.mess(a100);
	}
	bubbleSortLength100/=10000;
	//System.out.println(bubbleSortLength100);
	System.out.println("Array of length 1");
	System.out.println("Merge sort: "+mergeSortLength1+" Bubble Sort: "+bubbleSortLength1);
	System.out.println("Array of length 10");
	System.out.println("Merge sort: "+mergeSortLength10+" Bubble Sort: "+bubbleSortLength10);
	System.out.println("Array of length 100");
	System.out.println("Merge sort: "+mergeSortLength100+" Bubble Sort: "+bubbleSortLength100);
    }//end main

}//end class
