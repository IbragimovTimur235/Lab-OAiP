import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n");
        int N=in.nextInt();
        System.out.println("m");
        int M=in.nextInt();
    int[][]b=new int[N][M];
        for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[0].length; j++) {
        b[i][j]=5*(j+1);
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