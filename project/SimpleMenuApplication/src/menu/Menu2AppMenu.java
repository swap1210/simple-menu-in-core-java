package menu;

import java.util.Scanner;

public class Menu2AppMenu extends AppMenu {
    public Menu2AppMenu(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void showContent() {
        System.out.println("Menu2");
        System.out.println("1. Open Menu21");
        System.out.println("2. Open Menu22");
        int choice = scanner.nextInt();
        AppMenu selectedMenu = null;
        switch (choice){
            case 1:
                System.out.println("Menu21 action");
                break;
            case 2:
                System.out.println("Menu22 action");
                break;
        }
        selectedMenu.showContent();
    }
}
