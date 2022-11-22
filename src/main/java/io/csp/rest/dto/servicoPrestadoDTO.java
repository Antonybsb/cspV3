package io.csp.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class servicoPrestadoDTO {
    private String descricao;
    private String preco;
    private String data;
    private Integer idCliente;

}
