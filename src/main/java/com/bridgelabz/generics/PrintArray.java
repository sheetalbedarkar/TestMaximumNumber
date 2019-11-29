package com.bridgelabz.generics;

public class PrintArray <X, Y, Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String args[]) {
        Integer integerArray[] = {1, 2, 3, 4, 5};
        Double doubleArray[] = {1.0, 2.5, 3.6, 4.9, 5.7};
        Character characterArray[] = {'a', 'b', 'c', 'd', 'e'};

        new PrintArray<Integer, Double, Character>(integerArray, doubleArray, characterArray).toPrint();
    }

    private void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static<T> void toPrint(T[] x) {
        for (T i : x) {
            System.out.println(i);
        }
    }

}
