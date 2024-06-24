package edu.wgu.d387_sample_code.translation;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

    Locale locale;

    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage(){
        ResourceBundle bundle = ResourceBundle.getBundle("language", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        //Used to troubleshoot english message not getting pulled. Found out in resource bundle that my locale was wrong.
        //Remade resource bundle with correct locale. language_en_USA.properties -> language_en_US.properties
        System.out.println( "Thread: " + getWelcomeMessage() + " ID: " + Thread.currentThread().getId() );
    }
}
