package com.example.exampleprojectdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypBean {

    public PrototypBean() {
        System.out.println("Creating Protyp und so ...");
    }
    public String getMyScope(){
        return "Im a proto";
    }
}
