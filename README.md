# Estudos de Java

Repositório com os exercícios e materiais do curso **Java COMPLETO** (Java e OO, UML, JDBC, JavaFX e mais), do professor **Nelio Alves** ([educandoweb.com.br](http://educandoweb.com.br)).

<img width="800" height="470" alt="image" src="https://github.com/user-attachments/assets/97212060-274a-4461-b551-04ff0c170f31" />


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
└── section_7/                                <- Outros tópicos básicos
    └── aula63_material_de_apoio/
        └── 07-outros-topicos-basicos.pdf
```

Os arquivos compilados (`.class`) são gerados automaticamente em `bin/`, espelhando a mesma estrutura de `src/`.

## Como rodar

<<<<<<< HEAD
Projeto Java simples do VS Code (extensão _Extension Pack for Java_):
=======
Projeto Java simples do VS Code (extensão *Extension Pack for Java*):
>>>>>>> e10b541bf1b3854f00fed329bf8cbd9aabf2ea41

1. Abra a pasta no VS Code.
2. Abra o arquivo `.java` da aula e clique em **Run** acima do `main` (ou `F5` para depurar).

As configurações do projeto ficam em `.vscode/settings.json`.
<<<<<<< HEAD
=======

>>>>>>> e10b541bf1b3854f00fed329bf8cbd9aabf2ea41
