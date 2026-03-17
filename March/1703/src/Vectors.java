class Vector extends Polynomial{
    public Vector(double[] coefficients){
        super(coefficients);
    }
    @Override
    public <T extends Polynomial> double[] sumation(T two){
        if(this.getDegree() != two.getDegree()){
            System.out.println("Cannot add!");
            return null;
        }
        return super.sumation(two);
    }
    public static double[][] vectorMatrix(Vector[] arr){
        double[][] matrix = new double[arr.length][arr[0].getDegree()];
        for(int i = 0; i < arr.length; i++){
            matrix[i] = arr[i].getCoefficients();
        }
        return matrix;
    }
    public static double determinant(double[][] matrix) {
        int n = matrix.length;

        // Base cases
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinant(subMatrix(matrix, 0, col));
        }
        return det;
    }

    // Removes row and column i,j to produce the minor matrix
    private static double[][] subMatrix(double[][] matrix, int excludeRow, int excludeCol) {
        int n = matrix.length;
        double[][] sub = new double[n - 1][n - 1];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == excludeRow) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == excludeCol) continue;
                sub[r][c++] = matrix[i][j];
            }
            r++;
        }
        return sub;
    }
    public double scalar(Vector two){
        double sum = 0;
        for(int i = 0; i < this.getDegree(); i++){
            sum += (this.getCoefficients()[i] * two.getCoefficients()[i]);
        }
        return sum;
    }
}
public class Vectors {
    public static void main(String[] args) {
        Vector one = new Vector(new double[]{4.0, 1.0});
        Vector two = new Vector(new double[]{2.0, -3.0});
        System.out.print("The two vectors are ");
        System.out.print((Vector.determinant(Vector.vectorMatrix(new Vector[]{one, two})) != 0) ? "not" : "");
        System.out.print(" dependent and");
        if(one.scalar(two) != 0) System.out.print(" not ");
        System.out.print(" orthogonal!");
    }
}
