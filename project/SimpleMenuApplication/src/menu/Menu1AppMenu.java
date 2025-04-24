package menu;

import java.util.Scanner;

public class Menu1AppMenu extends AppMenu {
    public Menu1AppMenu(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void showContent() {
        System.out.println("Menu1");
        System.out.println("1. Open Menu11");
        System.out.println("2. Open Menu12");
        int choice = scanner.nextInt();
        AppMenu selectedMenu = null;
        switch (choice){
            case 1:
                System.out.println("Menu11 action");
                break;
            case 2:
                System.out.println("Menu12 action");
                break;
        }
        selectedMenu.showContent();
    }
}
