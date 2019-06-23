# Core Java Assignments
## 1. Date range merging program : [**date-merger**](https://github.com/SanketKD/core-java-assignments/tree/master/date-merger)
Create a class called DateMerger. This class should have a method called mergeDateRange. This method takes a list of class DateRange which has member variables startDate and endDate.

    public List<DateRange> mergeDateRange(List<DateRange> dateRanges)

This method should scan the list of passed date ranges and merge those date ranges.

 - Input :

|End Date|End Date|
|--|--|
|01-JAN-2019|30-JAN-2019|
|15-JAN-2019|15-FEB-2019|
|10-MAR-2019|15-APR-2019|
|10-APR-2019|15-MAY-2019|

 - Output:

|End Date|End Date|
|--|--|
|01-JAN-2019|15-FEB-2019|
|10-MAR-2019|15-MAY-2019|