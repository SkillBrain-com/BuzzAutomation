package homework.andreiB.exercitii;

public class Exercitiul3 {

    public static void MegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("valoare invalida");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remaininkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB=" + megaBytes + "MB and " + remaininkilobytes + "KB");
        }

    }

    public static void main(String[] args) {
        MegaBytesAndKiloBytes(2500);
        MegaBytesAndKiloBytes(-1024);
        MegaBytesAndKiloBytes(5000);

    }
}

