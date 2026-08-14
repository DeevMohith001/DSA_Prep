package OOPs.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        player.start();
    }

    public void startMusic(){
        player.start();
    }

    public void upgradeEngine(Engine engine){
        this.engine=engine;
    }
}
