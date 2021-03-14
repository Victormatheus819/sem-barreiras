/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.semBarreiras.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author victo
 */
@Entity
@Data
@Table(name= "escolaridade")
public class Escolaridade implements Serializable {
@Id
@Column(name= "id")
@GeneratedValue( strategy = GenerationType.IDENTITY ) 
private Integer id ;         
@Column(name= "descricao")
private String descricao ;
@Column(name= "grau")
private Integer grau ;


}
