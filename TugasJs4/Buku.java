public class Buku {
    private String kodeBuku;
    private String judul;

    public Buku(String kodeBuku, String judul) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
    }

    public String getKode() {
        return kodeBuku;
    }

    public void setKode(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void tampilInfo() {
        System.out.println("Kode Buku: " + kodeBuku + ", Judul: " + judul);
    }
}