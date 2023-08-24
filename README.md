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
- [x] Implementar uma nova funcionalidade de cadastro e cancelamento de consultas
- [x] Avaliar quando é necessário criar uma classe Service na aplicação
- [x] Criar uma classe Service, com o objetivo de isolar códigos de regras de negócio, utilizando para isso a anotação @Service
- [x] Implementar um algoritmo para a funcionalidade de agendamento de consultas
- [x] Realizar validações de integridade das informações que chegam na API
- [x] Implementar uma consulta JPQL (Java Persistence Query Language) complexa em uma interface repository, utilizando para isso a anotação @Query
- [x] Isolar os códigos de validações de regras de negócio em classes separadas, utilizando nelas a anotação @Component do Spring
- [x] Finalizar a implementação do algoritmo de agendamento de consultas
- [x] Utilizar os princípios SOLID para deixar o código da funcionalidade de agendamento de consultas mais fácil de entender, evoluir e testar
- [x] Adicionar a biblioteca SpringDoc no projeto para que ela faça a geração automatizada da documentação da API
- [x] Analisar a documentação do SpringDoc para entender como realizar a sua configuração em um projeto
- [x] Acessar os endereços que disponibilizam a documentação da API nos formatos yaml e html
- [x] Utilizar o Swagger UI para visualizar e testar uma API Rest
- [x] Configurar o JWT na documentação gerada pelo SpringDoc
- [x] Escrever testes automatizados em uma aplicação com Spring Boot
- [x] Escrever testes automatizados de uma interface Repository, seguindo a estratégia de usar o mesmo banco de dados que a aplicação utiliza
- [x] Sobrescrever propriedades do arquivo application.properties, criando outro arquivo chamado application-test.properties que seja carregado apenas ao executar os testes, utilizando para isso a anotação @ActiveProfiles
- [x] Escrever testes automatizados de uma classe Controller, utilizando a classe MockMvc para simular requisições na API
- [x] Testar cenários de erro 400 e código 200 no teste de uma classe controller
- [x] Funciona o build de uma aplicação com Spring Boot
- [x] Utilizar arquivos de propriedades específicos para cada profile, alterando em cada arquivo as propriedades que precisam ser modificadas
- [x] Configurar informações sensíveis da aplicação, como dados de acesso ao banco de dados, via variáveis de ambiente
- [x] Realizar o build do projeto via Maven
- [x] Executar a aplicação via terminal, com o comando java -jar, passando as variáveis de ambiente como parâmetro

###### Autor
- Abner Rodrigues 
