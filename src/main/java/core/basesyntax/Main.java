package core.basesyntax;

import core.basesyntax.controller.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        System.out.println("Введіть value та risk ля вашої ставки");
        consoleHandler.handle();
    }
}
