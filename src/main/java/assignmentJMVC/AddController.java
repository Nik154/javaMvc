package assignmentJMVC;

//import jakarta.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
	
	
	@RequestMapping(value="calc", method  = RequestMethod.GET)
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2, @RequestParam("oper") char ch)
	{
		
		//Creating ModelAndView class Object
		ModelAndView mv = new ModelAndView();
		
		
		//Checking For Exceptional Case
		if((num2==0 && ch=='/') || (ch!='*' && ch!='-' && ch!='+' && ch!='/' && ch!='%'))
		{
			mv.setViewName("NotDefined.jsp");
			return mv;
		}
		
		//Creating Model Object
		MyModel ob = new MyModel(num1,num2,ch);
		
		int k = ob.Calcs();
		
		mv.addObject("result",k);
		mv.setViewName("result.jsp");
		
		//System.out.println("i'm here"+k);
		
		
		return mv;
		
	}
}
