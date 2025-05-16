package br.com.vivo.converterBase64.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String text;

}
