package DeafultMethodJava;

public interface Alarm {

    String stopAlarm();

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
