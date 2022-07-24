import java.util.Scanner;
public class jenispembayaran extends pembayaran{
    Scanner temp = new Scanner(System.in);
    double totaltagihan;

    public int hitung(int durasi)
    {
        System.out.println("Masukkan jenis kamar[Standard/Deluxe/Superior] : ");
        String jenis = temp.next();
        if (jenis.equals("Standard"))
        {
            int tagihan=300000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Deluxe"))
        {
            int tagihan=400000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Superior"))
        {
            int tagihan=600000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        return durasi;
    }
    public void hitung (String jenis,int a)
    {
        
        if (jenis.equals("Credit"))
        {
            double diskon = 1.05*a;
            System.out.println("Tagihan setelah diskon : "+diskon);
        }
        else if (jenis.equals("Debit"))
        {
            double diskon = 1*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        else if (jenis.equals("Cash"))
        {
            double diskon = 0.95*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        
    }
    public static void bubbleSort(int [] sort_arr, int len){
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }
    int x=0;
    
    public void simpandata()
    {
        for(int i=0;i<1;i++)
        {
            x++;
            
        }
        
        System.out.println("Apakah anda ingin menggunakan sort [y/n]? ");  
        String jwb = temp.next();
        if (jwb.equals("y"))
        {  
            System.out.println("Silahkan masukkan jumlah data yang akan disimpan : "); 
            int n= temp.nextInt(); 
            int[] array = new int[n];
            System.out.println("Silahkan masukkan total yang akan disimpan : ");  
            for(int i=0;i<n;i++)
        {
            array[i]=temp.nextInt();
        }
            System.out.println("Data yang sudah disimpan (Disusun dari nominal kecil)");
            bubbleSort(array,array.length);
        for (int i=0;i<array.length;++i)
        {
            System.out.println(""+array[i]);
            
        } 
        }
        else
        {
            System.out.println("Terima Kasih ");  
        }
      
    }
    
    public  void jenispembayarn()
    {
     
        System.out.println("Masukkan durasi penginapan : ");
        int durasi = temp.nextInt();
        hitung(durasi);
        System.out.println("Masukkan jenis pembayaran[Credit/Debit/Cash] : ");
        String jenis1 = temp.next();
        System.out.println("Tagihan anda : ");
        int tagihan = temp.nextInt();
        hitung(jenis1,tagihan);
        simpandata();
        
}
}
