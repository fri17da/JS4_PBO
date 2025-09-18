import java.util.ArrayList;
public class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Peminjaman> daftarPinjam;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.daftarPinjam = new ArrayList<Peminjaman>();
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Peminjaman> getDaftarPinjam() {
        return daftarPinjam;
    }

    public void tambahPinjam(Peminjaman p) {
        daftarPinjam.add(p);
    }

    public void tampilPinjam() {
        System.out.println("Data Pinjaman Anggota: " + nama);
        if (daftarPinjam.isEmpty()) {
            System.out.println("Belum ada peminjaman.");
        } else {
            for (Peminjaman p : daftarPinjam) {
                p.tampilInfo();
            }
        }
    }
}