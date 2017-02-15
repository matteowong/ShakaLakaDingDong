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
  Batch size: 1000
  n=1       time: 201
  n=10      time: 1506
  n=100     time: 10846
  ...
  n=1000    time: 124702
  
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
	int[] a30 = new int[30];
	for (int i=0;i<30;i++){
	    a30[i]=(int)(Math.random()*37);
	}
	int[] a50 = new int[50];
	for (int i=0;i<50;i++){
	    a50[i]=(int)(Math.random()*370);
	}
	int[] a70 = new int[70];
	for (int i=0;i<70;i++){
	    a70[i]=(int)(Math.random()*370);
	}
	int[] a100=new int[100];
	for (int i=0;i<100;i++){
	    a100[i]=(int)(Math.random()*370);
	}
	int[] a300=new int[300];
	for (int i=0;i<300;i++){
	    a300[i]=(int)(Math.random()*370);
	}
	int[] a500=new int[500];
	for (int i=0;i<500;i++){
	    a500[i]=(int)(Math.random()*3700);
	}
	int[] a700=new int[700];
	for (int i=0;i<700;i++){
	    a700[i]=(int)(Math.random()*3700);
	}
	int[] a1000=new int[1000];
	for (int i=0;i<1000;i++) {
	    a1000[i]=(int)(Math.random()*37000);
	}
	
	int mergeSortLength1=0;
	for (int count=0;count<10000;count++) {
	    long sort1Start =System.nanoTime();
	    MergeSort.sort(a1);
	    long sort1End=System.nanoTime();
	    mergeSortLength1+=(sort1End - sort1Start);
	    MergeSort.mess(a1);
	}
	mergeSortLength1/=10000;

	
	int mergeSortLength10=0;
	
	for (int count=0;count<10000;count++) {
	    long sort2Start =System.nanoTime();
	    MergeSort.sort(a10);
	    long sort2End=System.nanoTime();
	    mergeSortLength10+=(sort2End - sort2Start);
	    MergeSort.mess(a10);
	}
	mergeSortLength10/=10000;

	int mergeSortLength30=0;
	
	for (int count=0;count<10000;count++) {
	    long sort3Start =System.nanoTime();
	    MergeSort.sort(a30);
	    long sort3End=System.nanoTime();
	    mergeSortLength30+=(sort3End - sort3Start);
	    MergeSort.mess(a30);
	}
	mergeSortLength30/=10000;

	int mergeSortLength50=0;
	
	for (int count=0;count<10000;count++) {
	    long sort4Start =System.nanoTime();
	    MergeSort.sort(a50);
	    long sort4End=System.nanoTime();
	    mergeSortLength50+=(sort4End - sort4Start);
	    MergeSort.mess(a50);
	}
	mergeSortLength50/=10000;

	int mergeSortLength70=0;
	
	for (int count=0;count<10000;count++) {
	    long sort5Start =System.nanoTime();
	    MergeSort.sort(a70);
	    long sort5End=System.nanoTime();
	    mergeSortLength70+=(sort5End - sort5Start);
	    MergeSort.mess(a70);
	}
	mergeSortLength70/=10000;

	
	int mergeSortLength100=0;

	for (int count=0;count<10000;count++) {
	    long sort6Start =System.nanoTime();
	    MergeSort.sort(a100);
	    long sort6End=System.nanoTime();
	    mergeSortLength100+=(sort6End - sort6Start);
	    MergeSort.mess(a100);
	}
	mergeSortLength100/=10000;

	int mergeSortLength300=0;

	for (int count=0;count<10000;count++) {
	    long sort7Start =System.nanoTime();
	    MergeSort.sort(a300);
	    long sort7End=System.nanoTime();
	    mergeSortLength300+=(sort7End - sort7Start);
	    MergeSort.mess(a300);
	}
	mergeSortLength300/=10000;

	int mergeSortLength500=0;

	for (int count=0;count<10000;count++) {
	    long sort8Start =System.nanoTime();
	    MergeSort.sort(a500);
	    long sort8End=System.nanoTime();
	    mergeSortLength500+=(sort8End - sort8Start);
	    MergeSort.mess(a500);
	}
	mergeSortLength500/=10000;

	int mergeSortLength700=0;

	for (int count=0;count<10000;count++) {
	    long sort9Start =System.nanoTime();
	    MergeSort.sort(a700);
	    long sort9End=System.nanoTime();
	    mergeSortLength700+=(sort9End - sort9Start);
	    MergeSort.mess(a700);
	}
	mergeSortLength700/=10000;

	int mergeSortLength1000=0;

	for (int count=0;count<10000;count++) {
	    long sort10Start =System.nanoTime();
	    MergeSort.sort(a1000);
	    long sort10End=System.nanoTime();
	    mergeSortLength1000+=(sort10End - sort10Start);
	    MergeSort.mess(a1000);
	}
	mergeSortLength1000/=10000;

	System.out.println("Array of length 1");
	System.out.println(mergeSortLength1);
	System.out.println("Array of length 10");
	System.out.println(mergeSortLength10);
	System.out.println("Array of length 30");
	System.out.println(mergeSortLength30);
	System.out.println("Array of length 50");
	System.out.println(mergeSortLength50);
	System.out.println("Array of length 70");
	System.out.println(mergeSortLength70);
	System.out.println("Array of length 100");
	System.out.println(mergeSortLength100);
	System.out.println("Array of length 300");
	System.out.println(mergeSortLength300);
	System.out.println("Array of length 500");
	System.out.println(mergeSortLength500);
	System.out.println("Array of length 700");
	System.out.println(mergeSortLength700);
	System.out.println("Array of length 1000");
	System.out.println(mergeSortLength1000);

    }//end main

}//end class
