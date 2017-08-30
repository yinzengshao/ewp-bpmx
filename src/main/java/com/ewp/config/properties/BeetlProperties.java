package com.ewp.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@ConfigurationProperties(prefix = BeetlProperties.BEETLC_PREFIX)
public class BeetlProperties {

    public static final String BEETLC_PREFIX = "beetl";

    private String delimiterStatementStart;

    private String delimiterStatementEnd;

    private String resourceLoader;

    private String resourceAutoCheck;

    public Properties beetlProperties(){
        Properties properties = new Properties();
        properties.setProperty("DELIMITER_STATEMENT_START", delimiterStatementStart.replace("\\",""));
        properties.setProperty("DELIMITER_STATEMENT_END", delimiterStatementEnd);
        properties.setProperty("RESOURCE.autoCheck", resourceAutoCheck);

        return properties;
    }

    public String getDelimiterStatementStart() {
        return delimiterStatementStart;
    }

    public void setDelimiterStatementStart(String delimiterStatementStart) {
        this.delimiterStatementStart = delimiterStatementStart;
    }

    public String getDelimiterStatementEnd() {
        return delimiterStatementEnd;
    }

    public void setDelimiterStatementEnd(String delimiterStatementEnd) {
        this.delimiterStatementEnd = delimiterStatementEnd;
    }

    public String getResourceLoader() {
        return resourceLoader;
    }

    public void setResourceLoader(String resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public String getResourceAutoCheck() {
        return resourceAutoCheck;
    }

    public void setResourceAutoCheck(String resourceAutoCheck) {
        this.resourceAutoCheck = resourceAutoCheck;
    }
}
