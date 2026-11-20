# Estudos de Java

Repositório com os exercícios e materiais do curso **Java COMPLETO** (Java e OO, UML, JDBC, JavaFX e mais), do professor **Nelio Alves** ([educandoweb.com.br](http://educandoweb.com.br)).

<img width="800" height="470" alt="image" src="https://github.com/user-attachments/assets/97212060-274a-4461-b551-04ff0c170f31" />

## Progresso

| Seção | Tema | Aulas |
| --- | --- | --- |
| 5 | Estrutura condicional | 40 a 47 |
| 6 | Estruturas repetitivas | 50 a 62 |
| 7 | Outros tópicos básicos | 63 a 68 |
| 8 | Classes, atributos, métodos e membros estáticos | 69 a 80 |
| 9 | Construtores, palavra `this`, sobrecarga e encapsulamento | 81 a 91 (em andamento) |

## Organização

O código fica em `src/`, separado por seção do curso e por aula:

- `section_N`: seção do curso
- `aulaNN_nome_da_aula`: código da aula (o número é o mesmo da aula no curso)
- os PDFs de material de apoio ficam na pasta da aula onde aparecem no curso

```
src/
├── App.java                                  <- Hello World padrão do VS Code
│
├── section_5/                                <- Estrutura condicional
│   ├── aula40_expressoes_comparativas/
│   │   └── ExpressoesComparativas.java
│   ├── aula41_expressoes_logicas/
│   │   └── ExpressoesLogicas.java
│   ├── aula42_if_else/
│   │   └── IfElse.java
│   ├── aula44_exercicios_iniciantes_parte2/
│   │   └── Exercicio01.java
│   ├── aula45_atribuicao_cumulativa/
│   │   └── AtribuicaoCumulativa.java
│   ├── aula46_escopo_inicializacao/
│   │   └── Inicializacao.java
│   ├── aula46_switch_case/
│   │   └── SwitchCase.java
│   └── aula47_condicional_ternaria/
│       ├── CondicionalTernaria.java          <- versão com if-else
│       └── ComCondicionalTernaria.java       <- mesma lógica com ternário
│
├── section_6/                                <- Estruturas repetitivas
│   ├── aula50_material_de_apoio/
│   │   └── 06-estruturas-repetitivas.pdf
│   ├── aula51_debug_no_java/
│   │   ├── Debug.java
│   │   └── TesteDebug.java                   <- roteiro de breakpoints (F10/F11)
│   ├── aula52_estruturas_repetitivas/
│   │   ├── Estruturas.java                   <- while até digitar 0
│   │   ├── Exercicio1.java
│   │   ├── Exercio2.java
│   │   └── Exercicio3.java
│   ├── aula56_exercicios_iniciantes_parte3/
│   │   └── 02-exercicios3-estrutura-while.pdf
│   ├── aula57/
│   │   └── Ofor.java                         <- estrutura for
│   └── aula61_exercicios_iniciantes_parte4/
│       └── 02-exercicios4-estrutura-for.pdf
│
├── section_7/                                <- Outros tópicos básicos
│   ├── aula63_material_de_apoio/
│   │   └── 07-outros-topicos-basicos.pdf
│   ├── aula64_restricoes_convencoes_nomes/
│   │   └── Restricao.java
│   ├── aula65_operadores_bitwise/
│   │   └── OperadoresBitwise.java
│   ├── aula66_funcoes_string/
│   │   └── Funcao1.java
│   └── aula68_funcoes_sintaxe/
│       ├── funcao.java
│       └── funcao2.java
│
├── section_8/                                <- Classes, atributos, métodos, membros estáticos
│   ├── aula69_visao_geral_do_capitulo/
│   │   └── Aula69.java
│   ├── aula70_material_de_apoio/
│   │   ├── 03-classes-atributos-membros-staticos(para-anotacoes).pdf
│   │   └── 03-classes-atributos-membros-staticos-2.pdf
│   ├── aula71_problema_sem_orientacao_a_objetos/
│   │   └── aula71.java
│   ├── aula72_classe_com_tres_atributos_triangulo/
│   │   └── Triangle.java
│   ├── aula73_metodo_reaproveitamento_delegacao/
│   │   └── aula73.java
│   ├── aula74_segundo_problema_exemplo/
│   │   ├── Produto.java
│   │   └── Programa.java
│   ├── aula77_exercicios_de_fixacao/
│   │   ├── 03-correcao-exercicios-fixacao.pdf
│   │   ├── exercicio2.java
│   │   └── exercicio2_class.java
│   ├── aula78_membros_estaticos_parte1/
│   │   ├── Aula78.java
│   │   ├── calcular.java
│   │   └── comstatic/
│   │       ├── Aula78.java
│   │       └── calcular.java
│   └── aula79_membros_estaticos_parte2/
│       ├── Calcular.java
│       └── Exercicio2.java
│
└── section_9/                                <- Construtores, this, sobrecarga, encapsulamento
    ├── aula81_visao_geral_do_capitulo/
    ├── aula82_material_de_apoio/
    │   ├── 04-construtores-this-sobrecarga-encapsulamento(espaco-para-anotacoes).pdf
    │   └── 04-construtores-this-sobrecarga-encapsulamento-2.pdf
    ├── aula83_construtores/
    ├── aula84_palavra_this/
    ├── aula85_sobrecarga/
    ├── aula86_encapsulamento/
    ├── aula87_gerando_construtores_getters_setters/
    ├── aula88_modificadores_de_acesso/
    ├── aula89_exercicio_de_fixacao/
    ├── aula90_correcao_exercicio_parte1/
    └── aula91_correcao_exercicio_parte2/
```

Os arquivos compilados (`.class`) são gerados automaticamente em `bin/`, espelhando a mesma estrutura de `src/`.

## Como rodar

Projeto Java simples do VS Code (extensão _Extension Pack for Java_):

1. Abra a pasta no VS Code.
2. Abra o arquivo `.java` da aula e clique em **Run** acima do `main` (ou `F5` para depurar).

As configurações do projeto ficam em `.vscode/settings.json`.
