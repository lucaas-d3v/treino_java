Treino Java

Este repositório reúne pequenos projetos e exercícios em Java para treinar conceitos básicos e intermediários da linguagem, incluindo manipulação de arrays, constantes, estruturas de repetição, classes, orientação a objetos e interação com o usuário.


---

Estrutura do repositório

```bash
lucaas-d3v-treino_java-9cad6c6/
├── ArraysArrayList/         # Exercícios com arrays e ArrayList
│   ├── Area.java            # Cálculo de área de figuras geométricas
│   ├── Buscas.java          # Busca linear em array
│   ├── CalculadoraIdade.java # Cálculo de idade baseado em ano de nascimento
│   ├── CalculadoraMedia.java # Cálculo de média de notas
│   ├── ContadorFor.java     # Contagem usando for
│   ├── ContadorPalavrasUnicas.java # Contagem de palavras únicas
│   ├── EntradaSaidaSimples.java   # Leitura e escrita no console
│   ├── NumeroMaior.java     # Encontra o maior número em um array
│   └── ...                  # Outros exercícios de manipulação de listas e arrays

├── treinoPoo/               # Projeto de orientação a objetos
│   └── src/
│       ├── ContaBancaria.java# Classe que representa uma conta bancária
│       ├── Verificador.java # Utilitário para validar CPF e senha
│       └── Main.java        # Classe principal com menu de operações bancárias
│       
├── .idea/                   # Configurações do IntelliJ IDEA
└── XML/                      # Arquivos de configuração de projeto
```

---

Como executar

1. Clone este repositório

```bash
git clone https://github.com/seu-usuario/lucaas-d3v-treino_java-9cad6c6.git
cd lucaas-d3v-treino_java-9cad6c6
```

2. Abra no IntelliJ IDEA

Selecione File -> Open e escolha a pasta raiz *lucaas-d3v-treino_java-9cad6c6.*

O IntelliJ deve detectar automaticamente os módulos.


3. Executar os exercícios

Para os arquivos em ArraysArrayList, abra cada classe (public static void main) e clique no ícone ▶️ para rodar.

Para o projeto OO em treinoPoo:

Abra Main.java em treinoPoo/src.

Execute com ▶️.

---

Conteúdos abordados

Arrays e ArrayList: inserção, busca, ordenação, contabilização.

Estruturas de repetição: for, while.

Estruturas de decisão: if, switch.

Entrada e saída: Scanner, System.out.

Orientação a objetos: classes, métodos, encapsulamento.

Validações: uso de utilitários para verificar formato de CPF e regras de senha.



---

Próximos passos sugeridos

Adicionar testes unitários com JUnit para funções de validação.

Modularizar o código usando pacotes (package arrays, package poo).

Criar um pom.xml para gerenciar dependências (Maven) e executar via mvn compile exec:java.

Evoluir o treinoPoo para persistir dados em arquivo ou banco de dados simples.



---

> Projeto criado por ~K' como parte do treinamento em Java. Feel free to contribute! 🚀
