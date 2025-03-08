package marceloviana1991.ata_de_reuniao.model;

import jakarta.persistence.*;
import marceloviana1991.ata_de_reuniao.dto.request.post.AtaRequestPostDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "atas")
@Entity(name = "AtaModel")
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

    public AtaModel() {}

    public Long getId() {
        return id;
    }

    public int getNumeroDaReuniao() {
        return numeroDaReuniao;
    }

    public LocalDate getData() {
        return data;
    }

    public int getQuantidadeDeParticipantes() {
        return quantidadeDeParticipantes;
    }

    public int getQuantidadeDeIngressos() {
        return quantidadeDeIngressos;
    }

    public int getQuantidadeDeVisitantes() {
        return quantidadeDeVisitantes;
    }

    public boolean isAberta() {
        return aberta;
    }

    public boolean isServico() {
        return servico;
    }

    public String getSecretario() {
        return secretario;
    }

    public String getTesoureiro() {
        return tesoureiro;
    }

    public String getRsg() {
        return rsg;
    }

    public String getRsgSuplente() {
        return rsgSuplente;
    }

    public BigDecimal getSetimaTradicao() {
        return setimaTradicao;
    }

    public BigDecimal getDespesas() {
        return despesas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtaModel ataModel = (AtaModel) o;
        return Objects.equals(id, ataModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
