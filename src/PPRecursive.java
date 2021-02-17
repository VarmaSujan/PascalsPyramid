
import java.util.Scanner;

public class PPRecursive {
    public static void print(int nrows){
        for (int i = 0; i < nrows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(recur(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int recur(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        }
        else {
            return recur(i - 1, j - 1) + recur(i - 1, j);
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of pyramid rows:");
        int row = userInput.nextInt();
        print(row);
        //for (int x = 0; x <10; x++);
        System.out.println("The end");
    }
}

