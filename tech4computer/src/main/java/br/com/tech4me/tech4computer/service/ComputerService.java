package br.com.tech4me.tech4computer.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4computer.dto.ComputerDTO;

public interface ComputerService {
    
    List<ComputerDTO> obterTodos();

    Optional<ComputerDTO> obterComputadorPeloId(String id);

    ComputerDTO armazenarComputador(ComputerDTO computador);

    void excluirComputadorPeloId(String id);

    ComputerDTO atualizarComputador(String id, ComputerDTO computador);

    List<ComputerDTO> obterPorPreco(String preco);

}
