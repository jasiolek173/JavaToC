package com.compailer.javatoc.entitiy;

public class Variable {

    public enum Type {SINGLE, ARRAY}

    private Type typeFactor = Type.SINGLE;
    private String type;
    private String name;
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Type getTypeFactor() {
        return typeFactor;
    }

    public void setTypeFactor(Type typeFactor) {
        this.typeFactor = typeFactor;
    }

    public Variable() {}
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Variable variable = (Variable) o;

        if (typeFactor != variable.typeFactor) return false;
        if (!type.equals(variable.type)) return false;
        //if (!name.equals(variable.name)) return false;
        return value != null ? value.equals(variable.value) : variable.value == null;
    }

    @Override
    public int hashCode() {
        int result = typeFactor.hashCode();
        result = 31 * result + type.hashCode();
        //result = 31 * result + name.hashCode();
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
