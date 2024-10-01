package service;

import model.Aluguel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlugarService {

    public List<Aluguel> filtrarVeiculo(List<Aluguel> alugueis, String veiculo){
        return  alugueis.stream().filter(t -> t.getTipoVeiculo().toLowerCase().equals(veiculo)).collect(Collectors.toList());
    }

    public Double somaAlugueisVeiculo(List<Aluguel> alugueis, String veiculo){
        List<Aluguel> alugueisFiltrados = filtrarVeiculo(alugueis, veiculo);
        return alugueisFiltrados.stream().mapToDouble(Aluguel::getValor).sum();
    }

    public List<Aluguel> nomesQueAlugaramMaisDeUma(List<Aluguel> alugueis){
     alugueis.sort(Comparator.comparing(Aluguel::getNome));
     return alugueis;
    }

    public  List<String> veiculoMaisAlugado(List<Aluguel> alugueis){
        return alugueis.stream().map(Aluguel::getTipoVeiculo).collect(Collectors.toList());
    }
}
