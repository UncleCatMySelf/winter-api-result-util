package com.myself.winter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration classes
 * Created by MySelf on 2018/11/16.
 */
@Data
@Component
@ConfigurationProperties(prefix = "winter.api")
public class ResultApi {

    private int successcode = 200;

    private String successmsg = "Success";

}
