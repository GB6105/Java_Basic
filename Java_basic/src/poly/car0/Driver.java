package poly.car0;

public class Driver {
    private K3Car k3car;
    private Model3Car model3car;

    public void setK3Car(K3Car k3car) {
        this.k3car = k3car;
    }

    public void setModel3car(Model3Car model3car) {
        this.model3car = model3car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3car != null){
            k3car.statrEngine();
            k3car.pressAccelerator();
            k3car.offEngine();

        }else if(model3car != null){
            model3car.statrEngine();
            model3car.pressAccelerator();
            model3car.offEngine();

        }
    }
}
