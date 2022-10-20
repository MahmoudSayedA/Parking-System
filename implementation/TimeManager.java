import java.time.Duration;
import java.time.LocalDateTime;


public class TimeManager {
    public static LocalDateTime getDateTimeNow() {
        return LocalDateTime.now();
    }

    public static long calculateDuartion(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration.toHours();
    }
    

}
