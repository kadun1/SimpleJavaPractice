package cooperation;

public class Taxi {

    int taxiNumber;
    int money;
    int passengerCount;

    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("택시번호 " + taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }

}
