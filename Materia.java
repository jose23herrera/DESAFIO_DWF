package sv.edu.udb.desafio_dwf.Registros;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
