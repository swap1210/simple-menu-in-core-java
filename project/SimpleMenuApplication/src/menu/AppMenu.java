package menu;

import java.util.Scanner;

public abstract class AppMenu {
    Scanner scanner;

    public AppMenu(Scanner scanner){
        this.scanner = scanner;
    }

    abstract public void showContent();
}
