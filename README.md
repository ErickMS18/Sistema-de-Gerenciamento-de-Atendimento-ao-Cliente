## Sistema de Gerenciamento de Atendimento ao Cliente

Este projeto implementa um sistema de gerenciamento de atendimento ao cliente utilizando estruturas de dados dinâmicas — uma **fila** para controle de atendimento e uma **pilha** para histórico de solicitações.

## Instituição
**PUCPR - Pontifícia Universidade Católica do Paraná**

## Disciplina
**Resolução de Problemas Estruturados em Computação**

## Professor
**Andrey Cabral Meira**

## Alunos
- Cecília Lucchesi Mardegan (usuário: [ceciLcchM](https://github.com/ceciLcchM))
- Christine von Schmalz (usuário: [cvschmalz](https://github.com/cvschmalz))
- Erick Maestri de Souza (usuário: [ErickMS18](https://github.com/ErickMS18))

---

## ⚙️ Estruturas Utilizadas

### 🧾 Fila de Atendimento (FIFO)
- Controla a **ordem de chegada dos clientes**.
- Cada cliente possui **ID, nome e motivo do atendimento**.
- O primeiro que entra é o primeiro a ser atendido.
- Implementada com **lista encadeada manual**, sem arrays ou coleções.

### 🗃️ Pilha de Histórico (LIFO)
- Armazena as **solicitações de serviço realizadas**.
- Cada solicitação tem **ID, descrição, data e hora**.
- O último item adicionado é o primeiro a ser removido.
- Também implementada com **lista encadeada**, simulando o empilhamento real.

---

## 🧩 Lógica do Sistema

1. O programa inicia com uma **fila de clientes** aguardando atendimento e um **histórico de solicitações** já realizadas.
2. O usuário interage por meio de um **menu textual**, podendo:
   - Visualizar a fila atual.
   - Atender o próximo cliente (removendo-o da fila).
   - Visualizar o histórico de solicitações (pilha).
   - Adicionar novas solicitações ao histórico.
3. A **fila** segue a lógica “**primeiro que chega, primeiro que sai**”.
4. A **pilha** segue a lógica “**último que entra, primeiro que sai**”.
5. Todas as operações são realizadas **manualmente**, criando e encadeando nós, sem estruturas automatizadas.

---

## 🧰 Recursos Implementados

- Inserção e remoção na **Fila** e na **Pilha**.
- Verificação se estão **vazias**.
- Impressão da **ordem de atendimento** e do **histórico**.
- Interação completa via **menu no terminal**.
- **Tratamento de erros** e mensagens explicativas para o usuário.

---

## 📄 Regras do Projeto

O trabalho foi desenvolvido **sem uso de funções automatizadas**.  
Apenas os seguintes recursos da linguagem foram utilizados:
- Tipos primitivos (`int`, `float`, `String`)
- Estruturas de decisão e repetição
- Entrada de dados (`Scanner`)
- Controle de exceções (`try-catch`)
- Operadores e manipulação manual de ponteiros (`Node`)

---

## 🚀 Execução

1. Compile o programa:
   ```bash
   javac SistemaAtendimento.java

2. Execute o sistema:
   ```bash
   java SistemaAtendimento
