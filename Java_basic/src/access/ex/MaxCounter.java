package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

//    int increment(){
//        if(count < max){
//            return count++;
//        }else{
//            System.out.println("최대값을 초과할 수 없습니다.");
//            return count;
//        }
//    }
    public void increment() {
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount(){
        return count;
    }
}
