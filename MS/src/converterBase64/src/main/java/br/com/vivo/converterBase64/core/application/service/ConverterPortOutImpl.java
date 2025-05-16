package br.com.vivo.converterBase64.core.application.service;

import br.com.vivo.converterBase64.core.port.out.ConverterPortOut;
import br.com.vivo.converterBase64.domain.RequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class ConverterPortOutImpl implements ConverterPortOut {

    @Override
    public String convert(RequestDto request) {
        byte[] bytes = Base64.getDecoder().decode(request.getText());

        String originalString = new String(bytes);

        return originalString;
    }

}