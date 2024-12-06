package com.example.Escola;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/escola")
@CrossOrigin(origins = "*")
public class EscolaController {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public EscolaController() {
        disciplinas.addAll(List.of(
                new Disciplina("Matemática"),
                new Disciplina("Inglês"),
                new Disciplina("Filosofia"),
                new Disciplina("História")
        ));
    }

    @GetMapping(produces = "text/html")
    @ResponseBody
    public String getDisciplinas() {
        StringBuilder html = new StringBuilder("<ul>");
        disciplinas.forEach(disciplina -> html.append("<li>")
                .append(disciplina.getId()).append(": ")
                .append(disciplina.getNomeDisciplina()).append("</li>"));
        html.append("</ul>");
        return html.toString();
    }

    @PostMapping(consumes = "application/json", produces = "text/html")
    @ResponseBody
    public String postDisciplina(@RequestBody Disciplina newDisciplina) {
        disciplinas.add(newDisciplina);
        return getDisciplinas();
    }

    @PutMapping("/{id}")
    @ResponseBody
    public String putDisciplina(@PathVariable String id, @RequestBody Disciplina updatedDisciplina) {
        disciplinas.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .ifPresent(disciplina -> disciplina.setNomeDisciplina(updatedDisciplina.getNomeDisciplina()));
        return getDisciplinas();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteDisciplina(@PathVariable String id) {
        disciplinas.removeIf(l -> l.getId().equals(id));
        return getDisciplinas();
    }
}
