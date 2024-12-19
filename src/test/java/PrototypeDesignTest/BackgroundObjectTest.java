package PrototypeDesignTest;

import PrototypeDesignPattern.BackGroundObject;
import PrototypeDesignPattern.BackgroundObjectRegistry;
import PrototypeDesignPattern.BackgroundType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackgroundObjectTest {
    @Test
    public void testClone(){
//        step3: create a prototype and clone it and modify it
        BackGroundObject prototype = new BackGroundObject(0.0,0.0,100.0,10.0, BackgroundType.TREE);
        BackGroundObject clone = prototype.cloneObject();

        Assertions.assertNotSame(prototype, clone);
        Assertions.assertEquals(prototype.getX(),clone.getX(),"both the object values should be same if clone is called");

//        modify the cloned object
        clone.setX(100.0);
        clone.setY(100.0);

    }

    @Test
    public void testRegistry(){
        // 1 create a prototype
        BackGroundObject prototype = new BackGroundObject(0.0,0.0,100.0,10.0, BackgroundType.TREE);
        // 2 add a prototype to the registry
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();
        registry.addPrototype(prototype);
        // 3 get the prototype

        BackGroundObject backGroundObject = registry.getPrototype(prototype.getType());
    }
}
