package controller;

import model.ListaDinamica;

public class ListaController {
    private ListaDinamica lista;

    public ListaController() {
        lista = new ListaDinamica();
    }

    public void adicionarInicio(int valor) {
        lista.inserirInicio(valor);
    }

    public void adicionarFim(int valor) {
        lista.inserirFim(valor);
    }

    public boolean remover(int valor) {
        return lista.remover(valor);
    }

    public String exibirLista() {
        return lista.listar();
    }
}
