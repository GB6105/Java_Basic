package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent)child; // 업케스팅은 생략 권장
        Parent parent2 = child;


    }
}

