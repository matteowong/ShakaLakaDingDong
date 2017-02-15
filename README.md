
Methodology:

We created three arrays with length 1, 10 and 100 and populated them with random numbers. Each array was sorted 1000 times using a for loop and in each for loop we used System.nanoTime() to indicate the start ad end times. We then took the difference of the start and end times to find how long the entire sort took, and found the average runtime by dividing the total time by 1000. We did the same thing for BubbleSort so that we could compare the efficiency of both algorithms.

We found that BubbleSort was faster than MergeSort until the array length became greater than 1000, which is when MergeSort was faster.



