import java.util.Scanner;

public class  DataPenjualan implements Toko{

    public int id;
    public String nama, keperluan;
    public DataPenjualan next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public DataPenjualan() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void input(){

        System.out.println();
        System.out.print("\t\t\t\t\tMasukkan id           : ");
        id= in.nextInt();
        System.out.print("\t\t\t\t\tMasukkan nama         : ");
        nama=str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan keperluan    : ");
        keperluan=str.nextLine();
        next=null;
    }

    public void read(){

        System.out.println("\t\t\t\t|| "+id+"\t|| "+nama+" \t|| "+keperluan+"\t\t||");

    }
}