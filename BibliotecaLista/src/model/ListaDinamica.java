package model;

public class ListaDinamica {
    private No primeiro;

    public ListaDinamica() {
        this.primeiro = null;
    }

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void inserirFim(int valor) {
        No novo = new No(valor);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public boolean remover(int valor) {
        if (primeiro == null) return false;

        if (primeiro.getValor() == valor) {
            primeiro = primeiro.getProximo();
            return true;
        }

        No anterior = primeiro;
        No atual = primeiro.getProximo();

        while (atual != null) {
            if (atual.getValor() == valor) {
                anterior.setProximo(atual.getProximo());
                return true;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        return false;
    }

    public String listar() {
        StringBuilder sb = new StringBuilder();
        No atual = primeiro;
        while (atual != null) {
            sb.append(atual.getValor()).append(" -> ");
            atual = atual.getProximo();
        }
        sb.append("null");
        return sb.toString();
    }
}
