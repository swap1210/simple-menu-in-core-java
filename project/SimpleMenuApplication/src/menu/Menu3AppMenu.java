package menu;

import java.util.Scanner;

public class Menu3AppMenu extends AppMenu {
    public Menu3AppMenu(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void showContent() {
        System.out.println("Menu3");
        System.out.println("1. Open Menu31");
        System.out.println("2. Open Menu32");
        int choice = scanner.nextInt();
        AppMenu selectedMenu = null;
        switch (choice){
            case 1:
                System.out.println("Menu31 action");
                break;
            case 2:
                System.out.println("Menu32 action");
                break;
        }
        selectedMenu.showContent();
    }
}
