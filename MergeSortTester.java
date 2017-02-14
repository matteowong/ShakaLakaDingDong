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

import java.util.ArrayList;

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
	long sort1Start =System.nanoTime();
	MergeSort.sort(a1);
	long sort1End=System.nanoTime();
	System.out.println(sort1End - sort1Start);

	long sort2Start =System.nanoTime();
	MergeSort.sort(a10);
	long sort2End=System.nanoTime();
	System.out.println(sort2End - sort2Start);

	long sort3Start =System.nanoTime();
	MergeSort.sort(a100);
	long sort3End=System.nanoTime();
	System.out.println(sort3End - sort3Start + "\n");

	ArrayList b1= new ArrayList();
	ArrayList b10 = new ArrayList();
	for (int i=0;i<10;i++){
	    b10.add((int)(Math.random()*37));
	}
        ArrayList b100=new ArrayList();
	for (int i=0;i<100;i++){
	    b100.add((int)(Math.random()*370));
	}

	long bubbleSort1Start =System.nanoTime();
	BubbleSort.bubbleSortV(b1);
	long bubbleSort1End=System.nanoTime();
	System.out.println(bubbleSort1End - bubbleSort1Start);
	
	long bubbleSort2Start =System.nanoTime();
	BubbleSort.bubbleSortV(b10);
	long bubbleSort2End=System.nanoTime();
	System.out.println(bubbleSort2End - bubbleSort2Start);
	
	long bubbleSort3Start =System.nanoTime();
	BubbleSort.bubbleSortV(b100);
	long bubbleSort3End=System.nanoTime();
	System.out.println(bubbleSort3End - bubbleSort3Start);

    }//end main

}//end class
