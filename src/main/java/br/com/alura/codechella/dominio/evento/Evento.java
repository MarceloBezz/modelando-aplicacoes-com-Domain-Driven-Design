package br.com.alura.codechella.dominio.evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

public class Evento {
    private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        tipoIngressos.add(tipoIngresso);
    }
    
    public void aumentaNumeroDeIngressosPorTipo(TipoIngresso tipoIngresso, int quantidade) {
        // Implementar aqui
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

}
