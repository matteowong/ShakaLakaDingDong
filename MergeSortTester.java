/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

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
we will use System.currentTimeMillis()
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
	System.out.println(sort3End - sort3Start);
    }//end main

}//end class
