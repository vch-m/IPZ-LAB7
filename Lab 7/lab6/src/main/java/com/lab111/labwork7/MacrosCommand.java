package com.lab111.labwork7;
import java.util.ArrayList;

/**
 * @author vch_m
 * @version 7.6
 * Макро-команда
 */
public class MacrosCommand implements Command {
    public MacrosCommand(Command c) {
        command = new ArrayList<Command>();
        command.add(c);
    }

    private ArrayList<Command> command;

    /*
     * выполнение макро-команды
     */
    public void Execute() {
        System.out.println("Макро-команда");
        for (Command element : command)
            element.Execute();
    }

    public void addComand(Command newCommand) {
        command.add(newCommand);
    }

    public void deleteComand(Command deleteCommand) {
        command.add(deleteCommand);
    }

}
