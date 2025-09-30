public class NoTrie {
    NoTrie[] filho;
    boolean fimDaPalavra;

    public NoTrie(){
        this.filho = new NoTrie[26];
        this.fimDaPalavra = false;
    }
}
