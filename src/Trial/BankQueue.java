package Trial;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else if (front == rear) {
            int data = front.data;
            front = null;
            rear = null;
            return data;
        } else {
            int data = front.data;
            front = front.next;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return front.data;
        }
    }

    public int size() {
        int count = 0;
        Node current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class BankQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if queue is empty");
            System.out.println("5. Display queue");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;

                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println(dequeued + " was dequeued");
                    }
                    break;

                case 3:
                    int peeked = queue.peek();
                    if (peeked != -1) {
                        System.out.println("Peek element is " + peeked);
                    }
                    break;

                case 4:
                    boolean empty = queue.isEmpty();
                    if (empty) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;

                case 5:
                    System.out.print("Queue is: ");
                    queue.display();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println();
        } while (choice != 6);

        scanner.close();
    }
}
