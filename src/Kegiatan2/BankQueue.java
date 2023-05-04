package Kegiatan2;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size=0;
    }

    /**
     * method enqueue digunakan untuk menambahkan data pada rear
     * @param data
     * @if kosong maka add data
     * @else rear diperbarui jadi node baru
     *
     */
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        size++;
    }

    /**
     * method dequeue untuk menghapus item pada head
     * @return
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }

        int data = front.data;
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }

        return data;
    }

    /**
     * menampilkan antrian paling atas dari data yang diinput
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int size() {
        return size;
    }
}

public class BankQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice = 0;

        while (choice != 6) {
            System.out.println("SELAMAT DATANG DI BANK JAGOOH");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Lihat antrian terdepan");
            System.out.println("4. Cek apakah antrian kosong");
            System.out.println("5. Lihat jumlah nasabah dalam antrian");
            System.out.print("Pilihan Anda: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nomor antrian: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    System.out.println("\n==========================================");
                    System.out.println("Antrian " + data + " ditambahkan");
                    System.out.println("==========================================");
                    break;
                case 2:
                    int dequeueData = queue.dequeue();
                    if (dequeueData != -1) {
                        System.out.println("\n==========================================");
                        System.out.println("Antrian " + dequeueData + " dipanggil");
                        System.out.println("==========================================");
                    }
                    break;
                case 3:
                    int peekData = queue.peek();
                    if (peekData != -1) {
                        System.out.println("==========================================");
                        System.out.println("Antrian terdepan: " + peekData);
                        System.out.println("==========================================");
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("==========================================");
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("==========================================");
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 5:
                    System.out.println("==========================================");
                    System.out.println("Jumlah pelanggan dalam antrian: " + queue.size());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

            System.out.println();
        }
    }
}
