package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {

    Map<BackgroundType,BackGroundObject> registry = new HashMap<BackgroundType,BackGroundObject>();
    public void addPrototype(BackGroundObject backGroundObject){
        registry.put(backGroundObject.getType(),backGroundObject);
    }

    public void removePrototype(BackgroundType type){
        registry.remove(type);
    }

    public BackGroundObject getPrototype(BackgroundType type){
        return registry.get(type);
    }
}
