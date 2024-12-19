package PrototypeDesignPattern;

// step1: create a cloneable interface which has clone method
@FunctionalInterface
public interface GraphicalObject {
    GraphicalObject cloneObject();
}
