package trial3;

import java.util.Scanner;

public class DataPenjualan {

    public int id;
    public String nama, keperluan;
    public DataPenjualan next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    public int data;

    public void input(){
        System.out.println();
        System.out.print("Masukkan id           : ");
        id= in.nextInt();
        System.out.print("Masukkan nama         : ");
        nama=str.nextLine();
        System.out.print("Masukkan keperluan    : ");
        keperluan=str.nextLine();
        next=null;
    }

    public void read(){

        System.out.println(""+id+"\t|| "+nama+" \t|| "+keperluan+"\t\t||");

    }
}