public class DiskonPembelian {
    public static void main(String[] args) {
      // Nilai harga barang dan jumlah pembelian (contoh)
	        double hargaBarang = 100.0;
	        int jumlahPembelian = 15;

	        // Hitung total harga setelah diskon
	        double totalHarga = hargaBarang * jumlahPembelian * (1 - hitungDiskon(jumlahPembelian));

	        // Tampilkan total harga setelah diskon
	        System.out.println("Total harga setelah diskon: " + totalHarga);
	    }

	    // Metode untuk menghitung diskon berdasarkan jumlah pembelian
	    static double hitungDiskon(int jumlahPembelian) {
	        if (jumlahPembelian < 5) {
	            return 0.0;
	        } else if (jumlahPembelian <= 10) {
	            return 0.05;
	        } else if (jumlahPembelian <= 20) {
	            return 0.1;
	        } else {
	            return 0.2;
	        }
	    }
	}