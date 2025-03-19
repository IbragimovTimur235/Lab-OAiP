import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n");
        int N=in.nextInt();
        System.out.println("m");
        int M=in.nextInt();
        int[][]b=new int[N][M];
        for (int i = 0; i < b[0].length; i++) {
            System.out.println("num");
            int num=in.nextInt();
            for (int j = 0; j < b.length; j++) {
                b[j][i]=num;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println();
        }

    }
}
