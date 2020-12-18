# microsserviço-java-springBoot-springCloud
🔨 🔧... sistema composto por vários microsserviços que comunicam entre si de forma transparente, escalável e com balanceamento de carga, com autenticação e autorização, usando OAuth e tokens JWT. 

## Visão do projeto:

* Montar a estrutura do projeto, a comunicação entre os microsserviços, a configuração automatica, escala automatica e balanceamento de carga. 

* desenvolver um sistema com alguns microserviços.

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

* JWT (JSON WEB TOKENS): É um método RCT 7519 padrão da indústria para realizar autenticação entre duas partes por meio de um token assinado que autentica uma requisição web. Esse token é um código em Base64 que armazena objetos JSON com os dados que permitem a autenticação da requisição.

* Feign: Uma maneira elegante de criar clientes HTTP em Java

* Discovery Server Eureka: Em uma arquitetura típica de microsserviço, temos muitos pequenos aplicativos implantados separadamente e eles geralmente precisam se comunicar uns com os outros. Especificamente, quando dizemos serviço ao cliente , queremos dizer um serviço que precisa fazer chamadas REST para algum outro serviço final.

# Status do Projeto = Está em construção 🔧

# Fase 1: Comunicação simples, Feign, Ribbon. Concluida!👋

* 1.1 Criar projeto hr-worker
* 1.2 Implementar projeto hr-worker
* 1.3 Criar projeto hr-payroll
* 1.4 Implementar projeto hr-payroll (mock)
* 1.5 RestTemplate
* 1.6 Feign
* 1.7 Ribbon load balancing

# Fase 2: Eureka, Hystrix, Zuul. Concluida!👋

### Criar projeto hr-eureka-server

### Configurar hr-eureka-server

### Configurar clientes Eureka

### Random port para hr-worker

### Tolerância a falhas com Hystrix

### Timeout de Hystrix e Ribbon

### Criar projeto hr-zuul-server

### Configurar hr-zuul-server

### Random port para hr-payroll

### Zuul timeout

# Fase 3: Configuração centralizada. Concluido! 👋

### Criar projeto hr-config-server

### Configurar projeto hr-config-server

###  hr-worker como cliente do servidor de configuração, profiles ativos

### Actuator para atualizar configurações em runtime

### Repositório Git privativo

# Fase 4: autenticação e autorização. Construindo 👷 🛠️



