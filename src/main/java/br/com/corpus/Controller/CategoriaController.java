package br.com.corpus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.corpus.model.CategoriaEPI;
import br.com.corpus.model.CentroCustoEpi;
import br.com.corpus.model.ProdutoEpi;
import br.com.corpus.repository.CategoriaEpirepository;
import br.com.corpus.repository.CentroCustoEpiRepository;
import br.com.corpus.repository.ProdutoEpiRepository;

@Controller
public class CategoriaController {
	@Autowired
	CategoriaEpirepository cte;
	@Autowired
	ProdutoEpiRepository prdrepo;
	@Autowired
	CentroCustoEpiRepository ccrepo;

	@RequestMapping("/cadastro")
	public ModelAndView listaCat( ) {
		ModelAndView mv = new ModelAndView("formRelaEpi");
		Iterable<CategoriaEPI> cat =cte.findAll();
		mv.addObject("ListCat", cat);
		return mv ;
	}
	@RequestMapping("/listaPrd")
	public ModelAndView listaPrd( ) {
		ModelAndView mvp = new ModelAndView("formRelaEpi");
		Iterable<ProdutoEpi> prd =prdrepo.findProduto();
		mvp.addObject("ListPrd", prd);
		return mvp ;
	}
	
	@RequestMapping("/listaCC")
	public ModelAndView listaCC( ) {
		ModelAndView mvc = new ModelAndView("formRelaEpi");
		Iterable<CentroCustoEpi> listacc =ccrepo.findCC();
		mvc.addObject("ListCC", listacc);
		return mvc ;
	}
	
	
	

}
