Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t prograng. We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

**ATIVIDADE 1**

Com base nos parágrafos em questão, a Engenharia de Software pode ser definida como o ramo que lida com a criação, desenvolvimento e manutenção dos sistemas de softwares de maneira metódica e eficaz. Há uma diferença entre programação e engenharia de software, como relata o texto. A programação é uma das partes que compõe a engenharia de software, que por sua vez se mostra em um campo muito mais amplo do que a mesma.


**ATIVIDADE 2**

Alguns exemplos de trade-offs:

           1 - Desempenho x Consumo de dados: otimizar algoritmos para melhorar o desempenho pode resultar em maior consumo de recursos computacionais;
           2 - Segurança x Usabilidade: exigir senhas mais complexas/autenticação de dois fatores aumenta o percentual de segurança de um software, porém também pode tornar o processo de login menos conveniente para o usuário;
           3 - Manutenção x Desempenho: adicionar uma camada de abstração para facilitar futuras mudanças e permitir configurações flexíveis pode tornar o código mais modular e fácil de manter, mas também pode resultar em um sistema mais complexo e exigir uma revisão intensa para implementar mudanças significativas.


**ATIVIDADE 3**

**Arquitetura em camadas (Layered Architecture)** - REQUISITOS
           *- O sistema de gerenciamento de vendas deve permitir que os usuários cadastrem novos clientes com informações detalhadas, incluindo nome, endereço, número de telefone e e-mail* (requisito específico, mensura claramente uma funcionalidade que agrega valor ao sistema)
           *- O sistema deve ser fácil de usar* (requisito vago e subjetivo, não fornece critérios claros para avaliar se o sistema atende ao requisito de "ser fácil de usar")

          EXEMPLO: Sistema de gerenciamento de biblioteca (Seguindo a arquitetura de camadas, o sistema teria camadas de apresentação, aplicação, acesso a dados e os dados propriamente ditos. Logo, teríamos uma separação clara de reponsabilidades entre a interface do usuário, a lógica de negócios, o acesso e o armazenamento de dados).

**Arquitetura de Pipeline (Pipeline Architecture Style)** - REQUISITOS
           *- O sistema de gerenciamento de uma loja online deve permitir que os clientes adicionem produtos ao carrinho de compras, visualizem o total dos itens selecionados e realizem o checkout fornecendo informações de pagamento, incluindo número do cartão de crédito, data de validade e código de segurança* (requisito específico, mensura claramente uma funcionalidade que agrega valor ao sistema e quais informações são necessárias para realizar tais tarefas)
           *- O sistema deve ser rápido* (requisito vago, não fornece critérios claros para avaliar se o sistema atende ao requisito de "ser rápido")

           EXEMPLO: Sistema de processamento de pedidos de um e-commerce (Seguindo a arquitetura de pipeline, o sistema haveria 5 estágios: recebimento de pedidos, validação de pedidos, processamento de pagamento, preparação para envio e o envio. Cada estágio representa uma etapa sequencial que fluem de um para outro até que os pedidos sejam finalizados e enviados para o cliente).

**Arquitetura de Microkernel (Microkernel Architecture)** - REQUISITOS
           *O sistema de gerenciamento de estoque deve permitir que os usuários realizem uma busca por nome de produto e exibam os resultados de forma rápida e precisa, com base na correspondência parcial ou total do termo de pesquisa com o nome do produto armazenado no banco de dados* (requisito específico e mensurável, descreve uma funcionalidade muito importante do sistema, que agrega valor ao mesmo e facilita a implementação e avaliação do sistema)
           *O sistema deve ser rápido e seguro* (requisito amplo e ambíguo, não fornece critérios claros para avaliar se o sistema atende aos requisitos de desempenho e segurança)

           EXEMPLO: Sistema operacional para veículos autônomos (Seguindo a Arquitetura de Microkernel, o sistema possui 5 etapas de desenvolvimento: O microkernel, ou núcleo mínimo, serviços externos, comunicação entre componentes, flexibilidade e modularidade, isolamento e segurança. Um sistema modular, capaz de lidar flexivelmente com as complexas demandas de computação e tomadas de decisão em tempo real).

**Arquitetura baseada em serviços (Service-based Architecture)** - REQUISITOS
           *O sistema de comércio eletrônico deve permitir que os clientes adicionem produtos ao carrinho de compras, visualizem o total dos itens selecionados e finalizem a compra fornecendo informações de pagamentos, incluindo número do cartão de crédito, data de validade e código de segurança* (requisito bom, mensurável e claro na definição de uma funcionalidade que agrega valor ao sistema)
           *O sistema de gerenciamento de documentos deve ser eficiente* (requisito vago, não define claramente funcionalidades para tornar o sistema eficiente)

           EXEMPLO: Sistema de gerenciamento de tarefas (Seguindo essa arquitetura, temos definidos os serviços ligados às funcionalidades do sistema. Temos nesse sistema os serviços de autenticação, gerenciamento de tarefas, notificação, integração com calendário e análise de desempenho. Cada um desses serviços seria desenvolvido e implantado de forma independente, ou seja, com interfaces para cada serviço).

**Arquitetura orientada a eventos (Event-driven Architecture (EDA))** - REQUISITOS
           *O sistema de gestão de eventos deve permitir que os usuários recebam notificações por e-mail sempre que novos eventos forem adicionados à agenda, com um link direto para visualizar os detalhes do evento* (requisito claro, que identifica o que e como deve ser feita a funcionalidade mencionada)
           *O sistema de gestão de eventos deve ser fácil de usar* (requisito vago e subjetivo, que pode levar a interpretações variadas e dificuldades na implementação e na avaliação do sistema)

           EXEMPLO: Gestão de estoque (Seguindo a EDA, os componentes do sistema são projetados conforme os eventos definidos nele. Logo, temos os produtores, consumidores e os canais de evento. Sendo assim, essa arquitetura proporciona a facilidade de sua expansão para possivelmente incorporar novos produtores e consumidores, por exemplo).

**Arquitetura de microserviços (Microservices Architecture)** - REQUISITOS
           *O sistema de gestão de reservas de hotel deve permitir que os usuários pesquisem disponibilidade de quartos para determinadas datas e localizações, exibindo resultados precisos e atualizados em tempo real* (requisito bom, especifica e define claramente uma funcionalidade que agrega valor ao sistema, identificando o que precisa ser feito)
           *O sistema de gestão de reservas de hotel deve ser fácil de usar* (requisito vago, impossibilita a definição de critérios claros para avaliar como ele seria "fácil de usar")

           EXEMPLO: Sistema de streaming de vídeo (Seguindo essa arquitetura, o sistema conta com microserviços necessários, cada um com a sua funcionalidade específica para proporcionar flexibilidade, escalabilidade e facilidade de manutenção, como autenticação e autorização, catálogo e reprodução de vídeos, recomendação de conteúdo, interação social, pagamentos e assinaturas, análise de dados e monitoramento. Logo, as aplicações interagiriam com esses serviços por meio de APIs, utilizando cada serviço conforme necessário).

**ATIVIDADE 4** 

**Arquitetura em Camadas (Layered Architecture)**

**Camada de Apresentação (Presentation Layer)**
Esta camada pode incluir uma interface gráfica ou uma API REST para interação com o usuário.

**Camada de Aplicação (Application Layer)**
Contém a lógica de negócios. Esta camada pode ser representada pela classe JogarLeagueOfLegends que gerencia a adição de usuários e partidas, além da associação de usuários às partidas.

**Camada de Domínio (Domain Layer)**
Contém as entidades de negócios. Inclui as classes CadastrarUsuario e LeagueOfLegends.

**Camada de Persistência (Persistence Layer)**
Gerencia a persistência dos dados. Embora o código atual não mostre como os dados são persistidos, é possível adicionar classes ou interfaces para gerenciar o armazenamento de usuários e partidas, por exemplo, usando um banco de dados. 

**ATIVIDADE 5, 6, 7 (ANEXADAS NO GIT)**




