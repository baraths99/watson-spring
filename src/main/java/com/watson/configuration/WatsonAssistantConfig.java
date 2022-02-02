package com.watson.configuration;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "ibm.watson.assistant")
@Validated // 
public class WatsonAssistantConfig {

    private String apikey="TO9VdomJoalU-hzSzXPCWzH6r4pzk1c51MkYLKAk1ZpU";

    private String id="ecd8c997-231b-4b14-b829-262b5fc5c051";

    private String url="https://api.us-south.assistant.watson.cloud.ibm.com/instances/6501edc4-6c37-4368-9319-106737b88ddf";

    
    private String versionDate="2020-01-16";


    // Getters
    public String getApikey() {
        return apikey;
    }
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getVersionDate() {
        return versionDate;
    }
    // Setters
    public void setApikey(String apikey) { this.apikey = apikey; }
    public void setId(String id) { this.id = id; }
    public void setUrl(String url) { this.url = url; }
    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }
}
