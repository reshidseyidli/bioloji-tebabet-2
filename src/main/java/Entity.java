import lombok.Data;

import java.time.LocalDate;

@Data
public class Entity {

    private String BTKM;
    private String M0374;
    private LocalDate tarix = LocalDate.now();
    private String kimden;
    private String neUcun;
    private float mebleg;
}
