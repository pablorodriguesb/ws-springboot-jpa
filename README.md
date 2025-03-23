# Projeto Web Services com Spring Boot e JPA/Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/pablorodriguesb/ws-springboot-jpa/blob/main/LICENSE) 

# Sobre o projeto

Este projeto foi desenvolvido durante o módulo **Projeto Web com Spring Boot e JPA / Hibernate** do curso [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/) do professor **Nélio Alves**, disponível na plataforma Udemy.

A aplicação é um sistema de gerenciamento de usuários com serviços RESTful, incluindo operações de CRUD, tratativas de exceções, e conexão com banco de dados. Foi implementada utilizando as melhores práticas com **Spring Boot** e **JPA/Hibernate** para persistência de dados.

## Modelo conceitual
O projeto segue o modelo conceitual abaixo, com as entidades e seus relacionamentos mapeados no banco de dados:

![Modelo Conceitual](https://github.com/acenelio/assets/raw/main/sds1/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postgresql

# Competências demonstradas
- **Desenvolvimento Web**:
  - Criação de APIs RESTful utilizando o Spring Boot.
  - Implementação de operações CRUD com tratativas de exceções personalizadas.
  - Integração com banco de dados utilizando JPA e Hibernate para mapeamento objeto-relacional (ORM).
  
- **Arquitetura e boas práticas**:
  - Uso do padrão DTO para transferência de dados entre camadas.
  - Aplicação de boas práticas como separação de responsabilidades (Services, Resources, Repositories).
  - Configuração de perfis de aplicação com `application.properties` para diferentes ambientes (dev/prod).
  
- **Gerenciamento de erros**:
  - Implementação de classes de manipulação de exceções para retorno de respostas padronizadas de erro.
  - Tratativa de erros como `ResourceNotFoundException` e `DatabaseException`.

- **Banco de Dados**:
  - Configuração de banco de dados PostgreSQL em ambiente local.
  - Criação e manipulação de entidades e relacionamentos no banco.
  - Uso de queries personalizadas com o JPA.

- **Versionamento de Código**:
  - Controle de versão utilizando Git.
  - Integração do projeto com GitHub para deploy e apresentação.

- **Ferramentas e Frameworks**:
  - Maven para gerenciamento de dependências e build do projeto.
  - Postman para testes das APIs.
  - IDE utilizada: NetBeans.
    
# Como executar o projeto

## Pré-requisitos
- Java 11
- Maven
- Banco de dados PostgreSQL

### Passos para execução

```bash
# Clonar o repositório
git clone https://github.com/pablorodriguesb/ws-springboot-jpa.git

# Entrar na pasta do projeto
cd ws-springboot-jpa

# Configurar as credenciais do banco de dados no arquivo application.properties

# Executar o projeto
./mvnw spring-boot:run
