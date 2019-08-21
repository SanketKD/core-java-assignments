![Java](logo.png)

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

## 2. Find angle between hour and minute hands of clock : [**clock-angle**](https://github.com/SanketKD/core-java-assignments/tree/master/clock-angle)
This problem is know as [Clock angle problem](http://en.wikipedia.org/wiki/Clock_angle_problem) where we need to find angle between hands of an analog clock at a given time.

    public Double findAngle(Integer hour, Integer minute)

|Example 1|Example 2|
|--|--|
|Time : 12:45|Time : 3:30|
|Input : hour = 12, Minute = 45|Input : hour = 3, Minute = 30|
|Output : 112.5°|Output : 75°|

## 3. Implement Queue using only one stack: [**queue-using-one-stack**](https://github.com/SanketKD/core-java-assignments/tree/master/queue-using-one-stack)
Create a custom implementation of queue by using stack. Make sure that you use only one stack.

    public void enqueue(T value)
	public T dequeue()

## 4. Write an algorithm as a part of task allocation and planning to see 'cancelled' date ranges: [**cancelled-period-for-tasks**](https://github.com/SanketKD/core-java-assignments/tree/master/cancelled-period-for-tasks)
Use the Plan class below:

	public class Plan {
	  private Integer taskId;
	  private LocalDate startDate;
	  private LocalDate endDate;
	  // getter and setter
	}

You have to write a java class having function:

	public List<Plan> getCancelledPeriodsForTask(List<Plan> oldPlanList, List<Plan> newPlanList)

For testing purpose, please use below values for old and new plans:

OLD PLAN

|Task ID|End Date|End Date|
|--|--|--|
|101|10-MAY-2019|20-MAY-2019|
|102|10-MAY-2019|20-MAY-2019|
|103|10-MAY-2019|20-MAY-2019|
|104|10-MAY-2019|20-MAY-2019|
|105|10-MAY-2019|20-MAY-2019|
|106|10-MAY-2019|20-MAY-2019|
|107|10-MAY-2019|20-MAY-2019|

NEW PLAN

|Task ID|End Date|End Date|
|--|--|--|
|101|01-MAY-2019|05-MAY-2019|
|102|05-MAY-2019|15-MAY-2019|
|103|05-MAY-2019|25-MAY-2019|
|104|15-MAY-2019|18-MAY-2019|
|105|15-MAY-2019|25-MAY-2019|
|106|25-MAY-2019|30-MAY-2019|
|107|12-MAY-2019|13-MAY-2019|
|107|16-MAY-2019|18-MAY-2019|

The output of the program for above test plans should be:

|Task ID|End Date|End Date|
|--|--|--|
|101|10-MAY-2019|20-MAY-2019|
|102|16-MAY-2019|20-MAY-2019|
|104|10-MAY-2019|14-MAY-2019|
|104|19-MAY-2019|20-MAY-2019|
|105|10-MAY-2019|14-MAY-2019|
|106|10-MAY-2019|20-MAY-2019|
|107|10-MAY-2019|11-MAY-2019|
|107|14-MAY-2019|15-MAY-2019|
|107|19-MAY-2019|20-MAY-2019|
