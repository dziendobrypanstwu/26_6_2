package com.example.awtSample;

import java.applet.Applet;
import java.awt.*;

public class CountNumberOfItems extends Applet{


        Choice language = null;

    public void init() {

        //create choice or combobox
        language = new Choice();

        //add items to the choice
        language.add("Java");
        language.add("C++");
        language.add("VB");
        language.add("Perl");

        //add choice or combobox
        add(language);
    }


    public void paint(Graphics g){

                /*
                 * To count number of items in a choice or a combobox, use
                 * int getItemCount() method of AWT Choice class.
                 */

        int items = language.getItemCount();
        g.drawString("There are " + items + " items in a combobox", 10, 70);
    }
}