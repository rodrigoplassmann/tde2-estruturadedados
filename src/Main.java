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
            String resultado;

            if (achou) {
                resultado = "true";
            } else {
                resultado = "false";
            }

            System.out.println("busca(\"" + consultas[i] + "\") = " + resultado);
        }

        String[] prefixos = {"ca", "cab", "da", "zz"};
        for (int i = 0; i < prefixos.length; i++) {
            boolean tem = trie.prefixo(prefixos[i]);
            String resultado;

            if (tem) {
                resultado = "true";
            } else {
                resultado = "false";
            }

            System.out.println("prefixo(\"" + prefixos[i] + "\") = " + resultado);
        }

        boolean remDia = trie.remover("dia");
        String resRemDia;

        if (remDia) {
            resRemDia = "true";
        } else {
            resRemDia = "false";
        }

        System.out.println("remover(\"dia\") = " + resRemDia);

        boolean buscaDiaApos = trie.busca("dia");
        String resBuscaDiaApos;

        if (buscaDiaApos) {
            resBuscaDiaApos = "true";
        } else {
            resBuscaDiaApos = "false";
        }

        System.out.println("busca(\"dia\") apos remover = " + resBuscaDiaApos);

        boolean remCasa = trie.remover("casa");
        String resRemCasa;

        if (remCasa) {
            resRemCasa = "true";
        } else {
            resRemCasa = "false";
        }

        System.out.println("remover(\"casa\") = " + resRemCasa);

        boolean buscaCasaApos = trie.busca("casa");
        String resBuscaCasaApos;

        if (buscaCasaApos) {
            resBuscaCasaApos = "true";
        } else {
            resBuscaCasaApos = "false";
        }

        System.out.println("busca(\"casa\") apos remover = " + resBuscaCasaApos);

        boolean buscaCasoPermanece = trie.busca("caso");
        String resBuscaCasoPermanece;

        if (buscaCasoPermanece) {
            resBuscaCasoPermanece = "true";
        } else {
            resBuscaCasoPermanece = "false";
        }

        System.out.println("busca(\"caso\") permanece = " + resBuscaCasoPermanece);

        boolean remNada = trie.remover("nada");
        String resRemNada;

        if (remNada) {
            resRemNada = "true";
        } else {
            resRemNada = "false";
        }

        System.out.println("remover(\"nada\") -> nao existe = " + resRemNada);
    }
}
