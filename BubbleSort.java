public class BubbleSort {

    public static void bubbleSort( int[] data ) 
    {
	for (int i=0;i<data.length-1;i++) {
	    for (int j=data.length-1;j>0;j--) {
		if (data[j]<data[j-1]) {
		    int temp = data[j];
		    data[j]=data[j-1];
		    data[j-1]=temp;
		}
	    }
	}
    }
}
