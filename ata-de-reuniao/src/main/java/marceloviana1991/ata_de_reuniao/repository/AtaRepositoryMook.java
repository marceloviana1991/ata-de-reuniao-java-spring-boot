package marceloviana1991.ata_de_reuniao.repository;

import marceloviana1991.ata_de_reuniao.model.AtaModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AtaRepositoryMook {

    private List<AtaModel> ataModelList = new ArrayList<>();

    public void cadastrar(AtaModel ataModel) {
        ataModelList.add(ataModel);
    }

    public List<AtaModel> listar() {
        return ataModelList;
    }

}
