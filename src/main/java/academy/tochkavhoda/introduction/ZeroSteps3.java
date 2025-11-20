package academy.tochkavhoda.introduction;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Arrays;

public class ZeroSteps3 {

    public int sum(int[] array){
        int length = array.length;
        int total = 0;
        for (int i = 0; i < length; i++){
            total = total + array[i];
        }

        return total;
    }

    public int mul(int[] array) {
        int mulet;
        if (array.length != 0){
            mulet = 1;
            int length = array.length;
            for (int i = 0; i < length; i++) {
                mulet = mulet * array[i];
            }
        }else{
            mulet = 0;
        }
        return mulet;
    }

    public int min(int[] array){
        if(array.length == 0 ){
            return Integer.MAX_VALUE;
        }

        int minVal = array[0];
        for(int i = 0; array.length - 1  > i; i++) {
            if(minVal > array[i+1]){
                minVal = array[i+1];
            }
        }
        return minVal;
    }

    public int max(int[] array){
        if(array.length == 0 ){
            return Integer.MIN_VALUE;
        }

        int maxVal = array[0];
        for(int i = 0; array.length - 1  > i; i++) {
            if(maxVal < array[i+1]){
                maxVal = array[i+1];
            }
        }
        return maxVal;
    }

    public double average(int[] array){
        if(array.length == 0)
            return 0;

        return (double)sum(array) / array.length;

    }

    public boolean isSortedDescendant(int[] array){
        if(array.length == 0)
            return true;

        for(int i = 0; array.length - 1 > i; i++){
            if(array[i] <= array[i+1]){
                return false;
            }
        }
        return true;
    }
    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for(int i = 0; array.length > i; i++){
            if(value == array[i]){
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    public boolean isPalindrome(int[]array){
        if (array == null) return true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public void replaceBySquare(int[] array){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) break;
            array[i] = array[i] * array[i];
        }
    }

    public int mulNonZero(int[] array){
        if(array.length == 0)
            return 0;

        int mulet = 1;
        for(int i = 0; array.length > i; i++){
            if(array[i] != 0){
                mulet = mulet * array[i];
            }
        }
        return mulet;
    }

    public boolean allPositive(int[] array){
        if(array.length == 0)
            return false;
        int min = 0;
        boolean flag = true;
        for(int i = 0; i < array.length; i++){
            if(min >= array[i]){
                flag = false;
                break;
            }
        }
        if(flag == false){
            return flag;
        }

        return flag;
    }

    public boolean allEqual(int[] array){
        if(array.length == 0)
            return true;
        int num = array[0];
        for(int i = 0; i < array.length; i++){
            if(num != array[i])
                return false;
        }
        return true;
    }

    public int greaterThanNeighbours(int[] array){
        for(int i = 1; i < array.length - 1; i++){
            int numBefore = array[i-1];
            int numAfter = array[i+1];
            if(numAfter < array[i] & numBefore < array[i])
                return i;
        }
        return -1;
    }

    public boolean neighboursAverage(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            double numBefore = array[i - 1];
            double numAfter = array[i + 1];
            if (array[i] == (numAfter + numBefore) / 2) {
                return true;
            }

        }
        return false;
    }

    public int sumBetween2Zeros(int[] array){
        int sum = 0;
        int frstNullIndex = 0;
        int twsrtNullIndex = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0){
                frstNullIndex = i;
                break;
            }
        }
        for(int i = frstNullIndex + 1; i < array.length; i++){
            if (array[i] == 0){
                twsrtNullIndex = i;
                break;
            }
        }
        for(int i = frstNullIndex; i < twsrtNullIndex + 1   ; i++){
            sum = sum + array[i];
        }
        return sum;
    }
    public int sameAtPosition(int[] array1, int[] array2) {
        int count = 0;

        for (int i = 0; i < array1.length && i < array2.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }

        return count;
    }
    public boolean bothZeroAtPosition(int[] array1, int[]array2){
        for (int i = 0; i < array1.length && i < array2.length; i++) {
            if (array1[i] == array2[i] & array1[i] == 0){
                return true;
            }
        }
        return false;
    }
    public void accumulatedSum(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
    }
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Сливаем массивы пока есть элементы в обоих
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // Добавляем оставшиеся элементы из array1 (если есть)
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        // Добавляем оставшиеся элементы из array2 (если есть)
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }
    public int insideCircle(int[] x, int[] y, int radius) {
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (Math.hypot(x[i], y[i]) <= radius) {
                count++;
            }
        }

        return count;
    }
    public double scalarProduct(double[] array1, double[] array2) {
        double result = 0.0;

        for (int i = 0; i < array1.length; i++) {
            result += array1[i] * array2[i];
        }

        return result;
    }
}


