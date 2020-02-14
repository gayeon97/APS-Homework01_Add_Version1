# Car Value
###### Author of the problem: Professor Joanna Klukowska at NYU Courant

###### Algorithmic Problem Solving, Spring 2020

###### Student: Gayeon Park

***
Most buyers of new cars take a bank loan for the purchase. You probably heard about the fact that a new car loses
10% of its value the minute you drive it off the lot. So it is likely that when a buyer takes a loan for the car and then
drives it off the lot, they actually owe the bank more than the car is worth.



Each month the buyer's loan payment reduces the amount owed on the car. However, each month, the car also
depreciates as it gets older. Your task is to write a program that calculates the first time, measured in months, that a
car buyer owes less money than a car is worth. For this problem, depreciation is specified as a percentage of the
previous month's value.
For simplicity, we will assume a 0% interest loan.

The car’s initial value is equal to the loan amount plus the down payment.

**Input**

Input consists of information for a single loan. Each loan consists of one line containing the duration of the loan in
months, the down payment, the amount of the loan, and the number of depreciation records that follow. All values are
non-negative, with loans being at most 100 months long and car values at most $75,000. Since depreciation is not
constant, the varying rates are specified in a series of depreciation records. Each depreciation record consists of one
line with a month number and depreciation percentage, which is more than 0 and less than 1. These are in strictly
increasing order by month, starting at month 0. Month 0 is the depreciation that applies immediately after driving the
car off the lot and is always present in the data. All the other percentages are the amount of depreciation at the end of
the corresponding month. Not all months may be listed in the data. If a month is not listed, then the previous
depreciation percentage applies.

**Output**

The output is the number of complete months before the borrower owes less than the car is worth followed by a
newline. Note that English requires plurals (5 months) on all values other than one (1 month).

It is possible for a car’s value and amount owed to be positive numbers less than $1.00. Do not round values to a
whole number of cents ($7,347.635 should not be rounded to$7,347.64).


**Example 1:**

Consider this of borrowing $15,000 for 30 months. As the buyer drives off the lot, they still owe $15,000, but the car
has dropped in value by 10% to $13,950. After 4 months, the buyer has made 4 payments, each of $500, and the car
has further depreciated 3% in months 1 and 2 and 0.2% in months 3 and 4. At this time, the car is worth
$13,073.10528 and the borrower only owes $13,000.00.

```
Input:
30 500.0 15000.0 3
0 .10
1 .03
3 .002

Output:
4 months
```

***
**The only changes I made to this problem are any grammatical fixes and the description in the heading.**
