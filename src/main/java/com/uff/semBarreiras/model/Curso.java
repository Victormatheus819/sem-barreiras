package com.uff.semBarreiras.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "curso")
public class Curso implements Serializable {
    
    @Id
    @Column(name= "id")
    @GeneratedValue( strategy = GenerationType.IDENTITY )    
    private Integer id ;

    @Column(name= "nome")
    private String nome ;

    @Column(name= "descricao")
    private String descricao ;

    @Column(name= "hyperLink")
    private String hyperLink ;

    @Column(name= "preco")
    private Double preco ;

    @ManyToMany
    @JoinTable( name = "vaga_x_curso", joinColumns = @JoinColumn( name = "id_curso" ), inverseJoinColumns = @JoinColumn( name = "id_vaga" ) )
    private List<Vaga> vagas ;
}
