package com.urkovillanueva.gestion.gui;

import org.springframework.stereotype.Component;
import sun.plugin2.util.BrowserType;

import javax.swing.*;
import java.awt.event.ActionEvent;
@Component
public class SwingApp {
  //  private JPanel mainPanel;// this is what I'll add to contentPanel
    public SwingApp() {
  //      mainPanel = new JPanel();
//        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent event) ->  System.exit(0));

    //    mainPanel.add(quitButton);
    }
/*
    private JComponent getMainComponent() {
        return mainPanel;
    }
    */
    public void createAndShowGui() {

       // Browser browser = BrowserFactory.createBrowser(BrowserType.Mozilla);
        SwingApp app = new SwingApp();
        JFrame frame = new JFrame("App");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /*
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        frame.getContentPane().add(app.getMainComponent());
        frame.pack();
        frame.setLocationByPlatform(true);
        */
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
