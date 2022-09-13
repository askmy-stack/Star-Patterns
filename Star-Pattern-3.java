import java.util.Scanner;

public class Star_Pattern_3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int row = a-1; row>=0 ; row--) {
            for (int column = 0; column <=row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
