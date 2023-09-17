package linkedlist;

/**
 * This class models a Queue data structure using a linked list.
 *
 * @param <T> the generic data type the queue will hold
 * @author Chris Stirneman
 * 
 */
public class Queue<T> {

    private GenericLinkedList<T> list; // The linked list to store the elements in the queue

    /**
     * Constructor for the Queue class, initializes an empty queue.
     */
    public Queue() {
        list = new GenericLinkedList<>();
    }//end constructor

    /**
     * Enqueues (adds) an item to the end of the queue.
     *
     * @param item the item to enqueue
     */
    public void enqueue(T item) {
        GenericNode<T> newNode = new GenericNode<>();
        newNode.setData(item);

        list.addNode(newNode);
    }//end enqueue

    /**
     * Dequeues an item from the front of the queue and returns it.
     * @return the item dequeued from the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }

        GenericNode<T> frontNode = list.getList();
        T data = frontNode.getData();
        list.head = frontNode.getNextNode();

        return data;
    }//end dequeue

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }//end isEmpty

    /**
     * Returns the number of elements in the queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return list.size();
    }//end size

    /**
     * Returns a string representation of the queue.
     *
     * @return a string representation of the queue
     */
    
    public String toString() {
    	StringBuilder result = new StringBuilder();
        GenericNode<T> current = list.getList();

        while (current != null) {
            result.append(current.getData()).append(" ");
            current = current.getNextNode();
        }//end while

        return result.toString();
    }//end to string
}
