interface Engine {
    void startEngine();
}

interface MusicSystem {
    void playMusic();
}

class SmartCar implements Engine, MusicSystem {
    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        SmartCar car = new SmartCar();
        car.startEngine();
        car.playMusic();
    }
}
