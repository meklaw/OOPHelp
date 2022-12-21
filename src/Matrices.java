public final class Matrices {
    private Matrices() {
    }

    public static Matrix sum(Matrix aMatrix, Matrix bMatrix) {
        if (aMatrix.getHeight() != bMatrix.getHeight() ||
                aMatrix.getWidth() != bMatrix.getWidth())
            throw new RuntimeException("руки кривые: нельзя скадывать матрицы разных размеров по законам алгебры :с");

        int height = aMatrix.getHeight();
        int width = aMatrix.getWidth();
        int[][] values = new int[height][width];
        int[][] aVal = aMatrix.getValues();
        int[][] bVal = bMatrix.getValues();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                values[y][x] = aVal[y][x] + bVal[y][x];
            }
        }

        return new Matrix(height, width, values);
    }

    public static Matrix multiply(Matrix matrix, int n) {
        int height = matrix.getHeight();
        int width = matrix.getWidth();
        int[][] values = new int[height][width];
        int[][] aVal = matrix.getValues();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                values[y][x] = aVal[y][x] * n;
            }
        }

        return new Matrix(height, width, values);
    }

    public static Matrix multiply(Matrix aMatrix, Matrix bMatrix) {
//        TODO
        return null;
    }
}
