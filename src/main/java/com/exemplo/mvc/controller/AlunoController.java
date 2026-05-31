package com.exemplo.mvc.controller;

import com.exemplo.mvc.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    // Rota que exibe o formulário de cadastro
    @GetMapping("/alunos")
    public String formulario() {
        return "alunos-form";
    }

    // Rota que recebe os dados do formulário e lista os alunos cadastrados
    @PostMapping("/alunos")
    public String cadastrar(
        @RequestParam String nome,
        @RequestParam String matricula,
        Model model
    ) {
        // Cria o modelo e adiciona na lista simulada em memória
        alunos.add(new Aluno(nome, matricula));
        
        // Passa a lista atualizada para ser exibida na View
        model.addAttribute("alunos", alunos);
        
        return "alunos-lista";
    }
}