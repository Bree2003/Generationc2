package cl.securityApp.web.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Usuario> usuario;
}