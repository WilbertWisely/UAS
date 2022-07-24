public class Standard extends kamar {
    public Standard(String kode) {
        this.kode = kode;
        this.namaKamar = "Standard";
        this.harga = 300000;
        this.kapasitas=2;
    }
    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaKamar() {
        return this.namaKamar;
    }

    public void setNamaKamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
   
   
    public void tampilstandard() {
       
        System.out.println(kode + "\t\t" + namaKamar + "\t" +harga+ "\t"+kapasitas);
    }
}
