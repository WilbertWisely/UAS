import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class readwrite {

   
    public static void daftarpemesan (ArrayList<pemesan> pemesan) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Data Pemesan Baru");
        System.out.println("----------------------");
        System.out.print("Nama             : ");
        String nama = keyboard.nextLine();
        System.out.print("Alamat           : ");
        String alamat = keyboard.nextLine();
        System.out.print("No Telepon       : ");
        String notelp = keyboard.nextLine();
        System.out.print("Jenis Kamar      : ");
        String kamar = keyboard.nextLine();
        System.out.print("Durasi           : ");
        int durasi = keyboard.nextInt();
        pemesan.add(new pemesan(nama, alamat, notelp, kamar, durasi));
        
        try (FileWriter dpemesan = new FileWriter("C:\\Users\\ASUS\\Downloads\\App.java\\Project UAS\\Project Uas\\src\\pemesan.txt", true)) {
            dpemesan.append("\n" + nama + "," + alamat + ","  + notelp + ","  + kamar + "," + durasi);
        }
    }
    public static void displaypemesan() throws Exception{
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Downloads\\App.java\\Project UAS\\Project Uas\\src\\pemesan.txt"))) {
            String s = "";
            while ((s = read.readLine())!= null)
            {
                String data[] = s.split(",");
               
                for(int x=0; x<data.length;x++)
                { 
                    System.out.print("|" +data[x] + "\t|");
                }
                System.out.println();
            }
        }
    }
    
    
}

