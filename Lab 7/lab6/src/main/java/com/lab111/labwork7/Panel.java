package com.lab111.labwork7;

/**
 * @author vch_m
 * @version 7.6
 */
public class Panel extends Invoker {

    public Panel(Command c) {
        super(c);
    }

    public void Action() {
        System.out.println("действие панели");
        super.Action();
    }

}
