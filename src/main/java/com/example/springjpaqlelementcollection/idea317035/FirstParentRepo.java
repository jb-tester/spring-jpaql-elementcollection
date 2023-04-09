package com.example.springjpaqlelementcollection.idea317035;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FirstParentRepo extends CrudRepository<FirstParent,Integer> {

    @Query("from FirstParent fp where exists(select 1 from fp.children fpc where fpc like ?1)")
    List<FirstParent> query1(String arg);
    @Query("from FirstParent p where p.children[1] = ?1")
    List<FirstParent> query2(String arg);

}
