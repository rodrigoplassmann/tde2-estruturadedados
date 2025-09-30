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

    public boolean busca(String palavra) {
        NoTrie atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            int indice = c - 'a';
            if (indice < 0 || indice >= 26) return false;
            if (atual.filho[indice] == null) return false;
            atual = atual.filho[indice];
        }
        return atual.fimDaPalavra;
    }

}
