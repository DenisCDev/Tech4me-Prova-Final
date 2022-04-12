package br.com.tech4me.tech4price.dto;

import java.util.List;


import br.com.tech4me.tech4price.shared.Computer;

public class PriceDTO {
    
    private String id;
    private Double custoProcessador;
    private Double custoVideo;
    private Double custoRam;
    private Double custoPlacaMae;
    private Double custoCooler;
    private Double custoArmazenamento;
    private Double custoFonte;
    private List<Computer> computadores;
    
    public List<Computer> getComputadores() {
        return computadores;
    }
    public void setComputadores(List<Computer> computadores) {
        this.computadores = computadores;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getCustoProcessador() {
        return custoProcessador;
    }
    public void setCustoProcessador(Double custoProcessador) {
        this.custoProcessador = custoProcessador;
    }
    public Double getCustoVideo() {
        return custoVideo;
    }
    public void setCustoVideo(Double custoVideo) {
        this.custoVideo = custoVideo;
    }
    public Double getCustoRam() {
        return custoRam;
    }
    public void setCustoRam(Double custoRam) {
        this.custoRam = custoRam;
    }
    public Double getCustoPlacaMae() {
        return custoPlacaMae;
    }
    public void setCustoPlacaMae(Double custoPlacaMae) {
        this.custoPlacaMae = custoPlacaMae;
    }
    public Double getCustoCooler() {
        return custoCooler;
    }
    public void setCustoCooler(Double custoCooler) {
        this.custoCooler = custoCooler;
    }
    public Double getCustoArmazenamento() {
        return custoArmazenamento;
    }
    public void setCustoArmazenamento(Double custoArmazenamento) {
        this.custoArmazenamento = custoArmazenamento;
    }
    public Double getCustoFonte() {
        return custoFonte;
    }
    public void setCustoFonte(Double custoFonte) {
        this.custoFonte = custoFonte;
    }

}

