# Aula 1: Introdução ao Spring

Bom dia, boa tarde, boa noite, pessoas desenvolvedoras! Hoje iniciamos nossos estudos sobre o Spring Framework, esse framework que revolucionou o universo da plataforma de desenvolvimento Java.

Nessa aula, vamos abordar a introdução ao Spring, quando surgiu, o que se propôs a solucionar e os módulos que compõem o framework Spring.

## Java EE (Java Enterprise Edition)

O Java EE (Java Enterprise Edition) é uma plataforma de desenvolvimento da linguagem Java para a criação de aplicativos. Ele possui um conjunto de bibliotecas, APIs e serviços que ajudam as pessoas desenvolvedoras a construir aplicações, focando na regra de negócio. Isso inclui recursos como gerenciamento de transações, segurança, acesso a bancos de dados e comunicação entre diferentes partes de um sistema.

Para ilustrar a importância disso, pense em construir um jogo, por exemplo. Tornar o processo mais fácil envolve a criação de componentes que cuidam de camadas, como comunicação com bancos de dados, filas assíncronas e sessões de usuário, abstraindo a implementação de cada camada. Dessa forma, podemos nos concentrar apenas na lógica que trata as regras de negócio do aplicativo.

Vamos exemplificar criando uma aplicação simples que utiliza EJB para retornar a data do servidor.

### Requisitos para o Projeto

- Java na versão 17
- Um servidor de aplicação
- Nossa IDE

### Passos para Iniciar o Projeto

1. Baixar um servidor de aplicação, como o GlassFish.

2. Criar o projeto na IDE.

3. Limpar o projeto e configurar para trabalhar com JSF (JavaServer Faces).

4. Configurar o arquivo `web.xml`.

5. Criar o arquivo `faces-config.xml` dentro da pasta `WEB-INF`.

6. Criar o arquivo `index.xhtml` dentro da pasta `webapp`.

Fique ligado porque vamos responder no próximo vídeo.

E em meados de 2002 Rod Johnson era uma pessoa arquiteta de software estava escrevendo um livro com as melhores práticas para desenvolver utilizando JAVA EE, e com isso ele começou a perceber que às vezes tinha que escrever muito código para fazer uma coisa que deveria ser mais simples e que tinham que ter uma maneira melhor de fazer certas coisas. E com isso, em 2003, surgiu o Spring, que foi abraçado pela comunidade.

O Spring surgiu com muitas facilidades, como injeção de dependência, uma melhor forma de lidar com gerenciamento de transações e modularidade.

Vamos abrir o site do Spring [https://spring.io/why-spring](https://spring.io/why-spring) e verificar um pouco sobre esse universo.

### Tópicos Abordados

- O Spring está em todos os lugares.
- O Spring é flexível.
- O Spring é produtivo.
- O Spring é rápido.
- O Spring é seguro.
- O Spring tem apoiadores.

Para quem está inserido na área de desenvolvimento e já conhece o universo Java, escuta muito sobre o Spring Boot.

O Spring Boot é tema para outra aula, pois para entendermos o Spring Boot e suas vantagens, temos que entender sobre os módulos do Spring.
