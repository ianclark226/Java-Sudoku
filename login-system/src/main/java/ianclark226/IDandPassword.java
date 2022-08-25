package ianclark226;

import java.util.HashMap;

public class IDandPassword {
    
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPassword(){
        logininfo.put("Ian", "Warpmaster#7");
        logininfo.put("admin", "password");
        logininfo.put("ianclark226", "password123");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
