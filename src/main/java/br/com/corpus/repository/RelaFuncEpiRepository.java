package br.com.corpus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.corpus.model.RelacFuncEpi;

public interface RelaFuncEpiRepository extends CrudRepository<RelacFuncEpi, Long> {

    @RequestMapping("/homePageList")
    default ModelAndView listaEpi() {
        ModelAndView mv = new ModelAndView("home");
        Iterable<RelacFuncEpi> ListEpi = findAll();
        mv.addObject("RelEpilist", ListEpi);
        return mv;

    }

	RelacFuncEpi findById(long id);

	


}
