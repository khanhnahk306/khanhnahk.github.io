package com.example.javafx_login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField tf_user;
    public TextField tf_pass;
    public Button bt_login;
    public Label lb_rs;

    public void onLogin(ActionEvent actionEvent) {
        String str1 = "khanhnahk";
        String str2 = "123456";

        String user = tf_user.getText();
        String pass = tf_pass.getText();

        if (str1.equals(user) && str2.equals(pass)){
            lb_rs.setText("Đăng nhập thành công");
        }else {
            lb_rs.setText("Tên đăng nhập hoặc mật khẩu không đúng");
        }
    }
}