package br.com.tech4me.tech4computer.dto;

import javax.validation.constraints.NotEmpty;

public class ComputerDTO {

    private String id;
    private String preco;

@NotEmpty(message = "O campo 'sistemaOperacional' está vazio, verifique-o")
    private String sistemaOperacional;

@NotEmpty(message = "O campo 'marca' está vazio, verifique-o")
    private String marca;

@NotEmpty(message = "O campo 'processador' está vazio, verifique-o")
    private String processador;

@NotEmpty(message = "O campo 'placaDeVideo' está vazio, verifique-o")
    private String placaDeVideo;

@NotEmpty(message = "O campo 'ram' está vazio, verifique-o")
    private String ram;

@NotEmpty(message = "O campo 'placaMae' está vazio, verifique-o")
    private String placaMae;

@NotEmpty(message = "O campo 'cooler' está vazio, verifique-o")
    private String cooler;

@NotEmpty(message = "O campo 'armazenamento' está vazio, verifique-o")
    private String armazenamento;

@NotEmpty(message = "O campo 'fonte' está vazio, verifique-o")
    private String fonte;

@NotEmpty(message = "O campo 'usado' está vazio, verifique-o")
    private String usado;
    
    
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }
    public String getCooler() {
        return cooler;
    }
    public void setCooler(String cooler) {
        this.cooler = cooler;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getFonte() {
        return fonte;
    }
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
    public String getUsado() {
        return usado;
    }
    public void setUsado(String usado) {
        this.usado = usado;
    }
    
}
