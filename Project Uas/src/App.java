import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    
    public static int getIndexFromPemesan(ArrayList<pemesan> array, String nama) {
        int index = 0;
        for (pemesan p : array) {
            if (p.getNama().equals(nama)) {
                return index;
            }
            index++;
            
        }
        return -1;
    }
    public static int getIndexFromPembayaran(ArrayList<pembayaran> array, String kode) {
        int index = 0;
        for (pembayaran py : array) {
            if (py.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromStatus(ArrayList<status> array, String kode) {
        int index = 0;
        for (status st : array) {
            if (st.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromSuperior(ArrayList<Superior> array, String kode) {
        int index = 0;
        for (Superior superior : array) {
            if (superior.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromStandard(ArrayList<Standard> array, String kode) {
        int index = 0;
        for (Standard standard : array) {
            if (standard.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromstatus(ArrayList<status> array, String kode) {
        int index = 0;
        for (status status : array) {
            if (status.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static ArrayList<Superior> initSuperior(ArrayList<Superior>superior ){
        Superior s1 = new  Superior("A01");
        superior.add(s1);
        Superior s2 = new  Superior("C02");
        superior.add(s2);
        Superior s3 = new  Superior("B03");
        superior.add(s3);
        return  superior;
    }
    public static ArrayList<Standard> initStandard(ArrayList<Standard>Standard ){
        Standard s1 = new  Standard("101");
        Standard.add(s1);
        Standard s2 = new  Standard("302");
        Standard.add(s2);
        Standard s3 = new  Standard("203");
        Standard.add(s3);
        return  Standard;
    }
    public static ArrayList<Deluxe> initDeluxe(ArrayList<Deluxe>Deluxe ){
        Deluxe s1 = new  Deluxe("B01");
        Deluxe.add(s1);
        Deluxe s2 = new  Deluxe("C02");
        Deluxe.add(s2);
        Deluxe s3 = new  Deluxe("A03");
        Deluxe.add(s3);
        return  Deluxe;
    }
   
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } 
    
    public static ArrayList<status> initstatus(ArrayList<status>status ){
        status sts1 = new status("S01","Cash", "Standard", "A01","Checked In","2");
        status.add(sts1);
        status sts2 = new status("S02","Credit", "Superior", "S01","Checked In","4");
        status.add(sts2);
        status sts3 = new status("S03","Debit", "Standard", "A02","Checked Out","2");
        status.add(sts3);
        return status;
    }
    
    public static ArrayList<Standard> sd = new ArrayList<Standard>();
   public static ArrayList<pemesan> p = new ArrayList<pemesan>();
   public static ArrayList<pembayaran> py = new ArrayList<pembayaran>();
   public jenispembayaran jenis;

    public static void main(String[] args) throws Exception {
        jenispembayaran jenisp = new jenispembayaran();
        pembayaran.initpembayaran(py);
        ArrayList<Superior> sp = new ArrayList<Superior>();
        initSuperior(sp);
        ArrayList<Deluxe> d = new ArrayList<Deluxe>();
        initDeluxe(d);
       
        initStandard(sd);
        ArrayList<status> sts = new ArrayList<status>();
        initstatus(sts);
        Scanner keyboard = new Scanner(System.in);
        String yn = "y";
        while(yn.equalsIgnoreCase("y")){
            clearScreen();
            System.out.println("                      UAS PBO                      ");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Input/Cetak Data Pemesan");
            System.out.println("2. Input/Cetak Data Pembayaran");
            System.out.println("3. Cetak jenis kamar");
            System.out.println("4. Cetak status");
            System.out.println("5. Metode pembayaran");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda [1-6] ? ");
            String pilihan = keyboard.next();
            clearScreen();
            if (pilihan.equals("1")) {
                System.out.println("Data Pemesan");
                System.out.println("----------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak data pemesan");
                System.out.println("3. Cetak semua data pemesan");
                System.out.print("Pilihan Anda [1-3] ? ");
                String opsi = keyboard.next();
                clearScreen();
                if (opsi.equals("1")) {
                    readwrite.daftarpemesan(p);
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data Pemesan ");
                    System.out.println("-----------------");
                    System.out.print("Masukkan nama  : ");
                    String nama = keyboard.next();
                    if (p.size() > 0) {
                        int idx = getIndexFromPemesan(p, nama);
                        if (idx == -1) {
                            throw new Exception("Nama tidak ditemukan");
                        }
                        else {
                            clearScreen();
                            System.out.println("Data Pemesan");
                            System.out.println("----------------");
                            System.out.println("Nama           : " + p.get(idx).getNama());
                            System.out.println("Alamat         : " + p.get(idx).getAlamat());
                            System.out.println("No Telepon     : " + p.get(idx).getNotelp());
                            System.out.println("Alamat         : " + p.get(idx).getKamar());
                            System.out.println("No Telepon     : " + p.get(idx).getDurasi());
                        }
                    }
                    else {
                        throw new Exception("Tidak ada data pemesan");
                    }
                }
                else if (opsi.equals("3")) {
                    readwrite.displaypemesan();
                }
                else {
                    throw new Exception("Pilihan tidak tersedia");
                }
            }
                else if(pilihan.equals("2")) {
                    System.out.println("Pembayaran");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Pembayaran");
                    System.out.println("2. Cetak Semua Data Pembayaran");
                    System.out.print("Pilihan Anda [1-2] ? ");
                    String opsi = keyboard.next();
    
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Kode              : ");
                        String kode = keyboard.next();
                        System.out.print("Durasi            : ");
                        int durasi = keyboard.nextInt();
                        System.out.print("Biaya Penginapan  : ");
                        int penginapan = keyboard.nextInt();
                        System.out.print("Biaya Tambahan    : ");
                        int tambahan = keyboard.nextInt();
                        py.add(new pembayaran( kode, durasi, penginapan, tambahan  ));
                    }
                    else if (opsi.equals("2")) {
                        System.out.println("Cetak Data Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Masukkan Kode : ");
                        String kode = keyboard.next();
                        if (py.size()>0) {
                            int idx = getIndexFromPembayaran(py, kode);
                            if (idx == -1) {
                                throw new Exception("Kode yang Anda masukkan invalid");
                            }
                            else {
                                clearScreen();
                                System.out.println("Data Pembayaran");
                                System.out.println("--------------");
                                System.out.println("Kode              : " + py.get(idx).getKode());
                                System.out.println("Durasi            : " + py.get(idx).getDurasi());
                                System.out.println("Biaya Penginapan  : " + py.get(idx).getPenginapan());
                                System.out.println("Biaya Tambahan    : " + py.get(idx).getTambahan());
                            }
                        }
                        else {
                            throw new Exception("Tidak ada data yang ditemukan..");
                        }
                    }
                    else if (opsi.equals("3"))
                        {
                            int i=0;
                            System.out.println("Cetak Semua Data Pembayaran");
                            System.out.println("Kode Pembayaran\tDurasi\t\tPenginapan\t\tTambahan");
                            System.out.println("-------------------------------------------------------------------");  
                            
                            for (pembayaran pembayaran :py) {
                                pembayaran.tampilpembayaran();

                            }  
                        }
                }
                else if(pilihan.equals("3")) {
                    System.out.println("Jenis Kamar");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Kamar Yang Terisi");
                    System.out.println("3. Cetak Semua Kamar Yang Terisi");
                    System.out.print("Pilihan Anda [1-3] ? ");
                    String opsi = keyboard.next();
    
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Kamar Yang Dipakai");
                        System.out.println("--------------------");
                        System.out.println("Jenis kamar [Standard/Superior/Deluxe]");
                        String pilihan1 = keyboard.next();
                        if (pilihan1.equals("Superior")) {
                        System.out.print("Kode      : ");
                        String kode = keyboard.next();
                        sp.add(new Superior( kode));
                        }
                        else if (pilihan1.equals("Standard")) {
                            System.out.print("Kode      : ");
                            String kode = keyboard.next();
                            sd.add(new Standard( kode));
                            }
                        else if (pilihan1.equals("Deluxe")) {
                            System.out.print("Kode      : ");
                            String kode = keyboard.next();
                            d.add(new Deluxe( kode));
                            }
                        }
                        else if (opsi.equals("3"))
                        {
                            System.out.println("Cetak Semua Kamar Yang Terisi");
                            System.out.println("Kode Kamar\tJenis\t\tHarga\t\tKapasitas");
                            System.out.println("-------------------------------------------------------------------");  
                            for (Standard standard : sd) {
                                
                                standard.tampilstandard();
                            }  
                            for (Superior superior : sp) {
                                superior.tampilsuperior();
                            }  
                            for (Deluxe Deluxe:d) {
                                Deluxe.tampildeluxe();
                            }  
                        }
                    else if (opsi.equals("2")) {
                    System.out.println("Cetak Kamar Yang Terisi");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Jenis Kamar [Superior/Standard/Deluxe] : ");
                    String pilihan1 = keyboard.next();
                    if (pilihan1.equals("Superior")) {
                    System.out.println("\t\t\tData Kamar");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Kode Kamar\tJenis\t\tHarga\t\tKapasitas");
                    System.out.println("-------------------------------------------------------------------");  
                    for (Superior superior : sp) {
                        superior.tampilsuperior();
                    }  
                        }
                    else if (pilihan1.equals("Standard")) {
                    System.out.println("\t\t\tData Kamar");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Kode Kamar\tJenis\t\tHarga\t\tKapasitas");
                    System.out.println("-------------------------------------------------------------------");  
                    for (Standard standard : sd) {
                     
                        standard.tampilstandard();
                    }  
                        }
                        else if (pilihan1.equals("Deluxe")) {
                            System.out.println("\t\t\tData Kamar");
                            System.out.println("-------------------------------------------------------------------");
                            System.out.println("Kode Kamar\tJenis\t\tHarga\t\tKapasitas");
                            System.out.println("-------------------------------------------------------------------");  
                            for (Deluxe Deluxe:d) {
                                Deluxe.tampildeluxe();
                            }  
                                }
                        }
                        else {
                            throw new Exception("Tidak ada data yang ditemukan..");
                        }
                    
                }

                else if(pilihan.equals("4")) {
                    System.out.println("Status");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Status");
                    System.out.print("Pilihan Anda [1-2] ? ");
                    String opsi = keyboard.next();
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Status");
                        System.out.println("--------------------");
                        System.out.print("Kode Status         : ");
                        String kode = keyboard.next();
                        System.out.print("Metode Pembayaran   : ");
                        String metode = keyboard.next();
                        System.out.print("Jenis kamar         : ");
                        String jenis = keyboard.next();
                        System.out.print("Kode kamar          : ");
                        String kodek = keyboard.next();
                        System.out.print("Status              : ");
                        String status = keyboard.next();
                        System.out.print("Durasi              : ");
                        String durasi = keyboard.next();
                        sts.add(new status( kode, metode, jenis, kodek, status, durasi  ));
                    }
                    else if (opsi.equals("2")) {
                        System.out.println("Cetak Data Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Masukkan Kode : ");
                        String kode = keyboard.next();
                        if (sts.size()>0) {
                            int idx = getIndexFromStatus(sts, kode);
                            if (idx == -1) {
                                throw new Exception("kode yang Anda masukkan invalid");
                            }
                            else {
                                clearScreen();
                                System.out.println("Data Pembayaran");
                                System.out.println("--------------");
                                System.out.println("Kode           : " + sts.get(idx).getKode());
                                System.out.println("Metode         : " + sts.get(idx).getMetode());
                                System.out.println("Jenis          : " + sts.get(idx).getKeterangan());
                                System.out.println("Kode kamar     : " + sts.get(idx).getKodek());
                                System.out.println("Status         : " + sts.get(idx).getStatus());
                                System.out.println("Durasi         : " + sts.get(idx).getDurasi());
                            }
                        }
                        else {
                            throw new Exception("Tidak ada data yang ditemukan..");
                        }
                    }

                }
                else if (pilihan.equals("5")) {
                    jenisp.jenispembayarn();
                }
            
                else if (pilihan.equals("6")) {
                    break;
                }
    
                else {
                    throw new Exception("Pilihan tidak tersedia..");
                }
    
                System.out.print("\nKembali ke halaman utama [y/n] ? ");
                yn = keyboard.next();
            }
clearScreen();
System.out.println("\nTerima Kasih!\n");
keyboard.close();
}
}
