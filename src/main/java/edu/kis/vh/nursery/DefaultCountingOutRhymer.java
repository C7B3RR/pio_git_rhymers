package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int Capacity = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int isFull = 11;
    private int[] numbers = new int[Capacity];

    public int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == isFull;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
