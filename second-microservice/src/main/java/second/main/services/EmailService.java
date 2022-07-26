package second.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import second.main.dto.EmailDTO;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String emailFrom;

    public void sendEmail(EmailDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailFrom);
        message.setTo(emailDTO.getEmailTo());
        message.setSubject(emailDTO.getSubject());
        message.setText(emailDTO.getText());
        mailSender.send(message);
    }
}
