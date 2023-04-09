package com.example.springjpaqlelementcollection.idea120966;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.LinkedList;

@Entity
@NamedQuery(name = "Application.findByDatabaseName",
        query = "SELECT DISTINCT a FROM SecondParent a, IN(a.childs) b WHERE b.name = :name")
@Table(name = "SECONDPARENT")
public class SecondParent {
    private int id;

    @Id
    @Column(name = "ID_PARENT", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @ElementCollection(targetClass = Childs.class, fetch = FetchType.EAGER)
    @CollectionTable(name="SECONDCHILD", joinColumns = @JoinColumn(name = "ID_PARENT_CH"))
    private Collection childs = new LinkedList();



}