package util.algorithms.ch_13;

public interface Stack {
  public void push(Object obj)
    throws StackException;
  public Object pop() 
    throws StackException;
  public Object top() 
    throws StackException;
  public boolean isEmpty();
}
