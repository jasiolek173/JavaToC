package com.compailer.javatoc.entitiy;

import java.util.ArrayList;
import java.util.List;

public class Method {
    private String name;
    private Variable returnType;
    private List<Variable> variables = new ArrayList<>();

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variable getReturnType() {
        return returnType;
    }

    public void setReturnType(Variable returnType) {
        this.returnType = returnType;
    }

    public void addParameter(Variable variable) {
        variables.add(variable);
    }
}
