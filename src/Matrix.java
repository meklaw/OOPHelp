public class Matrix {
    private final int height;
    private final int width;


    private final int[][] values;

    public Matrix(int height, int width, int[][] values) {
        this.height = height;
        this.width = width;
        this.values = values;

    }

    public Matrix sum(Matrix anotherMatrix) {
        return Matrices.sum(this, anotherMatrix);
    }

    public Matrix multiply(int n) {
        return Matrices.multiply(this, n);
    }

    public Matrix multiply(Matrix anotherMatrix) {
        return Matrices.multiply(this, anotherMatrix);
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int[][] getValues() {
        return values;
    }
}
