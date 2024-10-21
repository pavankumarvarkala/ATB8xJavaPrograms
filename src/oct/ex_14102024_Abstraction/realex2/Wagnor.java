package oct.ex_14102024_Abstraction.realex2;

public class Wagnor extends Engine{
    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping Car");
    }
}
