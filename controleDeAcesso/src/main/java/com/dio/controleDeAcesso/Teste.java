package com.dio.controleDeAcesso;

import com.dio.controleDeAcesso.model.JornadaTrabalho;

public class Teste {
    public static void main(String[] args) {
        JornadaTrabalho jornadaTrabalhoComBuilder=
                JornadaTrabalho.builder()
                    .id(20)
                    .descricao("mario").build();
        System.out.println(jornadaTrabalhoComBuilder);
    }
}
