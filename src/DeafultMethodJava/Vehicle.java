package DeafultMethodJava;

public interface Vehicle {

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }

    static String start() {
        return "Started.";
    }

}
