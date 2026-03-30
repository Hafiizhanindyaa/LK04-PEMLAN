package srcGMR;

public interface TransaksiDigital extends Transaksi {
    
    public void verifikasiOTP(String kodeOTP);
    
    public String getMetodePembayaran(); // contoh: e-wallet, mobile banking
}