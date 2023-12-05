public class Kalkulator {
    public static void main(String[] args) {
    // Masukkan angka-angka yang ingin dioperasikan
    double angka1 = 10.0;
    double angka2 = 5.0;

    // Operasi penjumlahan
    penjumlahan(angka1, angka2);

    // Operasi pengurangan
    pengurangan(angka1, angka2);

    // Operasi perkalian
    perkalian(angka1, angka2);

    // Operasi pembagian
    pembagian(angka1, angka2);
}

// Metode untuk operasi penjumlahan
static void penjumlahan(double a, double b) {
    double hasil = a + b;
    System.out.println("Hasil Penjumlahan: " + hasil);
}

// Metode untuk operasi pengurangan
static void pengurangan(double a, double b) {
    double hasil = a - b;
    System.out.println("Hasil Pengurangan: " + hasil);
}

// Metode untuk operasi perkalian
static void perkalian(double a, double b) {
    double hasil = a * b;
    System.out.println("Hasil Perkalian: " + hasil);
}

// Metode untuk operasi pembagian
static void pembagian(double a, double b) {
    if (b != 0) {
        double hasil = a / b;
        System.out.println("Hasil Pembagian: " + hasil);
    } else {
        System.out.println("Pembagian oleh nol tidak diperbolehkan.");
    }
}