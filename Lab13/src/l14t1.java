import java.util.Random;
import java.util.Scanner;

public class l14t1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("n");
        int N=in.nextInt();
        System.out.println("m");
        int M=in.nextInt();
        System.out.println("k");
        int k= in.nextInt();
        int[][]b=new int[N][M];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]=new Random().nextInt(-15,15);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println();
        }
        int s= 0;
        int p= 1;
        for (int i = 0; i < b.length; i++) {
            s+=b[i][k-1];
            p*=b[i][k-1];
        }
        System.out.println(s+" "+p);
    }
}
