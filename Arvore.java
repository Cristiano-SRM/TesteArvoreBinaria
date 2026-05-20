public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() { //arvore vazia
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha) { //arvore criada a partir de uma folha
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty() { //verifica se é vazia
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if(isEmpty()) {
            this.folha = novo; //se estiver vazia cria-se raiz
        } else { // caso nao esteja vazia e tenha uma raiz, cria-se uma nova arvore
          Arvore novaArvore = new Arvore(novo);
          if(novo.getValor() < this.folha.getValor()) { //se sim, manipula o lado esquerdo, valor menor
             if (this.esquerda == null) { 
                 this.esquerda = novaArvore; //se lado esquerdo nao construdo ainda, recebe essa arvore
                 System.out.println("Folha: " + novo.getValor() + " a esquerda de: "+this.folha.getValor());
             } else {
                this.esquerda.inserir(novo);
             }
          } else if (novo.getValor() > this.folha.getValor()) {
                 if (this.direita == null) {
                    this.direita = novaArvore; //se lado esquerdo nao construdo ainda, recebe essa arvore
                    System.out.println("Folha: " + novo.getValor() + " a direita de: "+this.folha.getValor());
                 } else {
                    this.direita.inserir(novo);
                 }
          }
        }
    }
}