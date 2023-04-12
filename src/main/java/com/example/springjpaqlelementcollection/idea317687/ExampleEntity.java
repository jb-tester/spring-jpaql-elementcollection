package com.example.springjpaqlelementcollection.idea317687;


import jakarta.persistence.*;
//import javax.persistence.*;

import java.util.List;
import java.util.Map;

/**
 * Example entity.
 */
@Entity
public class ExampleEntity {
    private String id;
    private List<String> stringList;
    private Map<String, String> stringStringMap;

    @Id
    @Column
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ElementCollection
    @CollectionTable(
            name = "listCollectionTableName",
            foreignKey = @ForeignKey(name = "listForeignKeyName")
    )
    @Lob
    @Column
    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @ElementCollection
    @CollectionTable(
            name = "mapCollectionTableName",
            foreignKey = @ForeignKey(name = "mapForeignKeyName")
    )
    @Lob
    @Column
    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }
}
