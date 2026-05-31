# mvc_web_alunos
##Sistema de Cadastro de Alunos (MVC Web)

Este projeto consiste em uma aplicação Java desenvolvida com Spring Boot e Thymeleaf, criada como parte prática para demonstrar e consolidar os conceitos da arquitetura MVC (Model-View-Controller).

O principal objetivo do projeto é mostrar como a separação física de pacotes no código reflete diretamente na separação lógica de responsabilidades arquiteturais.

#Estrutura Arquitetural (Separação de Conceitos)

A arquitetura do sistema foi estruturada estritamente de acordo com o padrão MVC:

1. Camada Model (com.exemplo.mvc.model)

Classe: Aluno.java

Responsabilidade: Representa os dados e as regras de negócio puras da aplicação.

Isolamento: É totalmente independente do protocolo HTTP ou de qualquer elemento visual (HTML). Ela não sabe como os dados são mostrados ou de onde eles vêm. Possui validações internas básicas (garantindo que um aluno não seja cadastrado sem nome).

2. Camada Controller (com.exemplo.mvc.controller)

Classe: AlunoController.java

Responsabilidade: Atua como o intermediador e cérebro do fluxo de navegação.

Funcionamento:

Escuta as requisições HTTP (/alunos).

Processa as entradas do formulário e as envia para o Model correspondente.

Decide qual interface visual (View) deve ser exibida para o usuário a seguir.

Isolamento: Não contém lógica de apresentação (HTML) e nem armazena as regras de negócio intrínsecas do domínio Aluno.

3. Camada View (src/main/resources/templates)

Arquivos: alunos-form.html e alunos-lista.html

Responsabilidade: Responsável única e exclusivamente por exibir as telas e dados ao usuário final de forma amigável.

Tecnologia: Utiliza o Thymeleaf como motor de template para renderizar dados dinamicamente, mantendo o HTML limpo e independente da lógica Java pura.

# Tecnologias Utilizadas

Java 17 (ou superior)

Spring Boot (Spring Web)

Thymeleaf (Renderização HTML no lado do servidor)

Maven (Gerenciador de dependências e build)
