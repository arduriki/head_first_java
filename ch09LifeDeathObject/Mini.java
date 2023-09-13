package ch09LifeDeathObject;

import java.awt.Color;

public class Mini extends Car {
    private Color color;
    
    public Mini() {
        // no-arg constructor
        // invokes another constructor within the same class usint this()
        this(Color.RED);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
        // more initialization
    }
}
