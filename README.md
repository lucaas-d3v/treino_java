# Repositório de Exercícios Java

Olá! Este repositório reúne meus arquivos de exercícios em Java, usados para treinar sintaxe e lógica básicos.  
Os exercícios estão divididos em dois grupos:

1. **Exercícios de Entrada e Saída / Estruturas de Repetição**  
2. **Exercícios com Arrays e ArrayList**

---

## 📁 Estrutura do Repositório

```markdown
├── EntradaSaida/
  |   #arquivos aqui
└── ArraysArrayList/
  |   #arquivos aqui
```
---

## ⚙️ Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado
- Variável de ambiente `JAVA_HOME` configurada (opcional, mas recomendado)

---

## 🛠️ Como Compilar

1. Abra o terminal na raiz do repositório.
2. Para compilar **todos** os arquivos de uma vez:

```bash
javac EntradaSaida/*.java ArraysArrayList/*.java
```

3. Ou compile um arquivo específico:

```bash
javac EntradaSaida/SomaDoisNumeros.java
```

---

## ▶️ Como Executar

Depois de compilado, execute cada classe pelo nome. Exemplo:

```bash
# Exemplo 1: soma dois números
java EntradaSaida.SomaDoisNumeros

# Exemplo 2: lista de tarefas
java ArraysArrayList.ListaTarefas
```

> **Observação:** Se você não criou pacotes, pode rodar direto da raiz:
>
> ```bash
> java SomaDoisNumeros
> ```

---

## 📋 Descrição dos Exercícios

### 1. Entrada e Saída / Repetição

* **EntradaSaidaSimples.java**
  Demonstra uso de `Scanner` para ler dados do usuário e exibir mensagens.

* **SomaDoisNumeros.java**
  Lê dois números inteiros e imprime a soma.

* **ParOuImpar.java**
  Verifica se um número informado é par ou ímpar.

* **CalculadoraMedia.java**
  Calcula a média de uma sequência de notas/números informados.

* **ContadorFor.java**
  Exemplo de laço `for` para contar de 1 até N.

* **TabuadaWhile.java**
  Gera a tabuada de um número usando `while`.

* **ValidacaoSenha.java**
  Valida se a senha informada atende a certos critérios (por exemplo, tamanho mínimo).

* **NumeroMaior.java**
  Compara dois números e exibe qual é o maior.

* **CalculadoraIdade.java**
  Calcula a idade aproximada a partir do ano de nascimento informado.

* **NumeroPrimo.java**
  Verifica se um número é primo.

### 2. Arrays e ArrayList

* **CadastroNomes.java**
  Armazena e exibe uma lista de nomes em um array.

* **MediaNotas.java**
  Calcula a média das notas armazenadas em um array.

* **CopiaArrays.java**
  Mostra como copiar conteúdos de um array para outro.

* **BuscaArrayList.java**
  Exemplo de pesquisa de elemento em um `ArrayList<String>`.

* **RemocaoItens.java**
  Remove itens de um `ArrayList` por índice ou valor.

* **ListaTarefas.java**
  App simples de terminal para adicionar, remover e listar tarefas usando `ArrayList`.

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Boa prática e bons estudos.

```
