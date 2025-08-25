package access.ex;

public class MaxCounter {
    private int count = 0;
    int max;

    MaxCounter(int max) {
        this.max = max;
    }

    int increment(){
        if(count < max){
            return count++;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
            return count;
        }
    }

    int getCount(){
        return count;
    }
}
