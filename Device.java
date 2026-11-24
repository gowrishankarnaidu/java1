
class Device {
    String powerSource;

    void turnOn() {
        System.out.println("Device power on");
    }
}

class Mobile extends Device {
    double Screensize;

    void makecall() {
        System.out.println("Make a call");
    }
}

class Android extends Mobile {
    void openplaystore() {
        System.out.println("Open play store");
    }
}

class Iphone extends Mobile {
    void openappstore() {
        System.out.println("Open app store");
    }
}

public class Main {
    public static void main(String[] args) {

        Android a = new Android();

        a.powerSource = "battery";
        a.Screensize = 6.5;

        a.turnOn();
        a.makecall();
        a.openplaystore();

        Iphone i = new Iphone();

        i.powerSource = "battery";
        i.Screensize = 5.8;

        i.turnOn();
        i.makecall();
        i.openappstore();
    }
}
