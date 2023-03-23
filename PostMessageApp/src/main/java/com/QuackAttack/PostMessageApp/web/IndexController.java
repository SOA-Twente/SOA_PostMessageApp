package com.QuackAttack.PostMessageApp.web;


import com.QuackAttack.PostMessageApp.objects.Quack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.jdbc.core.JdbcTemplate;


@Controller
public class IndexController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @PostMapping("/postQuack")
    public Quack postMessage(@RequestBody Quack message){
        String sql = "INSERT INTO quacks (user_id, message, is_reply, reply_to_quack_id, is_retweet, retweet_to_quack_id) VALUES (?,?, ?, ?, ?, ?)";

        int rows = jdbcTemplate.update(sql, message.getUserId(), message.getMessage(), message.isReply(), message.getRepliedQuackId(), message.isRetweet(), message.getRetweetedQuackId());
        if (rows > 0) {
            //If row has been created
            System.out.println("A new row has been inserted.");
        }
        else {
            //If row has not been created
            System.out.println("Something went wrong.");
        }
        return message;
    }
}
