import java.util.Scanner;
public class a1q82darrya {
    static int[][] y(int[][] ar,int r,int c){
        int sum=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
                if(i==j)
                    sum+=ar[i][j];
            }
            System.out.println();
        }
        System.out.println("sum is "+sum);
        return ar;
    }

    public static void main(String[] args) {
        Scanner A1=new Scanner(System.in);
        int r=4;
        int c=4;
        int[][] ar=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ar[i][j]=A1.nextInt();
            }
        }
        System.out.println(y(ar,r,d));
    }
}
