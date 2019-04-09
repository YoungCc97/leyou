package com.leyou.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Young
 * @date 2019/4/4 1:30
 * @description：
 */
@ConfigurationProperties(prefix = "ly.upload")
@Data
public class UploadProperties {
    private String baseUrl;
    private List<String> allowTypes;
}
