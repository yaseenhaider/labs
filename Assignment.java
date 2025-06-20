import java.util.ArrayList;

interface SmartDevice {
    String turnOn();
    String turnOff();
    String getStatus();
    String deviceInfo();
}


class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public String turnOn() {
        isOn = true;
        return "Smart Light is ON";
    }

    public String turnOff() {
        isOn = false;
        return "Smart Light is OFF";
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public String deviceInfo() {
        return "Smart Light";
    }
}

class SmartThermostat implements SmartDevice {
    private boolean isOn = false;

    public String turnOn() {
        isOn = true;
        return "Smart Thermostat is ON";
    }

    public String turnOff() {
        isOn = false;
        return "Smart Thermostat is OFF";
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public String deviceInfo() {
        return "Smart Thermostat";
    }
}


class SmartDoorLock implements SmartDevice {
    private boolean isLocked = true;

    public String turnOn() { // Unlock
        isLocked = false;
        return "Smart Door Lock is UNLOCKED";
    }

    public String turnOff() { // Lock
        isLocked = true;
        return "Smart Door Lock is LOCKED";
    }

    public String getStatus() {
        return isLocked ? "LOCKED" : "UNLOCKED";
    }

    public String deviceInfo() {
        return "Smart Door Lock";
    }
}


public class Assignment {
    public static void main(String[] args) {
        ArrayList<SmartDevice> devices = new ArrayList<>();

        devices.add(new SmartLight());
        devices.add(new SmartThermostat());
        devices.add(new SmartDoorLock());

        for (SmartDevice device : devices) {
            System.out.println(device.deviceInfo());
            System.out.println(device.turnOn());
            System.out.println("Status: " + device.getStatus());
            System.out.println(device.turnOff());
            System.out.println("Status: " + device.getStatus());
            System.out.println();
        }
    }
}
