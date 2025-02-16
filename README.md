 penjelasan tentang kode progam :
import java.util.Scanner;
 digunakan untuk membaca input dari pengguna melalui keyboard.

public class TA_sem1 {
•	Suatu kelas dalam program java yang berfungsi sebagai tempat utama program berjalan.

public static void main(String[] args) {
•	Metode utama (main) yang akan dijalankan pertama kali saat program dijalankan.
•	public: agar metode ini dapat diakses dari luar kelas.
•	static: metode ini milik kelas, tidak memerlukan objek untuk dipanggil.
•	void: metode ini tidak mengembalikan nilai apa pun.

Scanner sc = new Scanner(System.in);
•	 Scanner dapat digunakan untuk membaca input dari pengguna. System.in adalah sumber input yang berasal dari keyboard.

System.out.print("Masukkan jumlah politeknik (harus lebih dari 0): ");
int jumlahPoliteknik = sc.nextInt();
•	Program ini digunakan untuk meminta pengguna untuk memasukkan jumlah politeknik.
•	System.out.print: menampilkan teks tanpa pindah baris.
•	sc.nextInt(): membaca angka (tipe int) yang dimasukkan pengguna.

sc.nextLine();
•	Digunakan untuk mengakses karakter newline (\n) yang tersisa setelah input angka, sehingga input berikutnya dapat dibaca dengan benar.

if (jumlahPoliteknik <= 0) {
    System.out.println("Jumlah politeknik tidak valid.");
    return; 
}
•	Mengecek apakah jumlah politeknik yang dimasukkan kurang dari atau sama dengan nol.
•	Jika benar, program mencetak pesan kesalahan dan menghentikan eksekusi dengan perintah return.

String[][][] atlet = new String[3][jumlahPoliteknik][3];
String[] cabor = {"Badminton", "Basket", "Bola Voli"};
•	Membuat array 3D atlet untuk menyimpan nama atlet: 
o	Dimensi pertama (3) mewakili 3 cabang olahraga.
o	Dimensi kedua (jumlahPoliteknik) mewakili jumlah politeknik.
o	Dimensi ketiga (3) mewakili 3 atlet per politeknik per cabang olahraga.

for (int olahraga = 0; olahraga < cabor.length; olahraga++) {
•	Sebuah loop yang digunakan untuk membaca setiap cabang olahraga. 
System.out.println("Masukkan nama atlet untuk cabang " + cabor[olahraga] + ":");
•	Menampilkan pesan untuk meminta pengguna memasukkan nama-nama atlet untuk cabang olahraga tertentu, sesuai indeks olahraga.
for (int politeknik = 0; politeknik < jumlahPoliteknik; politeknik++) {
•	Loop kedua digunakan untuk membaca  setiap politeknik berdasarkan jumlah yang dimasukkan pengguna.

System.out.println("Politeknik " + (politeknik + 1) + ":");
•	Menampilkan pesan untuk menunjukkan politeknik ke berapa yang sedang diisi datanya. Indeks dimulai dari 0, sehingga ditambahkan 1 agar lebih intuitif.

for (int nama = 0; nama < 3; nama++) {
•	Loop ketiga digunakan untuk membaca masukan setiap atlet (maksimum 3 atlet per politeknik).

System.out.print("Atlet " + (nama + 1) + ": ");
String namaAtlet = sc.nextLine();
•	Meminta pengguna memasukkan nama atlet tertentu.
•	Nama atlet disimpan dalam variabel namaAtlet.

if (namaAtlet.isEmpty()) {
    System.out.println("Nama atlet tidak boleh kosong. Silakan masukkan kembali.");
    nama--;
}
•	Mengecek apakah nama yang dimasukkan kosong.
•	Jika kosong, program meminta ulang input untuk atlet tersebut dengan mengurangi nilai nama agar iterasi diulangi.

atlet[olahraga][politeknik][nama] = namaAtlet;
•	Jika nama tidak kosong, nama atlet disimpan di array atlet pada indeks yang sesuai dengan cabang olahraga, politeknik, dan atlet.

System.out.println("\nInformasi Nama Atlet:");
•	Setelah semua input selesai, program mencetak informasi semua atlet yang sudah dimasukkan.

for (int olahraga = 0; olahraga < cabor.length; olahraga++) {
•	Loop untuk membaca setiap cabang olahraga.

System.out.println("Cabang " + cabor[olahraga] + ":");
•	Menampilkan nama cabang olahraga yang sedang diproses.

for (int politeknik = 0; politeknik < jumlahPoliteknik; politeknik++) {
•	Loop untuk membaca politeknik di dalam cabang olahraga tertentu.

System.out.println("Politeknik " + (politeknik + 1) + ":");
•	Menampilkan politeknik yang sedang diproses.
for (int nama = 0; nama < 3; nama++) {
•	Loop untuk membaca setiap atlet pada politeknik tertentu.

System.out.println("Atlet " + (nama + 1) + ": " + atlet[olahraga][politeknik][nama]);
•	Menampilkan nama atlet berdasarkan data yang telah disimpan di array atlet.

System.out.println();
•	Menambahkan baris kosong untuk memperjelas pemisahan informasi antara politeknik.

Kode ini memungkinkan pengguna untuk memasukkan nama-nama atlet dari beberapa politeknik untuk berbagai cabang olahraga dan kemudian menampilkan data tersebut dalam format yang terstruktur.

