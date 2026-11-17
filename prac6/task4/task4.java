package prac6.task4;

import prac6.task2.Automobile;

// недоступен для изменений
class task4 {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;

    public task4() {
        acceleration = 30;
        brakingSpeed = 120;
    }

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}

class Texla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Texla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
    }

    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
        }
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
            if (speed < 0) {
                speed = 0;
            }
        }
    }
}

class ModelQ extends Texla {
    public ModelQ() {
        super();
        speed = 0;
        maxSpeed = 300;
        acceleration = 100;
        brakingSpeed = 120;
    }
}