package poly.ex.pay0;

public class PayService {
    private PayInterface payInterface;

    public boolean setPayInterface(PayInterface payInterface, int amount) {
        this.payInterface = payInterface;
        return payInterface.pay(amount);
    }

    public void processPay(String option, int amount){
        boolean result;
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);
        if(option.equals("kakao")){
            PayInterface kakaoPay = new KakaoPay();
            result = setPayInterface(kakaoPay, amount);
        }else if(option.equals("naver")){
            PayInterface naverPay = new NaverPay();
            result = setPayInterface(naverPay, amount);
        }else{
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if(result){
            System.out.println("결제가 성공했습니다.");

        }else{
            System.out.println("결제가 실패했습니다.");
        }
    }
}
