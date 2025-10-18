## Sistema de Gerenciamento de Atendimento ao Cliente

Disciplina: Resolução de Problemas de Natureza Discreta

Professor: Andrey Cabral Meira

Alunos: 

- Cecília Lucchesi Mardegan (usuário: [ceciLcchM](https://github.com/ceciLcchM))
- Christine von Schmalz (usuário: [cvschmalz](https://github.com/cvschmalz))
- Erick Maestri de Souza (usuário: [ErickMS18](https://github.com/ErickMS18))

## Descrição do projeto

Este projeto implementa um sistema de gerenciamento de atendimento ao cliente utilizando uma fila para controle de atendimento e uma pilha para histórico de solicitações.

## Estruturas

### Node.java

Um nó na pilha ou lista, que armazena um objeto do tipo `Elemento` e um ponteiro para o próximo nó.

### Elemento.java

Armazena informações sobre atendimentos ou solicitações em três variáveis do tipo `String`.

- `id` é sempre usado como um identificador;
- `descricao` é usado para o nome do cliente, ou a descrição da solicitação;
- `info` é usado como motivo do atentimento para clientes, ou data-hora para solicitações.

### Fila

Uma implementação de fila. Guarda ponteiros para os nós no início e fim da fila, e contém os seguintes métodos:

- `insere`: insere um elemento no fim da fila
- `remove`: remove um elemento no começo da fila
- `imprime`: exibe a fila em ordem de início para fim
- `estaVazia`: verifica se a fila está vazia
- `popularFila`: adiciona elementos à fila, levando como parâmetro uma lista de elementos 

### Pilha

Uma implementação de pilha. Guarda apenas um ponteiro para o nó no topo da pilha, e contém os seguintes métodos:

- `insere`: insere um elemento no topo da pilha
- `remove`: remove um elemento do topo da pilha
- `imprime`: exibe a pilha em ordem de cima para baixo
- `estaVazia`: verifica se a pilha está vazia
- `popularFila`: adiciona elementos à pilha, levando como parâmetro uma lista de elementos

### Main

Contém a interface de interação com o usuário e o loop principal do programa. Primeiro a fila de atendimento e a pilha de histórico de solicitações são populadas com vetores de elementos. Então, começa o loop onde o usuário pode escolher realizar alguma ação sobre as estruturas.

O usuário pode escolher:

- Adicionar cliente à fila
- Atender próximo cliente
- Remover última solicitação
- Exibir fila de atendimento
- Exibir histórico de solicitações
- Sair
