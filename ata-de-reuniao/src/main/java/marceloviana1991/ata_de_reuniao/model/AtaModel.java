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
    private BigDecimal vendaDeLiteratura;
    private BigDecimal saldoAnterior;
    private BigDecimal aluguel;
    private BigDecimal manutencaoDaSala;
    private BigDecimal despesasComServidor;
    private BigDecimal compraDeLiteratura;
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
        this.vendaDeLiteratura = ataRequestPostDto.vendaDeLiteratura();
        this.saldoAnterior = ataRequestPostDto.saldoAnterior();
        this.aluguel = ataRequestPostDto.aluguel();
        this.manutencaoDaSala = ataRequestPostDto.manutencaoDaSala();
        this.despesasComServidor = ataRequestPostDto.despesasComServidor();
        this.compraDeLiteratura = ataRequestPostDto.compraDeLiteratura();
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

    public int getQuantidadeDeVisitantes() {
        return quantidadeDeVisitantes;
    }

    public int getQuantidadeDeIngressos() {
        return quantidadeDeIngressos;
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

    public String getRsgSuplente() {
        return rsgSuplente;
    }

    public String getRsg() {
        return rsg;
    }

    public BigDecimal getSetimaTradicao() {
        return setimaTradicao;
    }

    public BigDecimal getVendaDeLiteratura() {
        return vendaDeLiteratura;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public BigDecimal getAluguel() {
        return aluguel;
    }

    public BigDecimal getManutencaoDaSala() {
        return manutencaoDaSala;
    }

    public BigDecimal getDespesasComServidor() {
        return despesasComServidor;
    }

    public BigDecimal getCompraDeLiteratura() {
        return compraDeLiteratura;
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
