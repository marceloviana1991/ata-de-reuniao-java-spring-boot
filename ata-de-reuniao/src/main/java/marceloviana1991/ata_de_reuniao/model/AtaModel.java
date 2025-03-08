package marceloviana1991.ata_de_reuniao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import marceloviana1991.ata_de_reuniao.dto.request.post.AtaRequestPostDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "atas")
@Entity(name = "AtaModel")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AtaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroDaReuniao;
    private LocalDate data;
    private int quantidadeDeParticipantes;
    private int quantidadeDeIngressos;
    private int quantidadeDeVisitantes;
    private boolean aberta;
    private boolean servico;
    private String secretario;
    private String tesoureiro;
    private String rsg;
    private String rsgSuplente;
    private BigDecimal setimaTradicao;
    private BigDecimal despesas;
    private String observacoes;


    public AtaModel(AtaRequestPostDto ataRequestPostDto) {
        this.numeroDaReuniao = ataRequestPostDto.numeroDaReuniao();
        this.data = LocalDate.now();
        this.quantidadeDeParticipantes = ataRequestPostDto.quantidadeDeParticipantes();
        this.quantidadeDeIngressos = ataRequestPostDto.quantidadeDeIngressos();
        this.quantidadeDeVisitantes = ataRequestPostDto.quantidadeDeVisitantes();
        this.aberta = ataRequestPostDto.aberta();
        this.servico = ataRequestPostDto.servico();
        this.secretario = ataRequestPostDto.secretario();
        this.tesoureiro = ataRequestPostDto.tesoureiro();
        this.rsg = ataRequestPostDto.rsg();
        this.rsgSuplente = ataRequestPostDto.rsgSuplente();
        this.setimaTradicao = ataRequestPostDto.setimaTradicao();
        this.despesas = ataRequestPostDto.despesas();
        this.observacoes = ataRequestPostDto.observacoes();
    }
}
