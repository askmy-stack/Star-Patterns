import java.util.Scanner;

public class Star_Pattern_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int rows = 1; rows <=a ; rows++) {

            for (int columns = 1; columns <=rows ; columns++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
