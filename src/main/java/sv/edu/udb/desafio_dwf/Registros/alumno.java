package sv.edu.udb.desafio_dwf.Registros;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "alumno")
public class alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_materia", referencedColumnName = "id", nullable = true)
    private materia materia;
}
