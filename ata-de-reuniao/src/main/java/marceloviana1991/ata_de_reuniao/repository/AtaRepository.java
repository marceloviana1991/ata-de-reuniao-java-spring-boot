package marceloviana1991.ata_de_reuniao.repository;

import marceloviana1991.ata_de_reuniao.model.AtaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AtaRepository extends JpaRepository<AtaModel, Long> {
    List<AtaModel> findByDataBetween(LocalDate startDate, LocalDate endDate);
}
