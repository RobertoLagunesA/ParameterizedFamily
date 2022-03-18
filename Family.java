package com.company;

public class Family<T> {
    private T father;
    private T mother;
    private T[] children;

    public Family(T father, T mother, T[] children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public String getFather() {
        return father.toString();    }

    public String getMother() {
        return mother.toString();
    }

    public String getChild(int index) {
        return children[index].toString();
    }
}


