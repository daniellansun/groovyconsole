package me.sunlan.groovyconsole;

import groovy.lang.Binding;
import groovy.ui.Console;

/**
 * Created by Daniel on 2017/7/8.
 */
public class GroovyConsole {
    public static void main(String[] args) {
        new Console(GroovyConsole.class.getClassLoader(), new Binding()).run();
    }
}
