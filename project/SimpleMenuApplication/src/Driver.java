import menu.MainAppMenu;

import java.util.Scanner;

public class Driver {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MyApp");

        MainAppMenu mainAppMenu = new MainAppMenu(scanner);
        while(true){
            mainAppMenu.showContent();
        }
        //anything beyond this point is unreachable
//        scanner.close();
    }
}
