package com.niuzj.pattern;

/**
 * 命令实现类
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
