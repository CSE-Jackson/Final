//Jackson Williams
package main;

public class Bicycle {
    private String make;
    private Wheel frontWheel;
    private Wheel backWheel;
    private Frame frame;

    // Default Constructor
    public Bicycle() {
        this.make = "none"; // Default value
        this.frontWheel = new Wheel(); // Default Wheel
        this.backWheel = new Wheel();  // Default Wheel
        this.frame = new Frame();      // Default Frame
    }

    // Parameterized Constructor
    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        if (make != null && !make.trim().isEmpty()) {
            this.make = make;
        } else {
            this.make = "none";
        }

        this.frontWheel = frontWheel != null ? frontWheel : new Wheel();
        this.backWheel = backWheel != null ? backWheel : new Wheel();
        this.frame = frame != null ? frame : new Frame();
    }

    // Accessors
    public String getMake() {
        return make;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    // Mutators
    public void setMake(String make) {
        if (make != null && !make.trim().isEmpty()) {
            this.make = make;
        } else {
            this.make = "none";
        }
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel != null ? frontWheel : new Wheel();
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel != null ? backWheel : new Wheel();
    }

    public void setFrame(Frame frame) {
        this.frame = frame != null ? frame : new Frame();
    }

    // Equals Method
    public boolean equals(Bicycle other) {
        return this.make.equalsIgnoreCase(other.make) &&
               this.frontWheel.equals(other.frontWheel) &&
               this.backWheel.equals(other.backWheel) &&
               this.frame.equals(other.frame);
    }

    // ToString Method
    @Override
    public String toString() {
        return "[Bicycle] Make: " + make + 
               " Front Wheel: " + frontWheel + 
               " Back Wheel: " + backWheel + 
               " Frame: " + frame;
    }
}
