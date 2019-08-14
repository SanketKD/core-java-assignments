package com.sanketkd;

/**
 * Implement Queue using one stack
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class QueueUsingOneStack {

  public static void main(String[] args) throws Exception {
    Queue<Integer> queue = new Queue<>();

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    queue.enqueue(60);

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
  }
}
