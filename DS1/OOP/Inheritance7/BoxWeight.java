package com.DS1.OOP.Inheritance7;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w); // THIS IS CALLING PARENT CLASS CONSTRUCTOR.
        // IF iT DOES NOT EXIST THEN IT WILL GIVE AN ERROR.
        this.weight = weight;

        // IF SUPER (L,H,W) IS DECLARED AFTER THIS.WEIGHT THEN IT WOULD GIVE ERROR.
        // CHILD CLASS CARES ABOUT WHAT PARENT CLASS HAS.
        // SO IT WOULD DECLARE THEM FIRST AND THEN ITS OWN.

    }

    BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        // THIS IS SAME AS BOX BOX = NEW BOXWEIGHT.
        // IT CHECKS WHETHER OTHER AS ACCESS TO L,W,H. IT DOES.

        this.weight = other.weight;
    }
}
