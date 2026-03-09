package br.com.alura.codechella.aplicacao.evento;

import br.com.alura.codechella.dominio.evento.Endereco;
import br.com.alura.codechella.dominio.evento.Evento;

public interface RepositorioEvento {
    Evento buscarEventoPorCidade(Endereco endereco);
}
