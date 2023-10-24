## Projeto Final POO

Projeto Final da Disciplina de Programação Orientada a Objetos no Instituto Federal de Pernambuco

Neste projeto, será desenvolvido um sistema complexo que demonstra proficiência em Programação Orientada a Objetos (POO). O projeto deverá abranger, no mínimo, 12 classes interligadas, incorporando os conceitos fundamentais da POO, como polimorfismo, classes abstratas, encapsulamento e herança. 
O objetivo principal deste projeto é capacitar os estudantes a aplicar as melhores práticas de POO no desenvolvimento de um sistema completo e funcional, promovendo a compreensão de conceitos essenciais para a construção de software robusto e escalável.

Cada classe no sistema terá uma função específica e será projetada para cumprir o princípio do encapsulamento, garantindo que os dados e comportamentos sejam estruturados de forma apropriada e protegidos contra acesso não autorizado.
A herança será utilizada para estabelecer relações entre classes, promovendo a reutilização de código e a organização hierárquica das funcionalidades do sistema.
Além disso, o conceito de polimorfismo será aplicado para permitir que objetos de diferentes classes possam ser tratados de maneira uniforme, simplificando o código e tornando-o mais flexível. 
Classes abstratas serão utilizadas para definir comportamentos padrão que devem ser implementados por subclasses, garantindo uma estrutura coerente no sistema.

## Diagrama de classes
```mermaid
classDiagram
  class Pessoa {
    - nome: String
    - cpf: String
    - email: String
  }
  
  class Funcionario {
    - idFuncionario: int
    - cargo: String
  }
  
  class Gerente {
    - equipe: List<Funcionario>
  }
  
  class Desenvolvedor {
    - linguagemPreferida: String
  }
  
  class Departamento {
    - nome: String
    - funcionarios: List<Funcionario>
  }
  
  class Empresa {
    - departamentos: List<Departamento>
  }
  
  class Pagamento {
    <<abstract>>
    - calcularPagamento(): double
  }
  
  class SalarioMensal {
    - salarioFixo: double
    + calcularPagamento(): double
  }
  
  class SalarioPorHora {
    - horasTrabalhadas: int
    - taxaPorHora: double
    + calcularPagamento(): double
  }
  
  class Relatorio {
    + gerarRelatorio(): void
  }
  
  class Main {
    + main(args: String[]): void
  }
  
  class BancoDeDados {
    - armazenarInformacoes(): void
    - recuperarInformacoes(): void
  }

  Pessoa <|-- Funcionario
  Funcionario <|-- Gerente
  Funcionario <|-- Desenvolvedor
  Funcionario *-- Departamento
  Departamento *-- Empresa
  Pagamento <|-- SalarioMensal
  Pagamento <|-- SalarioPorHora
  Funcionario --|> Pagamento
  Main --> Empresa
  Main --> Relatorio
  Main --> BancoDeDados
