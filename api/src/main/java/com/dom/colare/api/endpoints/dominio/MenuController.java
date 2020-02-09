package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.api.BaseController;
import com.dom.colare.data.repository.dominio.api.MenuRepository;
import com.dom.colare.domain.api.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${dominio.menu-link}")
public class MenuController extends BaseController<Menu, Long, MenuRepository> {

    private MenuRepository repository;

    public MenuController(MenuRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @GetMapping("/LISTAR-TODOS")
    public ResponseEntity<?> listarTodos(){
        return new ResponseEntity<>(repository.listarTodos(), HttpStatus.OK);
    }
}
