package Module3_String;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {
        // Get the current system time
        Date now = new Date();
        
        // Format the time
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        
        // Display the system time
        System.out.println("Current System Time: " + formatter.format(now));
    }
}

