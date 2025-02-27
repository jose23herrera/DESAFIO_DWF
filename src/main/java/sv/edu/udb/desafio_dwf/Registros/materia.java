package sv.edu.udb.desafio_dwf.Registros;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "materia")
public class materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;
}
