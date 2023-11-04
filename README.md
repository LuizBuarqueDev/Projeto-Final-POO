## Projeto Final POO

Projeto Final da Disciplina de Programação Orientada a Objetos no Instituto Federal de Pernambuco

Neste projeto, será desenvolvido um sistema complexo que demonstra proficiência em Programação Orientada a Objetos (POO). O projeto deverá abranger, no mínimo, 12 classes interligadas, incorporando os conceitos fundamentais da POO, como polimorfismo, classes abstratas, encapsulamento e herança. 
O objetivo principal deste projeto é capacitar os estudantes a aplicar as melhores práticas de POO no desenvolvimento de um sistema completo e funcional, promovendo a compreensão de conceitos essenciais para a construção de software robusto e escalável.

Cada classe no sistema terá uma função específica e será projetada para cumprir o princípio do encapsulamento, garantindo que os dados e comportamentos sejam estruturados de forma apropriada e protegidos contra acesso não autorizado.
A herança será utilizada para estabelecer relações entre classes, promovendo a reutilização de código e a organização hierárquica das funcionalidades do sistema.
Além disso, o conceito de polimorfismo será aplicado para permitir que objetos de diferentes classes possam ser tratados de maneira uniforme, simplificando o código e tornando-o mais flexível. 
Classes abstratas serão utilizadas para definir comportamentos padrão que devem ser implementados por subclasses, garantindo uma estrutura coerente no sistema.

```mermaid
classDiagram
   class PessoaFisica {
    <<abstract>>
    - nome : String
    - rg : String
  }
  
  class Cliente{
    - quantidadeOcupacoes : int
    + calcularOcupacoes(): int 
  }

  class Funcionario {
    - setor : String
  }

  class Gerente {
    - codigoDeAcesso : String
  }

  class Endereco {
    - cidade : String 
    - bairro : String
    - rua : String
    - numero : String
  }
  
  class Telefone{
    - ddd : String
    - numero : String
  }
  
  class Reserva {
    - data : String
  }
  
  class Quarto {
    - estado : boolean
    - numeroQuarto : int
  }
  
  class Cama {
    - tipo : String
  }

  class Hotel {
    - nome : String
  }
  
  class Servico {
    - descricao : String
    - custo : double
  }
  
  class Pagamento {
    - metodo : String
    - valor : double
  }

  PessoaFisica <|-- Cliente
  PessoaFisica <|-- Funcionario
  PessoaFisica <|-- Gerente
  
  Endereco "1" <-- "1" Hotel
  Endereco "1"<-- "1"PessoaFisica
  Telefone "1"<-- "1"PessoaFisica
  Cliente "1"<-- "N"Reserva
  Funcionario "1"<-- "N"Reserva
  Quarto "N"<-- "N"Reserva
  Cama "1"<-- "1"Quarto
  Reserva "N" <-- "1" Hotel
  Hotel "1" --> "N" Servico
  Cliente "1" <-- "1" Pagamento
