package PackageMain;
import Controller.login;
import Model.TasModel;
import view.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        LoginPage_CLI login = new LoginPage_CLI();
        login.login();
        HomePage_CLI page = new HomePage_CLI();
        page.menuUtama();
        
    }

    

}
