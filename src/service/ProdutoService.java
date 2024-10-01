package service;

import model.Aluguel;
import model.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoService {

    public List<Produto> filtrarProdutoEsgotado(List<Produto> produto) {
        return produto.stream().filter(p -> p.getEstoque() == 0).collect(Collectors.toList());
    }

    public Double somaProdutoEstoque(List<Produto> produtos){
         Double valorEstoque = produtos.stream().mapToDouble(p -> p.getValor() * p.getEstoque()).sum();
         return  valorEstoque;
    }

    public List<Produto> filtrarAbaixo(List<Produto> produto) {
    return produto.stream().filter(p -> p.getEstoque() <= 5).collect(Collectors.toList());
    }

    public List<Produto> produtosValorIgualCinquenta(List<Produto> produto){
        return produto.stream().filter(p->p.getValor() == 50).collect(Collectors.toList());
    }
}
