package bridge;
interface TV{
    void on();
    void off();
    void tune();
}
class LGTV implements TV{
    public void on(){
            System.out.println("LG TV is on");
    }
    public void off(){
        System.out.println("LG TV is off");
    }
    public void tune(){
        System.out.println("LG TV is tune");
    }
}
class SonyTV implements TV{
    public void on(){
            System.out.println("Sony TV is on");
    }
    public void off(){
        System.out.println("Sony TV is off");
    }
    public void tune(){
        System.out.println("Sony TV is tune");
    }
}
// one remote for all tvs
class RemoteController{
    TV tv;
    RemoteController(TV tv){
        this.tv = tv;
    }
    void buttonOn(){
        tv.on();
    }
    void buttonOff(){
        tv.off();
    }
    void buttonTune(){
        tv.tune();
    }
}
public class Main {
    public static void main(String[] args) {
        TV sonyTv = new SonyTV();
        TV LGTV = new LGTV();
        RemoteController remoteController = new RemoteController(LGTV);
        remoteController.buttonOn();
        remoteController.buttonOff();
        remoteController.buttonTune();
    }
}
