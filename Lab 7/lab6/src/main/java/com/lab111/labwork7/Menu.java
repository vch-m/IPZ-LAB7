package com.lab111.labwork7;
/**
 * @author vch_m
 * @version 7.6
 */
public class Menu extends Invoker {

    public Menu(Command c) {
        super(c);
    }

    public void Action() {
        System.out.println("действие меню");
        super.Action();
    }

}