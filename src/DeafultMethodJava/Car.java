package DeafultMethodJava;

public class Car implements Vehicle,Alarm{

    public static void main(String[] args) {
        Vehicle.start();
    }
    @Override
    public String stopAlarm() {
        return "stop alarm";
    }

    @Override
    public String slowDown() {
        return "Slow Down";
    }

    @Override
    public String turnAlarmOn() {
        return Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Vehicle.super.turnAlarmOff();
    }
}
