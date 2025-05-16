package br.com.vivo.converterBase64.api.rest.controller;


import br.com.vivo.converterBase64.core.port.out.ConverterPortOut;
import br.com.vivo.converterBase64.domain.RequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ConverterController {

    private final ConverterPortOut converterPortOut;

    @PostMapping("/convert")
    public ResponseEntity<String> convert(@RequestBody RequestDto request) {
        return ResponseEntity.ok(converterPortOut.convert(request));
    }
}
