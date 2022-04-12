package br.com.tech4me.tech4price.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4price.dto.PriceComputer;
import br.com.tech4me.tech4price.dto.PriceDTO;
import br.com.tech4me.tech4price.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController {

  ModelMapper mapper = new ModelMapper();

  @Autowired
  private PriceService service;
  
  @GetMapping
  public ResponseEntity<List<PriceDTO>> obterTodos() {
    return new ResponseEntity<>(service.obterPrecos(), HttpStatus.OK);

  }

  @GetMapping("/{id}")
  public ResponseEntity<PriceComputer> obterPrecoPorId(@PathVariable String id) {
    Optional<PriceDTO> preco = service.obterPrecoPorId(id);

    if (preco.isPresent()) {
      return new ResponseEntity<>(mapper.map(preco.get(), PriceComputer.class), HttpStatus.OK);
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @PostMapping
  public ResponseEntity<PriceDTO> cadastrarPreco(@RequestBody @Valid PriceDTO preco){
    return new ResponseEntity<>(service.cadastrarPreco(preco), HttpStatus.CREATED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> excluirPrecoPorId(@PathVariable String id){
        service.excluirPreco(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

  @PutMapping("/{id}")
  public ResponseEntity<PriceDTO> atualizarPreco(@PathVariable String id, @RequestBody @Valid PriceDTO preco){
        return new ResponseEntity<>(service.alterarPreco(id, preco), HttpStatus.ACCEPTED);
    }
}

