import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ar[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        Matrix m1 = new Matrix(h,w, ar);
        Matrix m2 = new Matrix(h, w, ar);
        m1.sum(m2);

    }
}