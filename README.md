#ShakaLakaDingDong#
###Fabiola Radosav, Yuqi Wu, Matteo Wong###

##Purpose##
We are seeking to determing the Big Oh of Merge Sort. The Merge Sort algorithm is as follows:
1. check list being passed to you. If length is 1, return it
2. if length is not one, split it in two and pass it on recursively 
3. when lists are received from lower computers, sort with mergeSort

##Predictions##
We predict MergeSort will be O(nlogn). First, the list is split in two until it is down to one element arrays, which happens logn times. Then, it is put back together logn times again using the merge() method, which is O(n) because it varies in linear proportion to the inputted lists. Thus, that would be n*logn operations. Since nlogn>logn, the function would be O(nlogn).

##Methodology##

We created arrays with varying lengths, ranging from 1 to 1000, and populated them with random integers in a selected range. Using System.nanoTime() before and after the array was sorted, we were able to find the run time for merge sort. We repeated the process 10000 times for each array and divided by 10000 to get the average runtime, to ensure there were no errors. We then ran this trial 10 times and averaged those out, for a total of 100,000 trials of each list size. We also compared this to O(n*n), O(n), and O(logn).

##Findings##
Based on our graph (linked below), we found that the run time is closest to either O(n) or O(nlogn). When looking at the graph of smaller test cases, ranging from size 1 to 300, the graph is clearly not linear and not quadratic, but somewhere in the middle. A graph defined as n*logn would also be between O(n) and O(n*n), so we believe this is accurate.

Looking at the graph with list sizes up to 1000, the trendline looks closer to linear. However, it increases at a very, very slight quadratic rate, putting it just above the linear line but far beneath the quadratic line. Thus, we could say it is O(n) or O(nlogn) and that measurement errors, possibly related to our machines, are causing the data to be a little off.

Since the smaller data sets  clearly indicate O(nlogn) and the larger ones most likely indicate O(nlogn), we can say that our findings agree with our predictions and that MergeSort is O(nlogn).

##Link to Graph##
https://docs.google.com/spreadsheets/d/1MVxafkEjHZzqepA4ZTc2nIlJg8ZB2X8oEFCev1Zj264/pubhtml