package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela contacts
* @generated
*/
@Entity
@Table(name = "\"contacts\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.contacts")
public class contacts implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id_user", nullable = false, insertable=true, updatable=true)
        private java.lang.Double id_user;

    /**
    * @generated
    */
    @Column(name = "id", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String id;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone;

    /**
    * Construtor
    * @generated
    */
    public contacts(){
    }

    /**
    * Obtém id_user
    * return id_user
    * @generated
    */
    
    public java.lang.Double getId_user(){
        return this.id_user;
    }

    /**
    * Define id_user
    * @param id_user id_user
    * @generated
    */
    public contacts setId_user(java.lang.Double id_user){
        this.id_user = id_user;
        return this;
    }
    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public contacts setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public contacts setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    
    public java.lang.String getTelefone(){
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public contacts setTelefone(java.lang.String telefone){
        this.telefone = telefone;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
contacts object = (contacts)obj;
        if (id_user != null ? !id_user.equals(object.id_user) : object.id_user != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_user == null) ? 0 : id_user.hashCode());
        return result;
    }

}