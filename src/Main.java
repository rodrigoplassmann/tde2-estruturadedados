public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        String[] inserir = {"casa", "caso", "cabo", "dado", "dia"};
        for (int i = 0; i < inserir.length; i++) {
            trie.inserir(inserir[i]);
        }
        System.out.println("Palavras inseridas: casa, caso, cabo, dado, dia");

        String[] consultas = {"casa", "cas", "cabra", "dado", "xyz", "dia"};
        for (int i = 0; i < consultas.length; i++) {
            boolean achou = trie.busca(consultas[i]);
            System.out.println("busca(\"" + consultas[i] + "\") = " + (achou ? "true" : "false"));
        }

        String[] prefixos = {"ca", "cab", "da", "zz"};
        for (int i = 0; i < prefixos.length; i++) {
            boolean tem = trie.prefixo(prefixos[i]);
            System.out.println("prefixo(\"" + prefixos[i] + "\") = " + (tem ? "true" : "false"));
        }

        boolean remDia = trie.remover("dia");
        System.out.println("remover(\"dia\") = " + (remDia ? "true" : "false"));
        System.out.println("busca(\"dia\") apos remover = " + (trie.busca("dia") ? "true" : "false"));

        boolean remCasa = trie.remover("casa");
        System.out.println("remover(\"casa\") = " + (remCasa ? "true" : "false"));
        System.out.println("busca(\"casa\") apos remover = " + (trie.busca("casa") ? "true" : "false"));
        System.out.println("busca(\"caso\") permanece = " + (trie.busca("caso") ? "true" : "false"));

        boolean remNada = trie.remover("nada");
        System.out.println("remover(\"nada\") (nao existe) = " + (remNada ? "true" : "false"));
    }
}
