package anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    public void start(int interval, boolean beep) {
        // using anonymous class

//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("At the tone, time is " + new Date());
//                if(beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };
//        Timer t = new Timer(interval, listener);
//        t.start();

        // using lambda
        Timer t = new Timer(interval, event ->
        {
            System.out.println("At the tone, time is " + new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        });
        t.start();

    }
}