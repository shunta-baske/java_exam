package exam1;

public class EcoCar extends Car{
    public void run(){
        // super.run();
        System.err.println("シーン！"+getName()+"が走ります");
    }
}
