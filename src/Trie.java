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
}
