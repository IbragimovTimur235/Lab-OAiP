import java.util.Random;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n");
        int N=in.nextInt();
        System.out.println("m");
        int M=in.nextInt();
        int[][]b=new int[N][M];
        for (int i = 0; i < b[0].length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i]=new Random().nextInt(-15,15);
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println();
        }
        System.out.println("k");
        int k=in.nextInt();
        for (int i = 0; i < b.length; i++) {
                System.out.println(b[i][k-1]);
        }

    }
}
