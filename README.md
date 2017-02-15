
#ShakaLakaDingDong#

##Methodology##

We created arrays with varying lengths, ranging from 1 to 1000, and populated them with random integers in a selected range. Using System.nanoTime() before and after the array was sorted, we were able to find the run time for merge sort. We repeated the process 10000 times for each array and divided by 10000 to get the average runtime, to ensure there were no errors.

##Findings##
Based on our graph (linked below), we found that the run time is closest to either O(n) or O(nlogn). The line of best fit looks linear, however, earlier on it is closer to a quadratic. The graph of nlogn looks like a quadratic with a very small slope, which is what this graph could represent.

##Comparison to Predictions##
Based on our own analysis, we think merge sort should be O(nlogn). First, the list is split in two until it is down to one element arrays, which happens logn times. Then, it is put back together logn times again using the merge() method, which is O(n) because it varies in linear proportion to the inputted lists. Thus, that would be n*logn operations. Since nlogn>logn, the function would be O(nlogn).

##Link to Graph##
https://docs.google.com/spreadsheets/d/1XpErVeiDjysF1npTz5Eo6bhAgvzkmPExBfTEGwdabsw/pubhtml



