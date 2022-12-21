package lab06.task13;

import java.util.*;

public class EventManager {
    Map<String, ArrayList<StringListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<StringListener>());
        }
    }

    public void subscribe(String eventType, StringListener listener) {
        List<StringListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, StringListener listener) {
        List<StringListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<StringListener> users = listeners.get(eventType);
        for (StringListener ItListener : users) {
            ItListener.update(eventType);
        }
    }


}
