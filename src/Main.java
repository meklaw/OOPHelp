public class Main {
    public static void main(String[] args) {
        int h = 3;
        int w = 3;
        int a1[][] = {
                {3, -1, 2},
                {4, 2, 0},
                {-5, 6, 1}
        };
        int a2[][] = {
                {8, 1},
                {7, 2},
                {2, -3}
        };


        Matrix matrix1 = new Matrix(h, w, a1);
        Matrix matrix2 = new Matrix(3, 2, a2);

        matrix1.multiply(matrix2).print();


        Matrix matrix3 = new Matrix(1, 3, new int[][]{
                {3, -1, 2}
        });
        Matrix matrix4 = new Matrix(3, 1, new int[][]{
                {8},
                {7},
                {2}
        });

        Matrices.multiply(matrix3, matrix4).print();
    }
}