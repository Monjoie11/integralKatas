package socialnetwork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import socialnetwork.user.User;


class MessageServiceIMPLTest {

  private User alice;

  @BeforeEach
  public void setUp(){
  alice = new User("Alice");
  }


  @Test
  public void testThatAliceExists(){
    Assertions.assertNotNull(alice);
  }

}
