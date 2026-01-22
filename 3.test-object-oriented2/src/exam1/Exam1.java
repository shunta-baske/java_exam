package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car supeCar = new SuperCar();
        Car ecoCar = new EcoCar();

        supeCar.setName("フェラーリ");
        ecoCar.setName("プリウス");

        supeCar.putOnGas();
        supeCar.run();
        ecoCar.putOnGas();
        ecoCar.run();


    }
}
