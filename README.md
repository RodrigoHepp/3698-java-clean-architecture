![Programação-Arquitetura Java](https://github.com/jacqueline-oliveira/3698-java-clean-architecture/assets/66698429/0191ea20-432f-4583-a391-f01558004fb9)
![](https://img.shields.io/github/license/alura-cursos/android-com-kotlin-personalizando-ui)

# CodeChella

App de simulação de um site para venda de ingressos de eventos diversos

## 🔨 Objetivos do projeto

- Conhecer os diferentes tipos de arquitetura de software;
- Aprender os princípios da Clean Architecture;
- Implementar um projeto com separação de responsabilidades e isolamento do domínio;
- Entender sobre entidades, objetos de valor, casos de uso, repositórios e controladores;
- Analisar os prós e contras de arquiteturas que utilizam muitas camadas de abstração.

## 🏗 Arquitetura do Projeto
Estrutura modularizada em camadas:

/src

├── domain # Entidades, Value Objects, lógica do negócio

├── usecase # Casos de uso (interatores)

├── interface # Controllers, API REST

└── infra # Implementações de persistência e frameworks

- O núcleo (domínio) não depende de frameworks externos  
- Dependência invertida: camadas externas dependem do domínio  

---

## ⚙️ Tecnologias Utilizadas
- **Linguagem:** Java  
- **Framework:** Spring Boot  
- **Banco de dados:** PostgreSQL  
- **Gerenciamento:** Maven  

---

## 🚀 Como Rodar a Aplicação
1. Clone o repositório:  
   ```bash
   git clone https://github.com/RodrigoHepp/3698-java-clean-architecture.git
   cd 3698-java-clean-architecture```


Configure o banco (opcional) no arquivo application.properties:

  spring.datasource.url=jdbc:postgresql://localhost/codechella_db
  
  spring.datasource.username=seu_usuario
  
  spring.datasource.password=sua_senha
  
  spring.jpa.hibernate.ddl-auto=update
