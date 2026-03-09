package br.com.alura.codechella.dominio.evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento(Categoria categoria, String descricao, Endereco endereco, LocalDateTime data) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.endereco = endereco;
        this.data = data;

        gerarIdentificadorUnico();
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

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

    public UUID getUuid() {
        return uuid;
    }

}
