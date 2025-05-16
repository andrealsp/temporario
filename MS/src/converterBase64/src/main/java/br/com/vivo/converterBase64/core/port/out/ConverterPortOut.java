package br.com.vivo.converterBase64.core.port.out;


import br.com.vivo.converterBase64.domain.RequestDto;

public interface ConverterPortOut {

    String convert(RequestDto request);
}
