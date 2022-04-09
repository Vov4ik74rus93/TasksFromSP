import task01Int.Int;
import task02Matrix.Matrix;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(new Int(1000));
        Matrix matrix = new Matrix(2,2);
        matrix.setElement(0,0,1);
        matrix.setElement(1,0,1);
        matrix.setElement(0,1,1);
        System.out.println(matrix);

        Matrix result = matrix;
        for (int i = 0; i < 10; i++) {
            System.out.println(result = result.product(matrix));
        }
    }
}
