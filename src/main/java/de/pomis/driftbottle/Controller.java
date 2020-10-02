package de.pomis.driftbottle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("messages")
    public List<Message> getMessages() {
        Map<String, String> getenv = System.getenv();
        getenv.entrySet().stream().forEach(System.out::println);

        List<Message> messageList = new ArrayList<>(3);
        messageList.add(new Message("Hallo, ich bin hier."));
        messageList.add(new Message("Hallo, wo bist du?"));
        messageList.add(new Message("Auf wiedersehen."));
        return messageList;
    }
}
