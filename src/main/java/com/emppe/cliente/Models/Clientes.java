package com.emppe.cliente.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Clientes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome não pode ser nulo")
    @Column(length = 100, nullable = false)
    private String nome;

    @NotBlank(message = "Sobrenome não pode ser nulo")
    @Column(length = 100, nullable = false)
    private String sobrenome;

    @NotBlank(message = "Documento não pode ser nulo")
    @Column(length = 14, nullable = false)
    private String documento;

    @DateTimeFormat(iso = ISO.DATE)
    @NotNull(message = "A data de nascimento não pode ser nula")
    private LocalDate dataNascimento;

    @NotBlank(message = "Email não pode ser nulo")
    @Column(length = 100, nullable = false)
    private String email;

    
    @NotBlank(message = "Telefone não pode ser nulo")
    @Column(length = 11, nullable = false)
    private String telefone;

    public Clientes(){

    };

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getDocumento() {
        return documento;
    }
    public String getEmail() {
        return email;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getTelefone() {
        return telefone;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
          if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes c = (Clientes) o;
        return id != null && id.equals(c.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() + " " + getSobrenome() + " Email: " + getEmail() + " Data de Nascimento: " + getDataNascimento() + " Telefone: " + getTelefone() + " Documento: " + getDocumento(); 
    }

}
