package br.com.tech4me.tech4price.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4price.dto.PriceDTO;

public interface PriceService {
    
  PriceDTO cadastrarPreco(PriceDTO preco);

  List<PriceDTO> obterPrecos();

  Optional<PriceDTO> obterPrecoPorId(String id);

  void excluirPreco(String id);

  PriceDTO alterarPreco(String id, PriceDTO preco);
}
