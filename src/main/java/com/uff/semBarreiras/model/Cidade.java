/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.semBarreiras.model;

/**
 *
 * @author victo
 */
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;
@Entity
@Data
@Table(name= "cidade")
public class Cidade {
 
 @Id
 @Column(name= "nome")
 @GeneratedValue( strategy = GenerationType.IDENTITY )
 private  Integer id;
 @Column(name= "nome")
 private  String nome;
 private  Estado estado;
    
}
