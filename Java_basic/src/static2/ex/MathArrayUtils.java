package static2.ex;

public class MathArrayUtils {


    public static int sum(int[] array){
        int total = 0;
        for(int i : array){
            total += i;
        }
        return total;
    }

    public static float average(int[] array){
        float total = 0;
        for(int i : array){
            total += i;
        }
        return total / array.length;
    }

    public static int min(int[] array){
        int min = array[0];
        for(int i : array){
            min = Math.min(min, i);
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for(int i : array){
            max = Math.max(max, i);
        }
        return max;
    }
}
