package cl.toro.integration.ms_toro_bff.model.dto;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@RestController
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Products {


    private int id;
    private String name;
    private String descripctio;
    private int price;

    
}
