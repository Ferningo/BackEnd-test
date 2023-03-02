package org.generation.backendTest.model;


import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    long idEmpleado;

    @Column
    String nombre;

    @Column
    String apellido;

    @Column
    String puesto;

    @Column
    String fechaNacimiento;

    @Column
    long salario;


}
