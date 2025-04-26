
# Sistema de Gerenciamento de Usuários

Este projeto é uma aplicação Java simples que realiza operações de CRUD (Create, Read, Update, Delete) em um banco de dados MySQL para o gerenciamento de usuários.

## 📋 Funcionalidades

- Inserir novos usuários no banco de dados
- Buscar informações de um usuário pelo ID
- Atualizar informações de um usuário
- Deletar usuários do banco de dados

## 🛠️ Tecnologias utilizadas

- Java 17+ 
- JDBC (Java Database Connectivity)
- MySQL
- IDE recomendada: IntelliJ IDEA ou Eclipse

## 📂 Estrutura de diretórios

```
dobackaofront/
├── controller/
│   └── BancoDeDados.java
├── model/
│   └── Usuario.java
└── Main.java
```

## 🚀 Como rodar o projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
   
2. **Configure seu banco de dados MySQL**:
   - Crie um banco chamado `cadastro`.
   - Crie a tabela `usuarios` com a seguinte estrutura:
   
   ```sql
   CREATE TABLE usuarios (
       id INT PRIMARY KEY AUTO_INCREMENT,
       nome VARCHAR(100),
       idade INT,
       sexo CHAR(1),
       cpf VARCHAR(14),
       cor_da_pele VARCHAR(50),
       peso DOUBLE,
       altura DOUBLE
   );
   ```

3. **Ajuste a conexão com o banco de dados**:
   - No arquivo `BancoDeDados.java`, edite se necessário:
     ```java
     String url = "jdbc:mysql://localhost:3306/cadastro";
     String login = "root";
     String senha = "admin";
     ```

4. **Execute a aplicação**:
   - Rode a classe `Main.java`.
   - A aplicação irá realizar operações de inserção, alteração, ou exclusão de dados no banco.

## ⚙️ Observações

- Certifique-se de que o servidor MySQL esteja ativo ao rodar o programa.
- O driver JDBC deve estar incluído no seu projeto (`mysql-connector-java`).

## 👨‍💻 Autor

- Leonardo Izidoro Irineu
