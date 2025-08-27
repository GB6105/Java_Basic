package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child = new Parent(); // 자식은 부모를 담을 수 없다.

        //poly.chidMethod(); 자식의 기능은 호출 할 수 없다. 컴파일 에러


    }
}
