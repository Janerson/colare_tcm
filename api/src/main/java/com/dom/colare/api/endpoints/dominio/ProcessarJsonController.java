package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.core.entidades.tcm.TipoDominio;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("${dominio.processar-json}")
public class ProcessarJsonController {

    @PostMapping("/file")
    public ResponseEntity<List<TipoDominio>> processarJson(@RequestParam("file") MultipartFile file) throws IOException {
        if (file == null) {
            throw new RuntimeException("Nenhum arquivo enviado ou recebido.");
        }

        List<TipoDominio> tipoDominio = Arrays.asList( new JsonMapper().readValue(file.getInputStream(), TipoDominio[].class));



        return new ResponseEntity<>(tipoDominio, HttpStatus.OK);
    }
}
