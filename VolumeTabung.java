import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung: ");
        int r = input.nextInt();
        System.out.print("Masukkan tinggi tabung: ");
        int t = input.nextInt();

        double phi = 3.14159;
        double volume = phi * r * r * t;
        System.out.println("Volume tabung adalah: " + volume);
    }
}