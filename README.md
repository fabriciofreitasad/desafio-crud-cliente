# Desafio - CRUD Cliente
Este projeto é parte do curso da DevSuperior ministrado pelo professor Nélio Alves. Nele, desenvolvemos um sistema de CRUD (Create, Read, Update, Delete) de clientes em Java, utilizando diversas ferramentas e tecnologias populares.

## Licença:
[![NPM](https://img.shields.io/npm/l/react)]([https://github.com/neliocursos/exemplo-readme/blob/main/LICENSE](https://github.com/fabriciofreitasad/desafio-crud-cliente/edit/main/LICENSE)) 
O dscommecer é distribuído sob a licença
o que significa que você é livre para usar, modificar e distribuir o projeto de acordo com os termos da licença.

## Descrição
O objetivo deste projeto é implementar um sistema básico de gerenciamento de clientes, permitindo a criação, visualização, atualização e exclusão de registros. Utilizamos o padrão arquitetural MVC (Model-View-Controller) para estruturar a aplicação.

## Modelo conceitual

![image](https://github.com/fabriciofreitasad/desafio-crud-cliente/assets/111000422/eabfa94e-6af7-4929-a518-bbddeb21a0e1)

## Ferramentas Utilizadas
Spring Boot: O Spring Boot é um framework poderoso que simplifica o desenvolvimento de aplicativos Java, fornecendo configurações automáticas e facilitando o processo de criação de aplicações robustas e eficientes.

STS (Spring Tool Suite): O Spring Tool Suite é uma IDE baseada em Eclipse, otimizada para o desenvolvimento com o ecossistema Spring. É uma ferramenta muito útil para desenvolver aplicações Spring Boot com facilidade.

Postman: O Postman é uma ferramenta popular que permite testar APIs de forma simples e eficiente. Usamos o Postman para testar as funcionalidades do nosso CRUD de clientes.

JPA (Java Persistence API): A JPA é uma especificação do Java que permite o mapeamento objeto-relacional e simplifica o acesso a banco de dados relacionais. Com a JPA, podemos trabalhar com as entidades do nosso projeto de forma mais orientada a objetos.

Hibernate: O Hibernate é uma das implementações da JPA e oferece recursos adicionais para facilitar a persistência de dados e o mapeamento entre as entidades Java e as tabelas do banco de dados.

H2 Database: O H2 é um banco de dados relacional em memória, muito útil para fins de desenvolvimento e testes, pois permite que executemos nossa aplicação sem a necessidade de configurar um banco de dados externo.

## Como executar o projeto
Clone este repositório para o seu ambiente de desenvolvimento local.

Abra o projeto no STS (Spring Tool Suite) ou na sua IDE preferida.

Aguarde a IDE resolver as dependências do Maven automaticamente.

Execute o aplicativo Spring Boot para iniciar o servidor.

O servidor estará disponível em http://localhost:8081. Você pode acessar a API por meio do Postman ou testar utilizando um navegador.

## Endpoints da API
GET /clientes: Retorna uma lista com todos os clientes cadastrados.

GET /clientes/{id}: Retorna os detalhes de um cliente específico com base no ID fornecido.

POST /clientes: Cria um novo cliente com os dados fornecidos no corpo da solicitação.

PUT /clientes/{id}: Atualiza os dados de um cliente existente com base no ID fornecido e nos dados fornecidos no corpo da solicitação.

DELETE /clientes/{id}: Exclui um cliente existente com base no ID fornecido.

![image](https://github.com/fabriciofreitasad/desafio-crud-cliente/assets/111000422/547c48b0-e46b-4cd1-85be-9cb5e1f58920)


## Considerações Finais
Este projeto é um excelente ponto de partida para quem deseja aprender sobre o desenvolvimento de aplicações Java utilizando ferramentas como Spring Boot, JPA e Hibernate. O curso da DevSuperior ministrado pelo professor Nélio Alves fornece instruções detalhadas sobre cada etapa do desenvolvimento, possibilitando uma experiência de aprendizado enriquecedora.

Caso tenha alguma dúvida ou precise de mais informações sobre o curso ou o projeto, sinta-se à vontade para entrar em contato com o professor Nélio Alves ou visitar o site oficial da DevSuperior.

Aproveite o aprendizado e divirta-se codificando! 😊
