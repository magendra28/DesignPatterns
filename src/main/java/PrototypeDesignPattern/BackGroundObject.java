package PrototypeDesignPattern;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


// step2: Implement the Cloneable Interface
@Setter
@Getter
@NoArgsConstructor
public class BackGroundObject implements GraphicalObject{

    private Double x;
    private Double y;
    private Double height;
    private Double width;
    private BackgroundType type;

    @Setter(AccessLevel.NONE) // this means do not create a setter
    private List<Double> pixels = new ArrayList<Double>();

    public BackGroundObject(Double x, Double y, Double height, Double width, BackgroundType type) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.type = type;
        this.pixels = generatePixels();
    }

    public BackGroundObject(BackGroundObject ref) {
        this.x = ref.x;
        this.y = ref.y;
        this.height = ref.height;
        this.width = ref.width;
        this.type = ref.type;
        this.pixels = generatePixels();
    }

    private List<Double> generatePixels() {
        return Collections.emptyList();
    }

    @Override
    public BackGroundObject cloneObject() {
        return new BackGroundObject(this);
    }

}
