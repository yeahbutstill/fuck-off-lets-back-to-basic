package com.googlecode.projecttemplate.pos.dao;

import com.googlecode.projecttemplate.pos.model.Person;

public interface PersonDao {
    void save(Person p);
    void delete(Person p);
    Person getById(Long id);
}
