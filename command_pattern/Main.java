package command_pattern;
interface Light{
    void on();
    void off();
}
class LivingRoom implements Light{
    public void on(){
        System.out.println("Living room light is on");
    }
    public void off(){
        System.out.println("Living room light is off");
    }
}
class BedRoom implements Light{
    public void on(){
        System.out.println("Bed room light is on");
    }
    public void off(){
        System.out.println("Bed room light is off");
    }
}
/// command
interface Command{
    void execute();
}
class OnCommand implements Command{
        Light light;
        OnCommand(Light light){
            this.light = light;
        }
        public void execute(){
                light.on();
        }
}
class OffCommand implements Command{
        Light light;
        OffCommand(Light light){
            this.light = light;
        }
        public void execute(){
                light.off();
        }
}

// receiver ---------------------
class LightRemoteController{
    Command onCommand;
    Command offCommand;

    void setOnCommand(Command onCommand){
        this.onCommand = onCommand;
    }
    void setOffCommand(Command offCommand){
        this.offCommand = offCommand;
    }
    void onBtn(){
        onCommand.execute();
    }
    void offBtn(){
        offCommand.execute();
    }

}


// invoker ---------------------------
public class Main {
    public static void main(String[] args) {
        LightRemoteController lightRemoteController = new LightRemoteController();

        Light LivingRoom = new LivingRoom();

        Command onCommand = new OnCommand(LivingRoom);
        Command offCommand = new OffCommand(new BedRoom());
       
    
        lightRemoteController.setOnCommand(onCommand);
        lightRemoteController.setOffCommand(offCommand);
        lightRemoteController.onBtn();
        lightRemoteController.offBtn();
        
    }
    
}
