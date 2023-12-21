package com.matheus.simplemail.Controller;

import com.matheus.simplemail.model.Email;
import com.matheus.simplemail.service.EmailService;
import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {

    private EmailService emailService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody Email email) throws MessagingException {

        emailService.sendEmail(email);
    }
}
