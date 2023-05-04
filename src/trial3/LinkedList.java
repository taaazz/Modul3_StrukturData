package trial3;

public class LinkedList {

    public DataPenjualan head, tail, front, size, data;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList(){
        head=null;
        tail=null;
    }

    public void enqueue(){
        DataPenjualan dt= new DataPenjualan();
        dt.input();
        if(head==null)
            head=dt;
        else
            tail.next=dt;
        tail=dt;
    }

    public void dequeue(){
        if(head==null){
            System.out.println("Data Kosong!!!");
        }else{
            System.out.println("\nNomor antri dengan id : "+head.id+ " atas nama " +head.nama);
            head=head.next;
        }
    }

    public void view(){
        if(head==null){
            System.out.println("\nData Kosong!!!");
        }else{
            System.out.println("==========================================================");
            System.out.println("Id \t\t|| Nama \t\t|| Keperluan \t||");
            for (DataPenjualan a=head; a!=null; a=a.next) a.read();
            System.out.println("==========================================================");

        }
    }

}


