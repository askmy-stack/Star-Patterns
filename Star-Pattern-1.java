import java.util.Scanner;

public class Patterns {

    public static void main(String[] args){
        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();

        //Adding for loops for the making the pattern
        
           //Outer Loop for Rows
        for (int rows = 1; rows <=a ; rows++) {
            
            //Inner Loops for Columns
            for (int columns = 1; columns <=a ; columns++) {
                System.out.print("* ");
            }
            // Starting a new cursor
            System.out.println();

        }
    }
}
