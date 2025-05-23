package homework.edinita.javaPart3.javaPart3_2and3.transport;


import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.CreareMotor;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Diesel;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Electric;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Hybrid;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAutobuz.MotorAutobuzDiesel;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAutobuz.MotorAutobuzElectric;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAutobuz.MotorAutobuzHybrid;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CreareMotor creareMotor0 = new CreareMotor(new MotorAutobuzElectric("DAC", "2020", new Electric()));
        CreareMotor creareMotor1 = new CreareMotor(new MotorAutobuzHybrid("Iveco", "2020", new Hybrid()));
        CreareMotor creareMotor2 = new CreareMotor(new MotorAutobuzDiesel("Ikarus", "2020", new Diesel()));
        CreareMotor creareMotor3 = new CreareMotor(new MotorAutobuzElectric("Mercedes", "2020", new Electric()));
        CreareMotor creareMotor4 = new CreareMotor(new MotorAutobuzDiesel("Isuzu", "2020", new Diesel()));
        CreareMotor creareMotor5 = new CreareMotor(new MotorAutobuzElectric("Solaris", "2020", new Electric()));

        System.out.println(creareMotor0.getMotor());
        System.out.println(creareMotor1.getMotor());
        System.out.println(creareMotor2.getMotor());
        System.out.println(creareMotor3.getMotor());
        System.out.println(creareMotor4.getMotor());
        System.out.println(creareMotor5.getMotor());

        List<CreareMotor> motoare = List.of(creareMotor0, creareMotor1, creareMotor2, creareMotor3, creareMotor4, creareMotor5);


        System.out.println("-------------------------------cu stream()--------------------------------------");


        motoare.stream().map(CreareMotor::getMotor).forEach(System.out::println);

        System.out.println("-------------------------------fara stream()--------------------------------------");

        for (CreareMotor motor : motoare) {
            System.out.println(motor.getMotor());
        }


    }
}
