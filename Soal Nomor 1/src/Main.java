import java.util.ArrayList;

public class Main {

    // Method untuk menambahkan elemen ke ArrayList
    public static void tambahElemen(ArrayList<Integer> arrayList, int nilai) {
        arrayList.add(nilai);
    }

    // Method untuk menghitung jumlah elemen dalam ArrayList
    public static int hitungJumlah(ArrayList<Integer> arrayList) {
        return arrayList.size();
    }

    // Method untuk mencari nilai tertentu dalam ArrayList
    public static boolean cariNilai(ArrayList<Integer> arrayList, int nilai) {
        return arrayList.contains(nilai);
    }

    // Method untuk menampilkan semua elemen dalam ArrayList
    public static void tampilkanElemen(ArrayList<Integer> arrayList) {
        for (Integer nilai : arrayList) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat ArrayList dengan tipe data Integer
        ArrayList<Integer> daftarNilai = new ArrayList<>();

        // Menambahkan elemen ke ArrayList menggunakan method tambahElemen
        tambahElemen(daftarNilai, 10);
        tambahElemen(daftarNilai, 20);
        tambahElemen(daftarNilai, 30);

        // Menampilkan elemen-elemen dalam ArrayList menggunakan method tampilkanElemen
        System.out.print("Elemen dalam ArrayList: ");
        tampilkanElemen(daftarNilai);

        // Menghitung jumlah elemen dalam ArrayList menggunakan method hitungJumlah
        System.out.println("Jumlah elemen dalam ArrayList: " + hitungJumlah(daftarNilai));

        // Mencari nilai tertentu dalam ArrayList menggunakan method cariNilai
        int nilaiCari = 20;
        if (cariNilai(daftarNilai, nilaiCari)) {
            System.out.println("Nilai " + nilaiCari + " ditemukan dalam ArrayList.");
        } else {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan dalam ArrayList.");
        }
    }
}
