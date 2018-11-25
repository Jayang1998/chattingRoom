package view;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    //登陆界面中的组件

    public Login(){
        this.setLayout(new BorderLayout());

        this.setSize(new Dimension(300, 230));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
