import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.layout.Pane;

public class CustomClockPane extends Pane {
     private int hour;
     private int minute;
     private int second;
     private boolean hourHandVisible = true;
     private boolean minuteHandVisible = true;
     private boolean secondHandVisible = true;

     public CustomClockPane() {
          setTime();
     }

     public CustomClockPane(int hour, int minute, int second) {
          this.hour = hour;
          this.minute = minute;
          this.second = second;
          render();
     }

     public void setTime() {
          Calendar calendar = new GregorianCalendar();

          this.hour = calendar.get(Calendar.HOUR_OF_DAY);
          this.minute = calendar.get(Calendar.MINUTE);
          this.second = calendar.get(Calendar.SECOND);
          render();
     }

     public void render() {
          
     }
}
