# TesteArvoreBinaria

Arvore binaria é uma estrutura recursiva, o nó inicial é chamado de raiz
Todos os descendentes do nó raiz são considerados arvores (direita e esquerda)
Valores menores são jogados para a esquerda valores maiores são jogados para a direita
Nós descendentes da raiz são chamados de filhos, filhos sem descendencias são chamados de folhas

--

# Compilação:
javac *.java
java TesteArvore.java

--

# Resultado esperado:
Folha: 15 a esquerda de: 30
Folha: 45 a direita de: 30
Folha: 7 a esquerda de: 15
Folha: 19 a direita de: 15

--

# A recursão ocorre em :
this.esquerda.inserir(novo);
this.direita.inserir(novo);

O objeto Arvore contém referências para outras árvores:

private Arvore esquerda;
private Arvore direita;

Isso permite que um método da classe Arvore chame o mesmo método em suas subárvores

# ao executar: arvore.inserir(new Folha(7));

1st chamada: 7 é menor que a raiz 15, então se joga para a esquerda
2nd chamada: na esquerda ja existe o filho (15), 7 é menor que 15 então se joga para a esquerda denovo
cria-se uma nova arvore com valor 7:
      30
     /
   15
   /
  7

O método inserir() chama ele mesmo, mas em outro objeto da mesma classe Arvore

Cada chamada trabalha em uma parte menor da estrutura, até encontrar um caso simples em que o valor pode ser inserido

# A recursão termina quando um dos filhos é null (parada):

if (this.esquerda == null) {
    this.esquerda = novaArvore;
}

if (this.direita == null) {
    this.direita = novaArvore;
}
