public final class Matrices {
    private Matrices() {
    }

    public static Matrix sum(Matrix aMatrix, Matrix bMatrix) {
        if (aMatrix.getHeight() != bMatrix.getHeight() ||
                aMatrix.getWidth() != bMatrix.getWidth())
            throw new RuntimeException("руки кривые: нельзя скадывать матрицы разных размеров по законам алгебры :с");

//          TODO
        return null;
    }

    public static Matrix multiply(Matrix matrix, int n) {
//        TODO
        return null;
    }

    public static Matrix multiply(Matrix aMatrix, Matrix bMatrix) {
//        TODO
        return null;
    }
}
