# Tech4Computer API Computer-Store

## **Sobre**
API RESTful para cadastro e especificação de preço por peça, como placa mãe, processador, memória RAM, placa de vídeo, fonte e etc

### Tech4Computer
Função: Cadastrar computadores especificando peças

### Tech4Price
Função: Cadastrar preço de cada peça do computador

### Eureka-Server
Função: Servidor da API  
Porta: 8010

### Zuul-Server
Função: Load balancer  
Porta: 8011

## **Execução**
Eureka-Server: http://localhost:8010  
*Postman para isso*  
### Tech4Computer
Get(Mostra os computadores cadastrados): localhost:8011/tech4computer/api/computadores/{id}

### Tech4Price
Get(Mostra os computadores cadastrados): localhost:8011/tech4price/api/price/{preco}

### **Teste de Relação Entre Microsserviços**
*Postman para isso*  
http://localhost:8011/tech4price/api/price/62519e52f0236836cff392cc

## **Utilizamos**

<ul>
<li>Visual Studio Code</li>
<li>Java</li>
<li>Maven</li>
<li>Springboot</li>
<li>MongoDB</li>
<li>Eureka</li>
<li>Zuul</li>
</ul>

## **Autores**
Denis Scarabelli  
Fellipe Carreiro
