package com.revature.security.universal;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component("roleChecker")
public class RoleChecker {
	
	public boolean allowedRoles(HttpServletRequest request, String...roles) {
		
		String userrole = "";
		Cookie [] cookies = request.getCookies();
	    for (Cookie cookie : cookies) {
	      System.out.println(cookie.getName());
	         if ("role".equals(cookie.getName())) {
	           userrole = cookie.getValue();
	           System.out.println(userrole);
	         }
	    }
	    
	    if (userrole.equals("")) return false;
	    
		for(int i=0;i<roles.length;i++) {
			System.out.println(roles[i]);
			if(userrole.equals(roles[i])) return true;
		}
		
		return false;
	}
	
	public boolean testing(String userrole) {
		System.out.println(userrole);
		return true;
	}
}
