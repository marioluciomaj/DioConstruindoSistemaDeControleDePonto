package com.dio.controleDeAcesso.model;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class Usuario {
        @Id
        private Long id;
        @ManyToOne
        private CategoriaUsuario categoriaUsuario;
        private String nome;
        @ManyToOne
        private Empresa empresa;
        @ManyToOne
        private NivelDeAcesso nivelDeAcesso;
        @ManyToOne
        private JornadaTrabalho jornadaTrabalho;
        private BigDecimal tolerancia;
        private LocalDateTime inicioJornada;
        private LocalDateTime finalJornada;

}
