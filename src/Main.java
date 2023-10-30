import java.util.Scanner;

class HitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/**inputan data luas lingkarang**
 *
 */
        System.out.print("Masukkan jari-jari lingkaran: ");

        double jariJari = input.nextDouble();

/**menghitung luas lingkarang**
 *
 */
        double luas = Math.PI * Math.pow(jariJari, 2);

/**outputan hasil luas lingkarang**
 *
 */
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
    }
}