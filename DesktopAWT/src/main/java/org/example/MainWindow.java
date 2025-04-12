package org.example;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends Frame {
    public MainWindow() throws HeadlessException{
        this.setBounds(200,200,400,300);
        this.setTitle("AWT - Abstract Window Toolkit");
        /*Button button;
        button = new Button("Button");
        button.setBounds(50,50,100,50);
        add(button);*/
        Label lblLastName = new Label("Last Name: ");
        Label lblFirstName = new Label("First Name: ");
        Label lblBirthDate = new Label("Birth Date: ");

        TextField textLastName = new TextField();
        TextField textFirstName = new TextField();
        TextField textBirthDate = new TextField();

        Button btnSubmit = new Button("Submit");
        Button btnReset = new Button("Reset");

        lblLastName.setBounds(10,50,100,32);
        lblFirstName.setBounds(10,100,100,32);
        lblBirthDate.setBounds(10,150,100,32);

        textLastName.setBounds(200,50,100,24);
        textFirstName.setBounds(200,100,100,24);
        textBirthDate.setBounds(200,150,100,24);

        btnSubmit.setBounds(10,200,100,50);
        btnReset.setBounds(200,200,100,50);

        this.add(lblLastName);
        this.add(lblFirstName);
        this.add(lblBirthDate);

        this.add(textLastName);
        this.add(textFirstName);
        this.add(textBirthDate);

        this.add(btnSubmit);
        this.add(btnReset);

        this.setLayout(null);
        this.setVisible(true);
    }
}
