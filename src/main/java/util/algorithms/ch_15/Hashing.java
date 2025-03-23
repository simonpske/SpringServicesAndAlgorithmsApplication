package util.algorithms.ch_15;

public interface Hashing {
    void add(Object o) throws HashTableOverflowException; 
    boolean contains(Object o);
}