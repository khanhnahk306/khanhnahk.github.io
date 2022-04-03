package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Transaction {
    private String id;
    private String user_id;
    private String content;
    private Date date;
    private String account;
    private int money;

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", account='" + account + '\'' +
                ", money=" + money;
    }
}
