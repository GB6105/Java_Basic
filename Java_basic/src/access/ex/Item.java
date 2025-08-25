package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    // 직접 사용되지 않으므로 필요 없는 getter
//    public int getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }

    //반복적으로 사용되는 값이므로 메서드로 만들어주면 됨
    public int getTotalPrice(){
        return price * quantity;
    }
}
