public class status {
    private String metode,status,durasi,keterangan,kode,kodek;
   

    public status() {
    }

    public status(String kode, String metode,String keterangan, String kodek, String status, String durasi) {
        this.metode = metode;
        this.status = status;
        this.durasi = durasi;
        this.kodek=kodek;
        this.keterangan = keterangan;
        this.kode = kode;
    }


    public String getMetode() {
        return this.metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDurasi() {
        return this.durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKodek() {
        return this.kodek;
    }

    public void setKodek(String kodek) {
        this.kodek = kodek;
    }

    
}
