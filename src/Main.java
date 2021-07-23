import java.util.Scanner;

public class Main {
    //deklarasi array database
    static String[] database = new String[6];
     {
        database[0] = "-"; // nama
        database[1] = "-"; // alamat
        database[2] = "-"; // nohp
        database[3] = "-"; // tgllahir
        database[4] = "-"; // status nikah
        database[5] = "-"; // noktp
    }
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       try {
           menu1();;
       }catch (Exception error){
        System.out.println(error);
       }
    }

    //menu pertama
    static void menu1(){
        System.out.println("\nMASUKKAN DATA DIRI");
        System.out.print("Nama            = ");
        String nama = scanner.next();
        database[0] = nama;
        System.out.print("Tgl Lahir       = ");
        String tgllahir = scanner.next();
        database[3] = tgllahir;
        System.out.print("Nomor Handphone = ");
        String nohp = scanner.next();
        database[2] = nohp;

        //output menu pertama
        System.out.print("\nNama            = " + database[0]);
        System.out.print("\nTgl Lahir       = " + database[3]);
        System.out.print("\nNomor Handphone = " + database[2]);
        System.out.println("\nApakah Anda Yakin Dengan Data Tersebut? [Y/N]");
        String input = scanner.next();

        if (input.equals("Y")||input.equals("y")){
            menu2();
        }
        else if (input.equals("N")||input.equals("n")){
            menu1();
        }
        else System.out.println("isikan hanya Y atau N");

    }

    //menu kedua
    static void menu2(){
        System.out.println("\nPilih salah satu dari ketiga menu ini");
        System.out.println("1. Lihat Data Diri");
        System.out.println("2. Update Data Diri");
        System.out.println("3. Keluar");
        String input2 = scanner.next();

        if (input2.equals("1")){
            System.out.println("Nama           : "+database[0]);
            System.out.println("Alamat         : "+database[1]);
            System.out.println("Nomor Handphone: "+database[2]);
            System.out.println("Tgl Lahir      : "+database[3]);
            System.out.println("Status         : "+database[4]);
            System.out.println("Nomor KTP      : "+database[5]);
            menu2();
        }

        else if (input2.equals("2")){

            System.out.println("PILIH DATA YANG AKAN DIUPDATE");
            System.out.println("1. Nama");
            System.out.println("2. Alamat");
            System.out.println("3. Nomor Handphone");
            System.out.println("4. Tgl Lahir");
            System.out.println("5. Status ");
            System.out.println("6. Nomor KTP");
            System.out.println("7. Cancel");
            int input3 = Integer.parseInt(scanner.next());

            switch (input3){
                case 1 : System.out.print("isikan data yang baru = ");
                    String upNama = scanner.next();
                    database[0] = upNama;break;
                case 2 : System.out.print("isikan data yang baru = ");
                    String upAlamat = scanner.next();
                    database[1] = upAlamat;break;
                case 3 : System.out.print("isikan data yang baru = ");
                    String upNope = scanner.next();
                    database[2] = upNope;break;
                case 4 : System.out.print("isikan data yang baru = ");
                    String upTl = scanner.next();
                    database[3] = upTl;break;
                case 5 : System.out.print("isikan data yang baru = ");
                    String upStatus = scanner.next();
                    database[4] = upStatus;break;
                case 6 : System.out.print("isikan data yang baru = ");
                    String upNoKTP = scanner.next();
                    database[5] = upNoKTP;break;
                case 7 : break;

            }

        }
        else if (input2.equals("3")){
            System.out.println("\nANDA MEMILIH KELUAR");
            System.exit(0);
        }
        else System.out.println("MOHON PILIH ANGKA 1-3");
        menu2();
    }


}