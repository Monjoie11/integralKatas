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
  public void testThatUserExists(){
    Assertions.assertNotNull(alice);
  }

  @Test
  public void testUsertalks_givenNotNull(){
    alice.publish("I love the weather today.");
    Assertions.assertNotNull(alice.getMessages());
  }

  @Test
  public void testUserSeesTimeline_givenNotNull(){
    alice.publish("I love the weather today.");
    alice.refreshTimeLine();
    Assertions.assertNotNull(alice.getTimeLine());
  }

  @Test
  public void testUserSeesLastPost_givenNotNull(){
    alice.publish("I love the weather today.");
    alice.refreshTimeLine();
    Assertions.assertEquals("I love the weather today.", alice.getTimeLine().get(0));
  }





}
