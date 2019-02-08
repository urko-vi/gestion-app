package com.urkovillanueva.gestion;

import com.urkovillanueva.gestion.gui.SwingApp;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;


@SpringBootApplication
public class GestionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(GestionApplication.class)
                .headless(false).run(args);

        SwingUtilities.invokeLater(() -> {
            SwingApp ex = ctx.getBean(SwingApp.class);
            ex.createAndShowGui();
        });
    }

}

