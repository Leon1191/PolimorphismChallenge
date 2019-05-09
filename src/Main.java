class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Engine was started");
    }

    public void accelerate() {
        System.out.println("The car was accelerated");
    }

    public void brake() {
        System.out.println("The car was brake");
    }

}
    class Porsh extends Car {
        public Porsh(String name, int cylinders) {
            super(name, cylinders);
        }

        public void startEngine() {
            System.out.println("Engine of Porsh was started");
        }

        public void accelerate() {
            System.out.println("Porsh was accelerated");
        }

        public void brake() {
            System.out.println("Porsh was brake");
        }

    }
        class BMW extends Car{
            public BMW(String name, int cylinders) {
                super(name, cylinders);
            }

            public void startEngine(){
                System.out.println("Engine of BMW was started");
            }
            public void  accelerate(){
                System.out.println("BMW was accelerated");

            }
        }



public class Main {

    public static void main(String[] args) {

Porsh porsh = new Porsh("911",8);
porsh.startEngine();
porsh.accelerate();
porsh.brake();

BMW bmw = new BMW("3", 4);
        bmw.startEngine();
bmw.accelerate();
bmw.brake();





    }
}
