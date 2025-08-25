package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item){
        this.items[this.itemCount] = item;
        this.itemCount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            int price = items[i].getPrice() * items[i].getQuantity();
            totalPrice += price;
            System.out.println("상품명:" + items[i].getName() + "합계: "+ price);
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
