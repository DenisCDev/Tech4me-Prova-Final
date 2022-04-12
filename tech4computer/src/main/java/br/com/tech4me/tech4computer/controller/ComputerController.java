package br.com.tech4me.tech4computer.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

import br.com.tech4me.tech4computer.dto.ComputerDTO;
import br.com.tech4me.tech4computer.service.ComputerService;
import br.com.tech4me.tech4computer.view.ComputerResponseDTO;
import br.com.tech4me.tech4computer.view.ComputerResponseIdDTO;

@RestController
@RequestMapping("/api/computadores")
public class ComputerController {
    
    ModelMapper mapper = new ModelMapper();

    @Autowired
    private ComputerService service;
    
    @GetMapping
    public ResponseEntity<List<ComputerDTO>> obterLivros() {
       return new ResponseEntity<>(service.obterTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ComputerDTO> armazenarComputador(@RequestBody @Valid ComputerDTO computador) {
        return new ResponseEntity<>(service.armazenarComputador(computador), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirComputadorPeloId(@PathVariable String id) {
        service.excluirComputadorPeloId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComputerDTO> atualizarComputador(@PathVariable String id, @RequestBody @Valid ComputerDTO computador) {
        return new ResponseEntity<>(service.atualizarComputador(id, computador), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComputerResponseIdDTO> obterComputadorPeloId(@PathVariable String id){
       Optional<ComputerDTO> pc = service.obterComputadorPeloId(id);

       if (pc.isPresent()) {
        return new ResponseEntity<>(mapper.map(pc.get(), ComputerResponseIdDTO.class), 
          HttpStatus.FOUND);
       }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/obterPreco/{preco}")
    public ResponseEntity<List<ComputerResponseDTO>> obterPorPreco(@PathVariable String preco){
        List<ComputerDTO> tags = service.obterPorPreco(preco);
 
        List<ComputerResponseDTO> computador = tags.stream()
        .map(l -> mapper.map(l, ComputerResponseDTO.class))
        .collect(Collectors.toList());

        return new ResponseEntity<>(computador, HttpStatus.OK);
    }








}