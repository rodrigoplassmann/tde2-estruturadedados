public class Trie {
    NoTrie raiz;

    public Trie(){
        this.raiz = new NoTrie();
    }

    public void inserir(String palavra){
        NoTrie atual = raiz;
        for(int i = 0; i < palavra.length(); i++){
            char c = palavra.charAt(i);
            int posicaoLetra = c - 'a';

            if(posicaoLetra >= 0 && posicaoLetra < 26){
                if(atual.filho[posicaoLetra] == null){
                    atual.filho[posicaoLetra] = new NoTrie();
                }
                atual = atual.filho[posicaoLetra];
            }
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

    public boolean prefixo(String prefixo) {
        NoTrie atual = raiz;
        for(int i = 0; i < prefixo.length(); i++){
            char c = prefixo.charAt(i);
            int indice = c - 'a';
            if (indice < 0 || indice >= 26) return false;
            if (atual.filho[indice] == null) return false;
            atual = atual.filho[indice];
        }
        return true;
    }
}
