package com.dio.controleDeAcesso.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class NivelDeAcesso {
    @Id
    private long id;
    private String descricao;
}
