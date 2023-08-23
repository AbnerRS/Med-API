# MED-API

## Formação Alura Spring Framework


### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- Spring Boot 3
- Insomnia 
- Mysql / Flyway
- Java 17
- Lombok
- Maven
- JPA/Hibernate

#### Boas Práticas

- Arquitetura MVC
- Herança entre classes
- Identação
- Versionamento de código
- DTO

##### Features

- [x] Desenvolvimento de uma API Rest 
- [x] CRUD (Create, Read, Update e Delete) 
- [x] Validações
- [x] Paginação e ordenação

##### Aprendizado 1º Etapa do Projeto

- [x] Mapear requisições POST em uma classe Controller 
- [x] Enviar requisições POST para a API utilizando o Insomnia
- [x] Enviar dados para API no formato JSON
- [x] Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller
- [x] Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST
- [x] Utilizar o Flyway como ferramenta de Migrations do projeto
- [x] Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank
- [x] Utilizar a anotação @GetMapping para mapear métodos em Controllers que produzem dados
- [x] Utilizar a interface Pageable do Spring para realizar consultas com paginação
- [x] Controlar a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort
- [x] Mapear requisições PUT com a anotação @PutMapping
- [x] Escrever um código para atualizar informações de um registro no banco de dados
- [x] Mapear requisições DELETE com a anotação @DeleteMapping
- [x] Mapear parâmetros dinâmicos em URL com a anotação @PathVariable
- [x] Implementar o conceito de exclusão lógica com o uso de um atributo booleano

##### Aprendizado 2º Etapa do Projeto
- [x] Utilizar a classe ResponseEntity, do Spring, para personalizar os retornos dos métodos de uma classe Controller
- [x] Modificar o código HTTP devolvido nas respostas da API
- [x] Adicionar cabeçalhos nas respostas da API
- [x] Utilizar os códigos HTTP mais apropriados para cada operação realizada na API
- [x] Criar uma classe para isolar o tratamento de exceptions da API, com a utilização da anotação @RestControllerAdvice
- [x] Utilizar a anotação @ExceptionHandler, do Spring, para indicar qual exception um determinado método da classe de tratamento de erros deve capturar
- [x] Tratar erros do tipo 404 (Not Found) na classe de tratamento de erros
- [x] Tratar erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros
- [x] Simplificar o JSON devolvido pela API em casos de erro de validação do Bean Validation
- [x] Funciona o processo de autenticação e autorização em uma API Rest
- [x] Adicionar o Spring Security ao projeto
- [x] Funciona o comportamento padrão do Spring Security em uma aplicação
- [x] Implementar o processo de autenticação na API, de maneira Stateless, utilizando as classes e configurações do Spring Security
- [x] Adicionar a biblioteca Auth0 java-jwt como dependência do projeto
- [x] Utilizar essa biblioteca para realizar a geração de um token na API
- [x] Injetar uma propriedade do arquivo application.properties em uma classe gerenciada pelo Spring, utilizando a anotação @Value
- [x] Devolver um token gerado na API quando um usuário se autenticar nela
- [x] Funcionamento dos Filters em uma requisição
- [x] Implementar um filter criando uma classe que herda da classe OncePerRequestFilter, do Spring
- [x] Utilizar a biblioteca Auth0 java-jwt para realizar a validação dos tokens recebidos na API
- [x] Realizar o processo de autenticação da requisição, utilizando a classe SecurityContextHolder, do Spring
- [x] Liberar e restringir requisições, de acordo com a URL e o verbo do protocolo HTTP

##### Aprendizado 3º Etapa do Projeto
- [x]

###### Autor
- Abner Rodrigues 
