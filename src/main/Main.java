
package main;

import ws.Login;
import ws.LoginService;


public class Main {

    
    public static void main(String[] args) {
        LoginService s = new LoginService();
        Login l = s.getLoginPort();
        String res = l.login("Mika","112test");
        System.out.println(res);
    }
    
}
