public class Trie {
    NoTrie raiz;

    public Trie(){
        this.raiz = new NoTrie();
    }

    public void inserir(String palavra){
        NoTrie atual = raiz;
        for(char c : palavra.toCharArray()){
            if(atual.filho[c - 'a'] == null){
                atual.filho[c - 'a'] = new NoTrie();
            }
            atual = atual.filho[c - 'a'];
        }
        atual.fimDaPalavra = true;
    }
}
