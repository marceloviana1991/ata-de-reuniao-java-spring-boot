package marceloviana1991.ata_de_reuniao.dto.request.post;

import java.math.BigDecimal;

public record AtaRequestPostDto(
        int numeroDaReuniao,
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
}
