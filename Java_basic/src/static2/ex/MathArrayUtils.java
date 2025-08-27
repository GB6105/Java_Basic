package static2.ex;

public class MathArrayUtils {

    // private 인스턴스 생성 방지용 생성자
    private MathArrayUtils() {

    }

    public static int sum(int[] array){
        int total = 0;
        for(int i : array){
            total += i;
        }
        return total;
    }

//    public static float average(int[] array){
//        float total = 0;
//        for(int i : array){
//            total += i;
//        }
//        return total / array.length;
//    }

    public static double average(int[] array){
        return (double)sum(array)/array.length; // 기존에 선언된 메서드를 활용하기
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
