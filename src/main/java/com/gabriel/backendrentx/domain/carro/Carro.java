package com.gabriel.backendrentx.domain.carro;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "carros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String descricao;
    Boolean disponivel;
    String placaDoCarro;
    BigDecimal valorDaMulta;
    String marca;
    @ManyToOne(fetch = FetchType.LAZY)
    Categoria categoria;
    @ManyToOne(fetch = FetchType.LAZY)
    EspecificacoesCarro especificacoesCarro;
    @NotNull
    LocalDateTime dataCriacao;
    @NotBlank
    String urlDaImagem;


}
