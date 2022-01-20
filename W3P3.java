import java.util.Scanner;
import java.lang.Math;

public class W3P3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int i = a.nextInt();
        a.close();
        int [][] matrix = new int[i][i];
        for (int j = 0; j < matrix.length; j++) {
            for (int j2 = 0; j2 < matrix.length; j2++) {
                matrix[j][j2]=(int) (Math.random() * 2);
                System.out.print(matrix[j][j2]);
            }
            if (j != matrix.length-1) {
                System.out.println();
            }
        }
        System.out.println();
        if (i == 1) {
            checkRow(matrix);
            checkColumn(matrix);
            checkDiagonal(matrix);
        }
        else {
            checkRow(matrix);
            checkColumn(matrix);
            checkSuperdiagonal(matrix);
            checkDiagonal(matrix);
            checkSubdiagonal(matrix);
        }
    }

    public static void checkRow(int [][] matrix) {
        boolean checkAll = false;
        int num;
        for (int i = 0; i < matrix.length; i++) {
            num = matrix[i][0];
            boolean check = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != num){
                    check = false;
                }
            }
            if (check) {
                System.out.println("All " +num+ "s on row "+i);
                checkAll = true;
            }
        }
        if (!checkAll) {
            System.out.println("No same numbers on row");
        }
    }

    public static void checkColumn(int [][] matrix) {
        boolean checkAll = false;
        int num;
        for (int i = 0; i < matrix.length; i++) {
            num = matrix[0][i];
            boolean check = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] != num){
                    check = false;
                }
            }
            if (check) {
                System.out.println("All " +num+ "s on Column "+i);
                checkAll = true;
            }
        }
        if (!checkAll) {
            System.out.println("No same numbers on Column");
        }
    }

    public static void checkSuperdiagonal(int [][] matrix) {
        int check = 0;
        int num = matrix[0][1];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((j+1 == i) && (matrix[j][i] == num)) {
                    check++;
                }
            }
        }
        if (check != matrix.length-1) {
            System.out.println("No same numbers on the superdiagonal");
        }
        else {
            System.out.println("All " +num+ "s on the superdiagonal");
        }
    }

    public static void checkDiagonal(int [][] matrix) {
        boolean check = true;
        int num = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i][i] != num)) {
                check = false;
            }
        }
        if (check) {
            System.out.println("All " +num+ "s on the diagonal");
        }
        else if (!check) {
            System.out.println("No same numbers on the diagonal");
        }
    }

    public static void checkSubdiagonal(int [][] matrix) {
        int check = 0;
        int num = matrix[1][0];
        for (int j2 = 1; j2 < matrix.length; j2++) {
            for (int k = 0; k < matrix.length; k++) {
                if ((j2 == k+1) && (matrix[j2][k] == num)) {
                    check++;
                }
            }
        }
        if (check != matrix.length-1) {
            System.out.println("No same numbers on the subdiagonal");
        }
        else {
            System.out.println("All " +num+ "s on the subdiagonal");
        }
    }
}