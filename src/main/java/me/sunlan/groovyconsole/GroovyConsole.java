package me.sunlan.groovyconsole;

import groovy.lang.Binding;
import groovy.ui.Console;
import org.codehaus.groovy.control.CompilerConfiguration;

/**
 * Created by Daniel on 2017/7/8.
 */
public class GroovyConsole {
    public static void main(String[] args) {
        CompilerConfiguration configuration = new CompilerConfiguration(CompilerConfiguration.DEFAULT);
        new Console(GroovyConsole.class.getClassLoader(), new Binding(), configuration).run();
    }
}
