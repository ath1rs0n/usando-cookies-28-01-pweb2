package ifal.br.usandocuces;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class coukesController {

    @GetMapping("/")
    public String readCookie(@CookieValue  (value = "username", defaultValue = "sem") String username) {
        
    if(username.equals("sem")){
    return "Não contém";
    }
    return "olá! meu nome é " + username;

    }
@RequestMapping("/formulario")
public ModelAndView cadastrar(){
return new ModelAndView("formulario");
}

    @RequestMapping("/change-username")

    public String setCookie(HttpServletResponse response, String username) {
    
        // create a cookie
    
        Cookie cookie = new Cookie("username", username);
    
        //add cookie to response
    
        response.addCookie(cookie);
    
        return "nome do usuario foi Username is changed!";
    
    }
}