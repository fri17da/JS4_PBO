import java.util.ArrayList;
public class Peminjaman {
    private String idPeminjaman;
    private String tanggalPinjam;
    private String tanggalKembali;
    private ArrayList<Buku> daftarPinjam;

    public Peminjaman(String idPeminjaman, String tanggalPinjam, String tanggalKembali) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.daftarPinjam = new ArrayList<>();
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public ArrayList<Buku> getDaftarPinjam() {
        return daftarPinjam;
    }

    public void tambahPinjam(Buku b) {
        daftarPinjam.add(b);
    }

    public void tampilInfo() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
        System.out.println("Daftar Buku: ");
        if (daftarPinjam.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
        } else {
            for (Buku b : daftarPinjam) {
                b.tampilInfo();
            }
        }
        System.out.println("-------------------------");
    }
}
