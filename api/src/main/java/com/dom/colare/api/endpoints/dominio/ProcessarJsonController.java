package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.core.entidades.dominio.Dominio;
import com.dom.colare.core.entidades.dominio.TipoDominio;
import com.dom.colare.domain.services.TipoDominioService;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("${dominio.processar-json}")
public class ProcessarJsonController {

    @Autowired
    private TipoDominioService service;

    @GetMapping("/PAGED/{TABELA}")
    public Page<Dominio> paginado(Pageable pageable, @PathVariable("TABELA") String tabela) {
        return service.paginado(pageable, tabela);
    }

    @GetMapping("ALL/{tabela}/{status}")
    public List<Dominio> listar(@PathVariable("tabela") String tabela, @PathVariable("status") Boolean status) {
        return service.listar(tabela, status);
    }

    @PostMapping("/{tabela}")
    public ResponseEntity<TipoDominio> processarJson(@RequestParam("file") MultipartFile file,
                                                     @PathVariable("tabela") String tabela) throws Exception {

        if (file == null) {
            throw new RuntimeException("Nenhum arquivo enviado ou recebido.");
        }

        List<TipoDominio> tipoDominio = Arrays.asList(new JsonMapper().readValue(file.getInputStream(),TipoDominio[].class));

        if (!tabela.trim().equalsIgnoreCase(tipoDominio.get(0).getNomeTipoDominio().trim())) {
            throw new Exception("Arquivo de importação não corresponde com a tabela: " + tabela);
        }

        return new ResponseEntity<>(service.gravar(tipoDominio.get(0)), HttpStatus.OK);
    }

    @Data
    private static class tabela {
        private String title;
    }
}
