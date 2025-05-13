package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class CreareMotor implements Motor{
    private Motor motor;

    public CreareMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
}
