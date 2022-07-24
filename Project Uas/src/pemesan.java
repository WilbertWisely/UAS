

public class pemesan {
    private String nama,alamat,notelp,kamar;
    private int durasi;

    public pemesan() {
    }

    public pemesan(String nama, String alamat, String notelp, String kamar, int durasi) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.kamar= kamar;
        this.durasi = durasi;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return this.notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getKamar() {
        return this.kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public int getDurasi() {
        return this.durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    
    public void tampilpemesan() {
        System.out.println(nama + "\t\t" + alamat + "\t" + notelp+ "\t"+ kamar+"\t"+durasi);
    }
}
