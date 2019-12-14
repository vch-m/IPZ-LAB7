package com.lab111.labwork7;

/**
 * @author vch_m
 * @version 7.6
 * Инициатор посылки сообщения
 */
public class Invoker {
    Invoker(Command c) {
        command = c;
    }

    public Command command;

    /**
     * выполнить действие
     */
    public void Action() {
        command.Execute();
    }

    /**
     * изменить команду
     *
     * @param newCommand
     *            - новая команда
     */
    public void setCommand(Command newCommand) {
        command = newCommand;
    }

}
