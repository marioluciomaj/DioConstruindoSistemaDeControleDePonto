package com.dio.controleDeAcesso.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Data
@Builder
@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
