# CanBeSplittedAlgorithm
Algorithm design to determine if a one dimensional array can be splitted so that the sum of the numbers on each separate side add up to exactly the same

## Operating Principle
Code to verify if a one dimensional array can be splitted into a specific position such that the sum of the left side of the division equals the sum of the right side.
### Example: 
Given the `array`:

    array        = [1, 3, 3, 8, 4, 3, 2, 3, 3] 
    position     = [0, 1, 2, 3, 4, 5, 6, 7, 8]

The `array` can be splitted in the *4th position* to obtain the following result:

    left_side   = [1, 3, 3, 8]
    right_side  = [4, 3, 2, 3, 3]
The `sum` of all the values of each side is:

    left_side_sum   = 1 + 3 + 3 + 8 = 15
    right_side_sum  = 4 + 3 + 2 + 3 + 3 = 15
This means that the array can be splitted

### Result:
As a result the code will `return 1` if the array can be splitted, `-1` if the array can not be splitted and `0` if the array is empty.

## Operation 

Run the `CanBeSplittedAlgorithm.java` file.
The following message will be shown:

    Please type the amount of numbers in the matrix
Make sure to enter an integer value that determine the array length.

Depending on the type number the program will show the following message in order to fill every position of the array. Make sure to use only `integer` values.

    Please type the number in the 1 position

When the array is complete the program will calculate the position where the array can be splitted. If this position is found, the program will show a `return` value `1`