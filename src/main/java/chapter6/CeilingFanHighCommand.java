package src.main.java.chapter6;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }

    public void undo() {

    }

}
