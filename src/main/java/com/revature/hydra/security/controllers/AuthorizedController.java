package com.revature.hydra.security.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.hydra.security.beans.SalesforceUser;

@Controller
// @CrossOrigin
@PreAuthorize("isAuthenticated()")
public class AuthorizedController {

	@RequestMapping("/authorize")
	public ModelAndView authorized(HttpServletRequest request, HttpServletResponse response) {
		String preRedirect = request.getHeader("preRedirectRequestUri");
		System.out.println(preRedirect);
		Cookie[] cookies = request.getCookies();
		String role = "";
		String email = "";
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("role")) {
					role = c.getValue();
				}

				if (c.getName().equals("caliber_email"))
				{
					email = c.getValue();
				}
			}
		}

		SalesforceUser user = (SalesforceUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String authEmail = user.getCaliberUser().getEmail();
		String authRole = user.getCaliberUser().getTier().toString();

		if (authEmail != email || authRole != role) {
			response.addCookie(new Cookie("role", user.getCaliberUser().getEmail()));
			response.addCookie(new Cookie("caliber_email", user.getCaliberUser().getTier().toString()));
			return new ModelAndView("forward:" + "/");
		}

		if (preRedirect.contains("dto/")) {
			return new ModelAndView("redirect:" + preRedirect);
		}
		if (role.equals("") || email.equals("")) {
			return new ModelAndView("forward:" + "/");
		}
		if ("".equals(preRedirect)) {
			return new ModelAndView("forward:" + "/");
		}
		return new ModelAndView("redirect:" + preRedirect);
	}
}
