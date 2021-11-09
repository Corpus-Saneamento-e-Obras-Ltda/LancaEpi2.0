package br.com.corpus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.corpus.model.CategoriaEPI;
import br.com.corpus.repository.CategoriaEpirepository;

@Controller
public class CategoriaController {
	@Autowired
	CategoriaEpirepository cte;
	
	
	@RequestMapping("/Cadastro")
	public ModelAndView listaCat( ) {
		ModelAndView mv = new ModelAndView("formRelaEpi");
		Iterable<CategoriaEPI> cat =cte.findAll();
		mv.addObject("ListCat", cat);
		return mv;
	}
	
	
	

}
