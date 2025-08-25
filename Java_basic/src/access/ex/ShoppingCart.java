package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item){
        //제약조건 반영
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        //이름이 겹치는 곳이 없으므로 this가 필요하진 않지만 써도 상관은 없음
        this.items[this.itemCount] = item;
        this.itemCount++;
    }

    //메서드 사용으로 더 간편해진 구조로 개선
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++){
            System.out.println("상품명:" + items[i].getName() + "합계: "+ items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice()); // 총 합도 메서드로 추출
    }

    // 내부에서만 호출 되므로 private
    // 총합 구하기 메서드 추가로 분리
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
