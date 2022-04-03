package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {
    private String id_user;
    private String phoneNumber;
    private String password;
    private String account;
    private int balance;

    @Override
    public String toString() {
        return "id_user='" + id_user + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", balance=" + balance;
    }
}
