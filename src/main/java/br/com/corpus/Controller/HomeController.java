package br.com.corpus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.corpus.model.RelacFuncEpi;
import br.com.corpus.repository.RelaFuncEpiRepository;

@Controller
public class HomeController {
	@Autowired
	private RelaFuncEpiRepository rr;
	

	@RequestMapping("/homePage")
	public ModelAndView home() {
		
		ModelAndView mv= new ModelAndView("home");
		Iterable<RelacFuncEpi> EpiFUnc = rr.findAll();
		mv.addObject("epis", EpiFUnc);
		return mv;
	}
	
	

	

}
