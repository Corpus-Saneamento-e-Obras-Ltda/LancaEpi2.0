package br.com.corpus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.corpus.model.RelacFuncEpi;
import br.com.corpus.repository.RelaFuncEpiRepository;

@Controller
public class RelacController {

	@Autowired
	private RelaFuncEpiRepository rfr;

	@RequestMapping(value = "/CadastroRel", method = RequestMethod.GET)
	public String form() {
		return "formRelaEpi";

	}

	@RequestMapping(value = "/CadastroRel", method = RequestMethod.POST)
	public String form(RelacFuncEpi RelEpi) {
		rfr.save(RelEpi);
		return "redirect:/CadastroRel";

	}
	// @RequestMapping("/listarEpi")
}
