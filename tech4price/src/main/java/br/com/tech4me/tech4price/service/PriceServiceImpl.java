package br.com.tech4me.tech4price.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4price.dto.PriceDTO;
import br.com.tech4me.tech4price.httpClients.ComputerFeignClient;
import br.com.tech4me.tech4price.model.Price;
import br.com.tech4me.tech4price.repository.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {

    ModelMapper mapper = new ModelMapper();
  
    @Autowired
    private ComputerFeignClient computerClient;
  
    @Autowired
    private PriceRepository priceRepository;
  
    @Override
    public PriceDTO cadastrarPreco(PriceDTO preco) {
      Price setPrice = mapper.map(preco, Price.class);
      setPrice = priceRepository.save(setPrice);
      return mapper.map(setPrice, PriceDTO.class);
    }
  
    @Override
    public List<PriceDTO> obterPrecos() {
      List<Price> precos = priceRepository.findAll();
  
      return precos.stream()
      .map(i -> mapper.map(i, PriceDTO.class))
      .collect(Collectors.toList()); 
    }
  
    @Override
    public Optional<PriceDTO> obterPrecoPorId(String id) {
      Optional<Price> preco = priceRepository.findById(id);
  
      if (preco.isPresent()) {
        PriceDTO DTO = mapper.map(preco.get(), PriceDTO.class);
        
        DTO.setComputadores(computerClient.obterPorPreco(id));
  
        return Optional.of(DTO);
      }
      return Optional.empty();
    }
  
    @Override
    public void excluirPreco(String id) {
      priceRepository.deleteById(id);
    }
  
    @Override
    public PriceDTO alterarPreco(String id, PriceDTO preco) {
      Optional<Price> searchPrice = priceRepository.findById(id);
  
      if (searchPrice.isPresent()) {
        Price attPrice = mapper.map(preco, Price.class);
        attPrice.setId(id);
        attPrice = priceRepository.save(attPrice);
        return mapper.map(attPrice, PriceDTO.class);
      }
     
      return null;
    }
}