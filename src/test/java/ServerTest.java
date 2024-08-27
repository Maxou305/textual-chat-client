import org.example.ChatClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ServerTest {

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        ChatClient client = new ChatClient();
        client.startConnection("172.22.114.81", 6666);
        String response = client.sendMessage("hello server");
        Assertions.assertEquals("hello client", response);
    }
}
