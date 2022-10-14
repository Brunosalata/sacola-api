package me.dio.sacola.resource;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@RestController             // Essa anotação mostra para o Spring que essa classe contém os Endpoints
@RequestMapping("/ifood-devweek/sacola")             // Definir como serão escritos os Endpoints
@RequiredArgsConstructor            // sacolaService apresenta erro porque exige um construtor "this.sacolaService = sacolaService" essa anotação dispensa escrever esse comando
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping                    // Enviar informações ao banco de dados
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {     //quando a aplicação receber um requerimento @ RequestBody, ele vai pegar o ItemDto e jogar no método incluirItemNaSacola
        return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")            // Puxar informações do banco de dados
    public Sacola verSacola(@PathVariable("id") Long id) {
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")       // Atualização
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId, @RequestParam("formaPagamento") int formaPagamento) {
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
