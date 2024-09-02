package org.iqkv.boot.starter.mail;

import org.iqkv.boot.mail.MailProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {
    MailProperties.class
})
public class MailAutoConfiguration {
}