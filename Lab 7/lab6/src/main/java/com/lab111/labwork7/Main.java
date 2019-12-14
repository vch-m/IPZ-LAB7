package com.lab111.labwork7;

/**
 * @author vch_m
 * @version 7.6
 * In this labwork I used pattern Сommand
 */
public final class Main {

    /**
     * Constructor.
     *
     */
    private Main() {
        super();
    }

    /**
     * Invokes at application startup.
     *
     * @param args
     *            Parameters from command line
     */
    public static void main(final String[] args) {
        Command1 command1 = new Command1();
        Command2 command2 = new Command2();
        MacrosCommand macros = new MacrosCommand(command2);
        macros.addComand(command1);

        Menu menu = new Menu(command1);
        menu.Action();
        System.out.println("Динамическая замена реакции на нажатие");
        menu.setCommand(command2);
        menu.Action();

        Panel panel = new Panel(macros);
        panel.Action();

    }

}
