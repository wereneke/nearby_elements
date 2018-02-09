# nearby_elements

Given a two-dimensional int array, where you store numbers. For example in Java code:

int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
};

Write a method, which

    Can access the multidimensional array from its class
    Has 3 input arguments: x, y - the positions of a given element in the array, and range - another int value
    Returns an int array with the nearby elements of x, y, and the maximum "distance" is the given range value

Method signature in Java language:

public int[] nearby(int x, int y, int range)

Examples:

nearby(0, 2, 2) would result: 2, 0, 1241, 12

nearby(1, 0, 1) would result: 3

nearby(1, 3, 5) would result: 1, 3, 5
