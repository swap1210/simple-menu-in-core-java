package menu;

import java.util.Scanner;

public class MainAppMenu extends AppMenu{
    public MainAppMenu(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void showContent() {
        System.out.println("Main Menu");
        System.out.println("1. Open Menu1");
        System.out.println("2. Open Menu2");
        System.out.println("3. Open Menu3");
        int choice = scanner.nextInt();
        AppMenu selectedMenu = null;
        switch (choice){
            case 1:
                selectedMenu = new Menu1AppMenu(scanner);
                break;
            case 2:
                selectedMenu = new Menu2AppMenu(scanner);
                break;
            case 3:
                selectedMenu = new Menu3AppMenu(scanner);
                break;
        }
        selectedMenu.showContent();
    }
}
