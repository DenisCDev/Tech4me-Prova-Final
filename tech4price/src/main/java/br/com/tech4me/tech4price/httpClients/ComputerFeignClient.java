package br.com.tech4me.tech4price.httpClients;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.tech4price.shared.Computer;

@FeignClient(name="tech4computer", fallback = ComputerFeignClientFallback.class)
public interface ComputerFeignClient {
  @GetMapping(path= "/api/computadores/obterPreco/{preco}")
  List<Computer> obterPorPreco(@PathVariable String preco);
}

@Component
class ComputerFeignClientFallback implements ComputerFeignClient {

  @Override
  public List<Computer> obterPorPreco(String preco) {
    return new ArrayList<>();
  }

}
