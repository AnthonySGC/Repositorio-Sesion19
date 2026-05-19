package modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Estudiante")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long id;

    @Column(length = 100, nullable = false, name = "nombres_estudiante")
    private String nombres;

    @Column(length = 100, nullable = false, name = "apellidos_estudiante")
    private String apellidos;

    @Column(name = "CIF")
    private int CIF;

    @Column(length = 100, nullable = false, name = "correo_estudiante")
    private String correo;

    @Column(name = "edad")
    private int edad;

    @Column(length = 100, nullable = false, name = "carrera")
    private String carrera;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", nullable = false)
    private Ciudad ciudad;

}
