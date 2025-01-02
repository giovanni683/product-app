# Cadastro e Listagem de Produtos

Este é um sistema de cadastro e listagem de produtos desenvolvido com **Spring Boot** e **Thymeleaf**.

## Funcionalidades

### Cadastro de Produtos
- Permite cadastrar:
  - Nome do produto
  - Descrição
  - Valor
  - Disponibilidade para venda (Sim/Não)

### Listagem de Produtos
- Exibe os produtos cadastrados em uma tabela.
- Ordenação por valor (do menor para o maior).
- Possui botão para cadastrar novos produtos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Data JPA
  - Thymeleaf
  - H2 Database
- **Maven**
- **HTML/CSS**

## Requisitos para Rodar o Projeto

1. **Java 17** ou superior.
2. **Maven** configurado no ambiente.

## Como Executar o Projeto

```markdown
## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/product-app.git
   ```

2. Entre na pasta do projeto:
   ```bash
   cd product-app
   ```

3. Compile e execute:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse no navegador:
   - Cadastro de produtos: [http://localhost:8080/produtos/novo](http://localhost:8080/produtos/novo)
   - Listagem de produtos: [http://localhost:8080/produtos](http://localhost:8080/produtos)

## Estrutura do Projeto

- `src/main/java/com/example/productapp/model/Produto.java`: Classe que representa a entidade Produto.
- `src/main/java/com/example/productapp/repository/ProdutoRepository.java`: Interface responsável por gerenciar as operações no banco de dados.
- `src/main/java/com/example/productapp/controller/ProdutoController.java`: Controlador que gerencia as rotas e lógica do sistema.
- `src/main/resources/templates/cadastro.html`: Página de cadastro.
- `src/main/resources/templates/listagem.html`: Página de listagem.

## Banco de Dados

Este projeto utiliza o **H2 Database** (em memória) para simplificar o desenvolvimento. Não é necessário configurar um banco de dados externo.

### Acessar o Console do H2
- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- Configuração:
  - **Driver Class:** `org.h2.Driver`
  - **JDBC URL:** `jdbc:h2:mem:testdb`
  - **User Name:** `sa`
  - **Password:** (deixe vazio)
```

