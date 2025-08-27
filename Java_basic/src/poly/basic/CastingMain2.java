package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        Parent poly = new Child();
        //단 자식의 기능은 호출 할 수 없다.
        //poly.chidMethod();

        //다운 캐스팅(부모 타입 -> 자식 타입)
//        Child child = (Child) poly; // x001
//        child.childMethod();

        //일시적 다운 캐스팅
        ((Child) poly).childMethod();

    }

}
