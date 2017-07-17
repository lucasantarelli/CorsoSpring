package it.consoft.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.consoft.core.model.User;
import it.consoft.core.service.UserService;




@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
		/* GET /user restituisce l'utente corrente in formato json */
		@RequestMapping("/user")
		public User UserHome() {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			User user = userService.findUserByEmail(auth.getName());
			return user;
		}
		
	
	
}
