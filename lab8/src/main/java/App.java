/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
import java.lang.Character;

public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += count + "\n";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if (ch.length() == 1)
        {
            if (Character.isDigit(ch.charAt(0)))
            {
                if (count < 23)
                {
                    count++;
                    screen.key(ch, count);
                }
            }
            else if (ch.equalsIgnoreCase("X"))
            {
                if (count > 0)
                {
                    count--;
                    screen.key(ch, count);
                }
            }
        }
    }
}

