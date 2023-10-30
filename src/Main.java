import java.util.Scanner;

class HitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * Math.pow(jariJari, 2);

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
    }
}