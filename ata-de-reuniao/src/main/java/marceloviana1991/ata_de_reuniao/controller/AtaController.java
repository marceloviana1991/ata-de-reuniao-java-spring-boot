package marceloviana1991.ata_de_reuniao.controller;

import marceloviana1991.ata_de_reuniao.dto.request.post.AtaRequestPostDto;
import marceloviana1991.ata_de_reuniao.dto.response.AtaResponseDto;
import marceloviana1991.ata_de_reuniao.service.AtaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ata")
public class AtaController {

    @Autowired
    private AtaService ataService;

    @PostMapping
    public AtaResponseDto cadastrar(@RequestBody AtaRequestPostDto ataRequestPostDto) {
        return ataService.cadastrar(ataRequestPostDto);
    }

    @GetMapping
    public List<AtaResponseDto> listar() {
        return ataService.listar();
    }

    @GetMapping("/{mes}/{ano}")
    public List<AtaResponseDto> listarPorMesEAno(@PathVariable int mes, @PathVariable int ano) {
        return ataService.buscarPorMesEAno(mes, ano);
    }
}
