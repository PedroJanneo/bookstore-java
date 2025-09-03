# BookStoreJava

BookStoreJava é um projeto de gerenciamento de livraria originalmente desenvolvido em Node.js e Express. Atualmente, está sendo migrado para Java utilizando o framework Spring Boot.

## Objetivo

O objetivo do projeto é fornecer uma API para cadastro, consulta e autenticação de usuários e livros, utilizando persistência em banco de dados MySQL, além de aprimorar meus conhecimentos em lógica de programação e adaptação de linguagem.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot** 
- **MySQL** 
- **JPA/Hibernate** 
- **BCrypt** (hash de senha)

## Estrutura do Projeto

- `entities/Book.java`  
  Entidade que representa um livro.

- `entities/User.java`  
  Entidade que representa um usuário.

- `repositories/BookRepository.java`  
  Interface de acesso ao banco para livros.

- `repositories/UserRepository.java`  
  Interface de acesso ao banco para usuários.

- `services/BookService.java`  
  Serviço para regras de negócio de livros.

- `services/UserService.java`  
  Serviço para regras de negócio de usuários, incluindo hash de senha.

- `controllers/BookController.java`  
  Controller REST para livros.

- `controllers/UserController.java`  
  Controller REST para usuários.

- `security/PasswordHash.java`  
  Utilitário para hash e verificação de senha com BCrypt.

- `resources/application.properties`  
  Configuração de acesso ao banco de dados.

## Como Executar

1. Configure o banco de dados MySQL e ajuste o arquivo `application.properties`.
2. Execute o projeto com Maven:
   ```sh
   ./mvnw spring-boot:run
   ```
3. Acesse os endpoints REST:
   - `/books` para operações com livros
   - `/users` para operações com usuários

## Observações

- O projeto está em fase de migração de Node.js/Express para Java/Spring Boot.
- Algumas funcionalidades podem estar