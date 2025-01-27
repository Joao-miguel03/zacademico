package br.ifpe.jaboatao.zAcademicoWeb.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.jaboatao.zAcademicoWeb.model.Aluno;
import br.ifpe.jaboatao.zAcademicoWeb.model.dao.AlunoDAO;


@Controller
public class AlunoController {
    private final AlunoDAO alunoDAO;

    public AlunoController(AlunoDAO alunoDAO){
        this.alunoDAO = alunoDAO;
    }

    @GetMapping("/aluno/inserir")
    public String abreForm(Model model) {
        model.addAttribute("aluno", new Aluno(null, null, 0, null, null, null, null));
        return "cadAluno";
    }
    

    //@RequestMapping(value="/aluno/inserir", method = RequestMethod.POST)
    @PostMapping("/aluno/inserir")
    public String insereAluno(@ModelAttribute Aluno aluno, Model model){
        alunoDAO.create(aluno);

        model.addAttribute("aluno", aluno);
        model.addAttribute("mensagem", "Aluno cadastrado com Sucesso!");

        return "resultInsertAluno";
    }
}
