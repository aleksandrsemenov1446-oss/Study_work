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
    public boolean isSymmetric(int[][] matrix){
        if (matrix == null || matrix.length == 0) return true;
        return false;
    }
}


