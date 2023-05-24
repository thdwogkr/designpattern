package src.main.java.chapter6;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }

    public void undo() {
        System.out.println("undo");
    }
}
