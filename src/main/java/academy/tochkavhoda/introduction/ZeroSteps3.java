package academy.tochkavhoda.introduction;

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


    }
}

