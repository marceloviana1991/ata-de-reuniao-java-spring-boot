package marceloviana1991.ata_de_reuniao.dto.response;

import marceloviana1991.ata_de_reuniao.model.AtaModel;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AtaResponseDto(
        Long id,
        int numeroDaReuniao,
        LocalDate data,
        int quantidadeDeParticipantes,
        int quantidadeDeIngressos,
        int quantidadeDeVisitantes,
        boolean aberta,
        boolean servico,
        String secretario,
        String tesoureiro,
        String rsg,
        String rsgSuplente,
        BigDecimal setimaTradicao,
        BigDecimal vendaDeLiteratura,
        BigDecimal saldoAnterior,
        BigDecimal aluguel,
        BigDecimal manutencaoDaSala,
        BigDecimal despesasComServidor,
        BigDecimal compraDeLiteratura,
        String observacoes
) {
    public AtaResponseDto(AtaModel ataModel) {
        this(
                ataModel.getId(),
                ataModel.getNumeroDaReuniao(),
                ataModel.getData(),
                ataModel.getQuantidadeDeParticipantes(),
                ataModel.getQuantidadeDeIngressos(),
                ataModel.getQuantidadeDeVisitantes(),
                ataModel.isAberta(),
                ataModel.isServico(),
                ataModel.getSecretario(),
                ataModel.getTesoureiro(),
                ataModel.getRsg(),
                ataModel.getRsgSuplente(),
                ataModel.getSetimaTradicao(),
                ataModel.getVendaDeLiteratura(),
                ataModel.getSaldoAnterior(),
                ataModel.getAluguel(),
                ataModel.getManutencaoDaSala(),
                ataModel.getDespesasComServidor(),
                ataModel.getCompraDeLiteratura(),
                ataModel.getObservacoes()
        );
    }
}
