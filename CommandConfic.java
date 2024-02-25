package command;

public class CommandConfic implements Command{
private IOT iot;

    public CommandConfic(IOT light) {
        this.iot = light;
    }





    @Override
    public void excecute(String string) {
        if (string.equals("on"))
        iot.on();
        else if (string.equals("off"))
            iot.off();
        else throw new RuntimeException("command is not found");


    }



}
