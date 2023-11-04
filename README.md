# Assignment1

## Nomor 1
program ini akan mencetak angka dari 1 sampai 9 dan kemudian mencetak string "Muhammad Hafizh Ario Diffo" sebanyak 91 kali.
```sh
   for (int nilai = 1; nilai <= 9; nilai++) {

            System.out.println(nilai);
        }
        for (int nilai = 10; nilai <= 100; nilai++){

            System.out.println("Muhammad Hafizh Ario Diffo");
        }
   ```

## Nomor 2
Program tersebut merupakan kalkulator sederhana dalam Java yang meminta pengguna untuk memilih operasi matematika (penjumlahan, pengurangan, perkalian, atau pembagian) melalui terminal. Program akan terus berjalan sampai pengguna memilih untuk keluar (dengan memasukkan '0'). Operasi matematika yang dipilih dijalankan setelah pengguna memasukkan dua bilangan. Hasil operasi ditampilkan, dan jika input pengguna di luar rentang yang valid, program memberikan pesan kesalahan.
```sh
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opsi;
        double bilangan1, bilangan2;
        double hasil = 0;

        while (true) {
            System.out.println("\nPilih operasi matematika:");
            System.out.println("0. Keluar");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (x)");
            System.out.println("4. Pembagian (:)");
            System.out.print("\nMasukkan pilihan: ");
            opsi = input.next().charAt(0);

            if (opsi == '0') {
                System.out.println("\nTerima kasih :)");
                break;
            }

            if (opsi >= '1' && opsi <= '4') {
                System.out.print("Bilangan ke-1: ");
                bilangan1 = input.nextDouble();
                System.out.print("Bilangan ke-2: ");
                bilangan2 = input.nextDouble();

                if (opsi == '1') {
                    hasil = bilangan1 + bilangan2;
                } else if (opsi == '2') {
                    hasil = bilangan1 - bilangan2;
                } else if (opsi == '3') {
                    hasil = bilangan1 * bilangan2;
                } else if (opsi == '4') {
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Tak terdefinisi");
                        continue;
                    }
                }
                System.out.println("HASIL: " + hasil);
            } else {
                System.out.println("Pilihan hanya dari nomor 1-4");
            }
        }
        input.close();
    }
   ```

## Nomor 3
Program tersebut memungkinkan pengguna untuk memasukkan tanggal lahir dan bulan, dan kemudian menentukan zodiak yang sesuai dengan input tersebut. Jika pengguna memasukkan '0 0', program akan berhenti. Fungsi determineZodiacSign menentukan zodiak berdasarkan tanggal dan bulan yang dimasukkan, dan hasilnya ditampilkan.
```sh
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            int tanggal, bulan;
            System.out.println("\nMasukkan tanggal lahir atau masukkan 0 0 untuk keluar");
            System.out.print("Tanggal: ");
            tanggal = input.nextInt();
            System.out.print("Bulan: ");
            bulan = input.nextInt();

            if (tanggal == 0 && bulan == 0) {
                System.out.println("Terima kasih :)");
                repeat = false;
            } else {
                String zodiacSign = determineZodiacSign(tanggal, bulan);
                if (zodiacSign.equals("Invalid")) {
                    System.out.println("Tanggal yang dimasukkan tidak masuk akal");
                } else {
                    System.out.println("Tanggal tersebut mempunyai Zodiac " + zodiacSign);
                }
            }
        }
        input.close();
    }

    public static String determineZodiacSign(int tanggal, int bulan) {
        if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            return "Aries";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            return "Taurus";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            return "Gemini";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            return "Cancer";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            return "Leo";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            return "Virgo";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            return "Libra";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            return "Scorpio";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            return "Sagittarius";
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            return "Capricorn";
        } else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            return "Aquarius";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            return "Pisces";
        } else {
            return "Invalid";
        }
    }
   ```
## Nomor 4
Kode tersebut membuat sebuah array integer yang berisi angka 1 hingga 10. Selanjutnya, menggunakan loop for, program mencetak setiap elemen dari array tersebut dalam format yang terpisah dengan tanda strip (-) di depannya. Hasilnya adalah mencetak angka 1 sampai 10 dengan format "- angka" pada setiap barisnya.
```sh
   public static void main(String[] args) {
        // Array dengan tipe data integer
        int[] nomor = {1, 2,3,4,5,6,7,8,9,10};

        System.out.println("1) Array NOMOR:");
        for (int i = 0; i < nomor.length; i++) {
            System.out.println("- " + nomor[i]);
        }
    }
   ```
