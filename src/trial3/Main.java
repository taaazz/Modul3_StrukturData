package trial3;

import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {

        int menu;
        Scanner input=new Scanner(System.in);
        LinkedList LL =new LinkedList();

        System.out.println("=======================================================================================");
        System.out.println("Selamat datang di Bank Danamon");
        System.out.println("Memberikan pelayanan yang terbaik");
        System.out.println("=======================================================================================");

        do{
            System.out.println();
            System.out.println("Pilih menu : ");
            System.out.println("1. Pengambilan nomor antri");
            System.out.println("2. Pemanggilan nomor antri");
            System.out.println("3. Lihat data antrian");
            System.out.println("4. Lihat antrian terdepan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            menu=input.nextInt();
            if(menu==1){
                LL.enqueue();
            }else if(menu==2){
                LL.dequeue();
            }else if(menu==3){
                LL.view();
            }else if(menu==4){
                System.out.println("Terimakasih!!!!");
            }else{
                System.out.println("Perhatikan data yang Anda inputkan!!!!");
            }
        }while(menu!=4);
    }
}
