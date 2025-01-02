package com.example.productapp.controller;

import com.example.productapp.model.Produto;
import com.example.productapp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Lista todos os produtos ordenados pelo valor
    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAllByOrderByValorAsc());
        return "listagem"; // Renderiza o template listagem.html
    }

    // Exibe o formulário de cadastro
    @GetMapping("/novo")
    public String novoProdutoForm(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastro"; // Renderiza o template cadastro.html
    }

    // Salva o produto e redireciona para a listagem
    @PostMapping
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos"; // Redireciona para a listagem
    }
}
