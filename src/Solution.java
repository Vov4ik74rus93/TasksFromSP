import task01Int.Int;
import task02Matrix.Matrix;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(new Int(1000));
        int row = 3;
        int column = 5;
        Matrix a = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a.setElement(i, j, (int) (Math.random()*99));
            }
        }
        System.out.println(a);
    }
}
