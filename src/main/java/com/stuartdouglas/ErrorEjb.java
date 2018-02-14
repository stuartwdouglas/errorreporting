package com.stuartdouglas;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

@Stateless
public class ErrorEjb {

    @Resource(lookup = "java:global/NonExistant")
    public DataSource nonExistant;

    public void doStuff() {

    }

}
