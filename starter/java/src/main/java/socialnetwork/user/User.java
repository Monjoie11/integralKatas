package socialnetwork.user;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  //Users will have a string name,
  // a map of string messages with Calender.GetInstance (Date) as key
  //A timeline that will list string messages loaded in order

  private String name;

  private Map<Date, String> messages = new HashMap<>();

  private List<String> timeLine;

  public User(String nameIn){
    this.name = nameIn;
  }

  public boolean publish(String message){
    messages.put(Calendar.getInstance().getTime(), message);
    return true;
  }

  public List<String> refreshTimeLine(){
    this.timeLine = new ArrayList<String>(messages.values());
    return this.timeLine;
  }

}
