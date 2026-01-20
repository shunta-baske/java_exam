public class Car {
    int speed;

    Car(int speed){
        this.speed = speed;
    }

    Car(){}


    void run(){
        speed += 50;
        System.out.println("走りました。スピードが"+speed+"km/hになりました。");
        if (speed>=120) {
            System.out.println("スピードの出しすぎです");
        }
    }

}
