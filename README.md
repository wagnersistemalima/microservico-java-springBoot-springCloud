# microsserviço-java-springBoot-springCloud
🔨 🔧... sistema composto por vários microsserviços que comunicam entre si de forma transparente, escalável e com balanceamento de carga, com autenticação e autorização, usando OAuth e tokens JWT. Está em construção 🔧

## Visão do projeto:

* Montar a estrutura do projeto, a comunicação entre os microsserviços, a configuração automatica, escala automatica, balanceamento de carga. 

* desenvolver um sistema com alguns microserviços

* Serviço de trabalhadores, que estará conectado com um banco de dados, onde iremos manter um cadastro de cada trabalhador.

* Microsserviço de folha de pagamento

* Microsserviços de usuarios, que estará anexado a um banco de dados, com permissao e perfil de acesso para cada usuario.

* Serviço de autorização e autenticação, com protocolo OAuth e tokens JWT, padrão usado por industrias bem populares.

* Os microserviços irão se registrar em um servidor Discovery Eureka.

* API gateway para rotear os microsserviços

* Servidor de configuração.

## Implementação utilizando as ferramentas do ecossistema Spring com Java

* Banco de dados H2: banco de dados em memoria, para testes

* Ferramenta Postman: Para testar as requisições e criar um ambiente de produção

* JPA : biblioteca padrão de persistência de dados no java, baseado no mapeamento objeto relacional

* API Gateway Zuul :  lida com todas as solicitações e executa o roteamento dinâmico de aplicativos de microsserviço. Funciona como porta de entrada para todos os pedidos. Também é conhecido como Edge Server. Zuul é construído para permitir roteamento dinâmico, monitoramento, resiliência e segurança.

* Oauth : é um padrão aberto para autorização, comumente utilizado para permitir que os usuários da Internet possam fazer logon em sites de terceiros usando suas contas do Google, Facebook, Microsoft, Twitter, etc.—mas, sem expor suas senhas.

* Feign: Uma maneira elegante de criar clientes HTTP em Java

* Discovery Server Eureka: Em uma arquitetura típica de microsserviço, temos muitos pequenos aplicativos implantados separadamente e eles geralmente precisam se comunicar uns com os outros. Especificamente, quando dizemos serviço ao cliente , queremos dizer um serviço que precisa fazer chamadas REST para algum outro serviço final.

