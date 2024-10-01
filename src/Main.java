import model.Aluguel;
import model.Produto;
import service.AlugarService;
import service.ProdutoService;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Rodrigo Rodrigues Ribeiro Dutra ESN5 - UNIFAN");

        AlugarService alugarService = new AlugarService();
        List<Aluguel> aluguels = Arrays.asList(
                new Aluguel("Rodrigo","Carro", 500.0, new Date()),
                new Aluguel("Miguel","Carro", 500.0, new Date()),
                new Aluguel("Daniel","Carro", 800.0, new Date()),
                new Aluguel("Lucas","Carro", 1000.0, new Date()),
                new Aluguel("Lucas","moto", 900.0, new Date())
        );

        String tipo = "carro";

        alugarService.filtrarVeiculo(aluguels,tipo).forEach(a -> System.out.println("Alugueis de " + tipo +", Valor: R$ " + a.getValor()));
        System.out.println("Soma de Alugueis de "+ tipo+", Valor: R$" + alugarService.somaAlugueisVeiculo(aluguels, tipo));
        alugarService.nomesQueAlugaramMaisDeUma(aluguels).forEach(a -> System.out.println("Alugou mais de uma vez o cliente: " + a.getNome()));
        alugarService.veiculoMaisAlugado(aluguels).forEach(a -> System.out.println("Veiculo que mais alugou: " + a));

        System.out.println("-----------------Atividade 2-----------------");
        ProdutoService produtoService = new ProdutoService();
        List<Produto> produtos = Arrays.asList(
                new Produto("Agua",5, 50.0),
                new Produto("Camera",1, 1200.0),
                new Produto("Geladeira",0, 2500.0),
                new Produto("Notebook",10, 9500.0),
                new Produto("Teclado",12, 500.0)
        );

        produtoService.filtrarProdutoEsgotado(produtos).forEach(p -> System.out.println("Produto Esgotado: " + p.getNome()));
        System.out.println("Valor Total Estoque: R$ " + produtoService.somaProdutoEstoque(produtos));
        produtoService.filtrarAbaixo(produtos).forEach(p -> System.out.println("Produto Com estoque Abaixo ou igual de 5, Nome: " +p.getNome() + ", Estoque:" + p.getEstoque()));
        produtoService.produtosValorIgualCinquenta(produtos).forEach(p -> System.out.println("Produto Com Valor Igual a 50, Nome: " + p.getNome()));
    }

}