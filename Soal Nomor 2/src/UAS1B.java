import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1B {
    public static void main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input jumlah data yang akan di proses : ");
        int u = Integer.parseInt(reader.readLine());
        karakter_pertama = new char[u];
        int counter = 0;
        for (int index = 0; index < u; index++) {
            counter++;
            System.out.println("Masukan Nama" + counter + " : ");
            String name = reader.readLine();
            g.add(GetHurufPertamaJadikanKapital(name));
            karakter_pertama[index] = g.get(index).charAt(0);
        }
        for (String d : g) {
            System.out.println(d + " ");
        }
        for (char karakter : karakter_pertama) {
            System.out.println(karakter);
        }
    }

    // Method untuk mengambil karakter pertama dan menjadikannya huruf besar
    public static String GetHurufPertamaJadikanKapital(String input) {
        if (input != null && input.length() > 0) {
            return Character.toUpperCase(input.charAt(0)) + input.substring(1);
        } else {
            return input;
        }
    }
}
