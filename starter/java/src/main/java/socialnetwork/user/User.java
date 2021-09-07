package socialnetwork.user;

import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  private String name;

  private Map<Date, String> messages;

  private List timeLine;

  public User(String nameIn){
    this.name = nameIn;
  }



}
