package br.com.corpus.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.corpus.model.RelacFuncEpi;
import br.com.corpus.repository.RelaFuncEpiRepository;

@Controller
public class RelacController {

	@Autowired
	private RelaFuncEpiRepository rfr;


	


	

	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String form(RelacFuncEpi RelEpi ) {		
		
		rfr.save(RelEpi);		

		return "redirect:/CadastroRel";

	}
	@RequestMapping("/deletar")
	public String deletarEpi(long id) {
		String rd ="redirect:/homePage";
		RelacFuncEpi rel = rfr.findById(id);
		rfr.delete(rel);
		
		return rd;
	}
		
	}
	
	
	

	
	
