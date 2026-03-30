public interface Transaksi {
    void prosesTransaksi(double jumlah);
    String getStatus();
    void cetakBuktiTransaksi();
}