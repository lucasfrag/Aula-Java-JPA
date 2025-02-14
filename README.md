# 🚀 Java JPA Exemplo

Este repositório contém um projeto Java que exemplifica a construção de uma aplicação desktop utilizando Hibernate para persistência de dados, seguindo a especificação JPA (Java Persistence API).

## Tecnologias Utilizadas 🖥️
O projeto **Java Maven** foi criado utilizando o **Apache NetBeans IDE** e com as dependências **Hibernate** e **JDBC Driver** - para mais informações consulte o arquivo `pom.xml`.

## Configuração do Ambiente ⚙️

### 1. Pré-requisitos ✅
Certifique-se de ter instalado em seu sistema:
- [Java 23](https://www.oracle.com/br/java/technologies/downloads/) (ou superior)
- [Apache NetBeans IDE](https://netbeans.apache.org/front/main/index.html)
- [MySQL Server](https://www.mysql.com)

### 2. Configuração do Banco de Dados 🛢️
Execute os comandos SQL do arquivo `script.sql` para criar o banco de dados com suas respectivas  tabelas.

Atualize as credenciais do banco no arquivo **application.properties**:
```properties
<property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost/biblioteca_jpa" />
<property name="jakarta.persistence.jdbc.user" value="seu_usuario" />
<property name="jakarta.persistence.jdbc.password" value="sua_senha" />
```

---
📌 **Dica**: Para aprofundar seus conhecimentos em JPA e Hibernate, consulte a documentação oficial do Hibernate e o Guia da JPA.

