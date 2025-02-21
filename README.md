# Desafio de Sintaxe - Bootcamp Bradesco DIO

## 📌 Descrição
Este projeto faz parte do Bootcamp Bradesco na DIO e tem como objetivo exercitar os conceitos de sintaxe da linguagem Java. O programa simula a criação de uma conta bancária no terminal, solicitando informações do usuário e exibindo uma mensagem formatada ao final.

## 🛠 Tecnologias Utilizadas
- Java 8+
- Classe `Scanner` para entrada de dados
- Tratamento de exceções com `try-catch`
- Classe `NumberFormat` para formatação de valores monetários
- Concatenação de strings com o método `.concat()`

## 🚀 Funcionalidades
✅ Solicitação dos seguintes dados ao usuário via terminal:
  - Número da conta (inteiro, com validação)
  - Agência (texto)
  - Nome do cliente (texto)
  - Saldo (decimal, formatado como moeda)
✅ Exibição de uma mensagem personalizada com os dados inseridos
✅ Tratamento de erro para garantir que o número da conta seja um valor válido
✅ Formatação do saldo conforme a moeda do sistema

## 📌 Exemplo de Execução
```
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite seu Nome:
MARIO ANDRADE
Por favor, digite seu Saldo:
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 237,48 já está disponível para saque.
```

## 📜 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/repositorio.git
   ```
2. Compile o código Java:
   ```bash
   javac ContaTerminal.java
   ```
3. Execute o programa:
   ```bash
   java ContaTerminal
   ```

## 📌 Autor
Desafio realizado como parte do **Bootcamp Bradesco - DIO**.

---
📌 Projeto para fins educacionais.

