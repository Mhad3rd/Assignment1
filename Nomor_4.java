public class Nomor_4 {

    public static void main(String[] args) {
        // Array dengan tipe data integer
        int[] nomor = {1, 3, 5, 7, 11};

        System.out.println("1) Array NOMOR:");
        for (int i = 0; i < nomor.length; i++) {
            System.out.println("- " + nomor[i]);
        }

        // Array dengan tipe data String
        String[] nama = {"Upin", "Ipin", "Susanti", "Fizi", "Ehsan"};

        System.out.println("\n2) Array NAMA:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("- " + nama[i]);
        }

        // Array dengan tipe data double
        double[] nilai = {1.2, 3.4, 5.6, 7.8, 9.9};

        System.out.println("\n3) Array NILAI:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("- " + nilai[i]);
        }
    }
}