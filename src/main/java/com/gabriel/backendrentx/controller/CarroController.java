package com.gabriel.backendrentx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @PostMapping
    public ResponseEntity create() {
        return ResponseEntity.ok().body("Carro criado com sucesso!");
    }

}
