package sv.edu.udb.desafio_dwf.Registros;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;
}