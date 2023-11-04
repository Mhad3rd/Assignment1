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
