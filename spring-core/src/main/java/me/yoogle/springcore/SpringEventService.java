package me.yoogle.springcore;

import org.springframework.stereotype.Service;

@Service
public class SpringEventService implements EventService {
    long begin = System.currentTimeMillis();

    @Override
    public void createEvent() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Create an event");
    }

    @Override
    public void publishEvent() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an event");
    }

}
