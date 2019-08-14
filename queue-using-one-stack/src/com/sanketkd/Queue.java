package com.sanketkd;

import java.util.Stack;

/**
 * Custom implementation of Queue using one stack
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class Queue<T> {

  Stack<T> stack = new Stack<>();

  /**
   * Add a value in the queue
   * 
   * @param value to be enqueued
   */
  public void enqueue(T value) {
    stack.push(value);
  }

  /**
   * Fetch current value from the queue
   * 
   * @return current value in the queue
   * @throws Exception if queue is empty
   */
  public T dequeue() throws Exception {
    if (stack.size() == 0) {
      throw new Exception("Queue is Empty");
    }
    if (stack.size() == 1) {
      return stack.pop();
    }
    T data = stack.pop();
    T returnValue = dequeue();
    stack.push(data);
    return returnValue;
  }
}
