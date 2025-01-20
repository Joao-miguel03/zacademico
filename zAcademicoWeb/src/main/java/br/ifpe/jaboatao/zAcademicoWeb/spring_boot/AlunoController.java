package br.ifpe.jaboatao.zAcademicoWeb.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ifpe.jaboatao.zAcademicoWeb.model.Aluno;
import br.ifpe.jaboatao.zAcademicoWeb.model.dao.AlunoDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AlunoController {
    private final AlunoDAO alunoDAO;

    public AlunoController(AlunoDAO alunoDAO){
        this.alunoDAO = alunoDAO;
    }

    @GetMapping("aluno/inserir")
    public String abreForm(Model model) {
        model.addAttribute("aluno", new Aluno(null, null, 0, null, null, null, null));
        return "aluno/inserir";
    }
    

    //@RequestMapping(value="/aluno/inserir", method = RequestMethod.POST)
    @PostMapping("aluno/inserir")
    public String insereAluno(@ModelAttribute Aluno aluno, Model model){
        alunoDAO.create(aluno);

        model.addAttribute("aluno", aluno);
        model.addAttribute("mensagem", "Aluno cadastrado com Sucesso!");

        return "resultInsertAluno";
    }
}
