package nyobak;

import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    int count;

    Queue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public void enqueue(String data) {
        Node new_node = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = new_node;
        } else {
            this.rear.next = new_node;
            this.rear = new_node;
        }
        this.count++;
    }

    public String dequeue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = temp.next;
        if (this.front == null) {
            this.rear = null;
        }
        this.count--;
        return temp.data;
    }

    public String peek() {
        if (this.front == null) {
            return null;
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int size() {
        return this.count;
    }
}

public class mixue {
    public static void main(String[] args) {
        Queue mixueQueue = new Queue();
        Scanner input = new Scanner(System.in);
        int choice;
        String customerName;

        do {
            System.out.println("===== ORDERAN MIXUE =====");
            System.out.println("1. Tambah nomor antrian");
            System.out.println("2. Hapus pelanggan antrian pertama");
            System.out.println("3. Lihat pelanggan pertama");
            System.out.println("4. Cek apakah antrian kosong");
            System.out.println("5. Lihat jumlah pelanggan dalam antrian");
            System.out.print("Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine(); // clear buffer
                    System.out.print("Masukkan nomor antrian: ");
                    customerName = input.nextLine();
                    mixueQueue.enqueue(customerName);
                    System.out.println("Pelanggan " + customerName + " berhasil ditambahkan ke dalam antrian.");
                    break;
                case 2:
                    customerName = mixueQueue.dequeue();
                    if (customerName == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Pelanggan " + customerName + " telah keluar dari antrian.");
                    }
                    break;
                case 3:
                    customerName = mixueQueue.peek();
                    if (customerName == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Pelanggan pertama di nomor: " + customerName);
                    }
                    break;
                case 4:
                    if (mixueQueue.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 5:
                    System.out.println("Jumlah pelanggan dalam antrian: " + mixueQueue.size());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println(); // newline
        } while (choice != 0);
    }
}