package marceloviana1991.ata_de_reuniao.service;

import marceloviana1991.ata_de_reuniao.dto.request.post.AtaRequestPostDto;
import marceloviana1991.ata_de_reuniao.dto.response.AtaResponseDto;
import marceloviana1991.ata_de_reuniao.model.AtaModel;
import marceloviana1991.ata_de_reuniao.repository.AtaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public class AtaService {

    @Autowired
    private AtaRepository ataRepository;

    @Transactional
    public AtaResponseDto cadastrar(AtaRequestPostDto ataRequestPostDto) {
        AtaModel ataModel = new AtaModel(ataRequestPostDto);
        ataRepository.save(ataModel);
        return new AtaResponseDto(ataModel);
    }

    public List<AtaResponseDto> listar() {
        return ataRepository.findAll().stream().map(AtaResponseDto::new).toList();
    }

    public List<AtaResponseDto> buscarPorMesEAno(int mes, int ano) {
        YearMonth yearMonth = YearMonth.of(ano, mes);
        LocalDate startDate = yearMonth.atDay(1); // Primeiro dia do mês
        LocalDate endDate = yearMonth.atEndOfMonth(); // Último dia do mês
        return ataRepository.findByDataBetween(startDate, endDate).stream().map(AtaResponseDto::new).toList();
    }

    public AtaResponseDto detalhar(Long id) {
        return new AtaResponseDto(ataRepository.getReferenceById(id));
    }
}
