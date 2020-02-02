package com.jack.webapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "person")
@Getter
@Setter
@ToString
public class PersonInfo {
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birthday;
    private List<String> phone;
    @Value("${mail}")
    private String mail;
}
