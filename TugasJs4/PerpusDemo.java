public class PerpusDemo {
    public static void main(String[] args) {
        // Buat beberapa buku
        Buku b1 = new Buku("B001", "Pemrograman Java");
        Buku b2 = new Buku("B002", "Struktur Data");
        Buku b3 = new Buku("B003", "Basis Data");

        // Buat anggota
        Anggota a1 = new Anggota("A001", "Andi");
        Anggota a2 = new Anggota("A002", "Budi");

        // Buat peminjaman
        Peminjaman p1 = new Peminjaman("P001", "2021-09-01", "2021-09-10");
        p1.tambahPinjam(b1);
        p1.tambahPinjam(b2);

        Peminjaman p2 = new Peminjaman("P002", "2021-09-05", "2021-09-15");
        p2.tambahPinjam(b3);

        // Tambahkan peminjaman ke anggota
        a1.tambahPinjam(p1);
        a2.tambahPinjam(p2);

        // Tampilkan informasi
        a1.tampilPinjam();
        a2.tampilPinjam();
    }
}
