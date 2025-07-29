package homework.SamuelH.Java3;

       public class NeedForSpeed {
           public static void main(String[] args) {
           }
            protected final int speed;
            final int batteryDrain;
            private int distanceDriven;
            private int battery;

            public NeedForSpeed(int speed, int batteryDrain) {
                this.speed = speed;
                this.batteryDrain = batteryDrain;
                this.distanceDriven = 0;
                this.battery = 100;
            }

            public void drive() {
                if (!batteryDrained()) {
                    distanceDriven += speed;
                    battery -= batteryDrain;
                }
            }

            public int distanceDriven() {
                return distanceDriven;
            }

            public boolean batteryDrained() {
                return battery < batteryDrain;
            }

            public static NeedForSpeed nitro() {
                return new NeedForSpeed(50, 4);
            }
        }


