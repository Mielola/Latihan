
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int x1, y1;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        int hasilx = (x - x1);
        int hasily = (y - y1);

        if (hasilx < 0) {
            hasilx = ((hasilx) * (-1));
        } else {
            hasilx = hasilx;
        }

        if (hasily < 0) {
            hasily = ((hasily) * (-1));
        } else {
            hasily = hasily;
        }

        System.out.println(hasilx + hasily);

    }
}