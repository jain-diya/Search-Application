package springmvcsearch;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view....");
		return "home";
	}

	// handeler
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		if(query.isBlank())
		{
			return new RedirectView("search");
		}
		
		
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;

	}


}

//@requestparam====>>to get the data
