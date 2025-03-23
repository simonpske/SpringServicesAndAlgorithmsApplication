package util.algorithms.ch_15;

public class HashTableOverflowException extends RuntimeException {
    public HashTableOverflowException (String s) {
	super (s);
    }

    public HashTableOverflowException () {
    }
}