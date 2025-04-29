# Cadastro de Pessoas

Projeto desenvolvido com foco em arquitetura corporativa utilizando Java EE (Jakarta EE), implementando um sistema completo de **cadastro de pessoas e endereços**, com funcionalidades de CRUD, validações e persistência em banco de dados PostgreSQL. A aplicação é baseada em camadas (Model, Repository, Service e Controller) e utiliza tecnologias consolidadas no mercado.

---

## 🧩 Tecnologias Utilizadas

-   **Java 17**
-   **Jakarta EE** (JSF, EJB, CDI, JPA)
-   **PrimeFaces** (componentes ricos para JSF)
-   **PostgreSQL** (banco de dados relacional)
-   **JPA (Hibernate)** para persistência
-   **WildFly** ou **Payara** como servidor de aplicação
-   **Maven** como gerenciador de dependências
-   **JSP/Facelets** para as views com XHTML

---

## 🗂️ Estrutura de Camadas

-   **Model**: entidades JPA mapeadas para o banco de dados.
-   **Repository**: camada de persistência e acesso ao banco de dados via `EntityManager`.
-   **Service**: regras de negócio, controle transacional, e chamada aos repositórios.
-   **Controller (Beans)**: comunicação com a camada de visualização (JSF/PrimeFaces).

---

## 📋 Funcionalidades

-   Cadastro de pessoas com:

    -   Nome
    -   Idade (data de nascimento)
    -   Gênero

-   Cadastro de endereços com:

    -   Estado, cidade, rua, número e CEP
    -   Relacionamento com a pessoa

-   Listagem, edição e exclusão de registros
-   Integração com base de dados PostgreSQL
-   Validações básicas no frontend
-   Navegação entre páginas JSF com estado controlado

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

-   Java 17+
-   Maven 3.8+
-   PostgreSQL rodando
-   IDE (Eclipse, IntelliJ, VS Code com suporte Java EE)
-   Servidor de aplicação (WildFly 27+ ou Payara 6+)

### Banco de Dados

1. Crie o banco:

```sql
CREATE DATABASE cadastropessoas;
```

2. Configure o persistence.xml com suas credenciais de acesso:

```xml
<property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/cadastropessoas"/>
<property name="jakarta.persistence.jdbc.user" value="seu_usuario"/>
<property name="jakarta.persistence.jdbc.password" value="sua_senha"/>
```

## Deploy da aplicação

1. Compile com o Maven:

```bash
mvn clean install
```

2. Copie o arquivo .war gerado (em target/) para o diretório de deploy do seu servidor.

3. Acesse a aplicação em:

http://localhost:8080/cadastropessoas/

(ou substitua cadastropessoas pelo nome do seu .war)

## Telas:

Tela de cadastro de pessoa
Tela de listagem de endereços

## Organização do Código

```bash
src/main/java
├── br.com.cadastropessoas.model
├── br.com.cadastropessoas.repository
├── br.com.cadastropessoas.service
└── br.com.cadastropessoas.controller

src/main/webapp
├── index.xhtml
├── person.xhtml
└── address.xhtml
```

## Possíveis melhorias futuras

Validações mais robustas com Bean Validation (@NotNull, @Size, etc.)

Paginação e ordenação de listas

Integração com API externa de CEP

Autenticação e controle de acesso (JAAS, JWT, etc.)

Testes automatizados (JUnit + Arquillian ou Mockito)

## Autor

Tiago Garbi Baganha

Desenvolvedor Full Stack | Java | React | PostgreSQL | Kubernetes
