package academy.tochkavhoda.introduction;

public class ZeroSteps4 {


    public int min(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return  Integer.MAX_VALUE;
        }
        int minimum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix == null || matrix.length == 0){
                    break;
                }
                if(minimum > matrix[i][j])
                    minimum = matrix[i][j];
            }
        }
        return minimum;
    }
    public int max(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return  Integer.MIN_VALUE;
        }
        int maxi = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix == null || matrix.length == 0){
                    break;
                }
                if(maxi < matrix[i][j])
                    maxi = matrix[i][j];
            }
        }
        return maxi;
    }
    public boolean find(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isSortedDescendant(int[][] matrix){

        if (matrix == null || matrix.length == 0) return true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length <= 1) continue;
            int n = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if(n > matrix[i][j]){
                    n = matrix[i][j];
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public int hasNoZeroRows(int[][] matrix){
        if (matrix == null || matrix.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {

            boolean flag = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }
    public boolean hasFullZeroRow(int[][] matrix){
        if (matrix == null || matrix.length == 0) return false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length == 0) continue;
            boolean flag = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }
        return false;
    }
    public boolean isSymmetric(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public int mainDiagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = matrix[0][0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }

        return max;
    }
    public int mainDiagonalPositivesSum(int[][] matrix){
        if (matrix == null || matrix.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i].length == 0) return 0;
            if (matrix[i] == null) continue;
            if (matrix[i][i] >= 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }
    public int secondaryDiagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int n = matrix.length;
        int max = matrix[0][n - 1];

        for (int i = 1; i < n; i++) {
            if (matrix[i][n - 1 - i] > max) {
                max = matrix[i][n - 1 - i];
            }
        }

        return max;
    }
    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length - 1 - i;
            if (matrix[i] != null && matrix[i].length > j && matrix[i][j] > 0) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        int rows = matrix1.length;
        int[][] result = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int cols = matrix1[i].length;
            result[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
    public void transpose(int[][] matrix){
        if (matrix== null || matrix.length == 0)return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void interchange(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        for (int i = 0; i < matrix.length; i += 2) {
            int[] temp = matrix[i];
            matrix[i] = matrix[i + 1];
            matrix[i + 1] = temp;
        }
    }
    public int[] toLinearByRow(int[][] matrix) {
        if (matrix == null) return new int[0];

        int totalLength = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                totalLength += matrix[i].length;
            }
        }
        int[] linear = new int[totalLength];

        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    linear[index++] = matrix[i][j];
                }
            }
        }
        return linear;
    }
    public int[] toLinearByColumn(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int n = matrix.length;
        int[] result = new int[n * n];
        int index = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                result[index++] = matrix[i][j];
            }
        }

        return result;
    }
    public int[] toLinearByRowUpperTriangle(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int linesize = matrix.length;
        int size = linesize * (linesize + 1) /2;
        int[] linear = new int[size];

        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i ;j < matrix.length; j++) {
                linear[index++] = matrix[i][j];
            }
        }
        return linear;
    }
    public int sumUntilNotFoundInRow(int[][] matrix, int barrier) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == barrier) {
                    break;
                }
                total += matrix[i][j];
            }
        }

        return total;
    }
    public int sumUntilNotFound(int[][] matrix, int barrier) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == barrier) {
                    return total;
                }
                total += matrix[i][j];
            }
        }

        return total;
    }
}


