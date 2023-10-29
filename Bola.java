import java.util.Scanner;
class Bola1 {
    // Variabel anggota untuk menyimpan jari-jari bola
    private double jariJari;

    // Konstruktor untuk inisialisasi jari-jari bola
    public Bola1(double jariJari) {
        this.jariJari = jariJari;
    }

    // Metode untuk menghitung volume bola
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

class Bola{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari bola dari pengguna
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        // Membuat objek Bola
        Bola1 bola = new Bola1(jariJari);

        // Menghitung dan menampilkan volume bola
        double volume = bola.hitungVolume();
        System.out.println("Volume bola dengan jari-jari " + jariJari + " adalah: " + volume);

        scanner.close();
    }
}

