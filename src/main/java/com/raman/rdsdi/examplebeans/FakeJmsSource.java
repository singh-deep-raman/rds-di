package com.raman.rdsdi.examplebeans;

public class FakeJmsSource {

    private String jmsUsername;
    private String jmsPassword;
    private String jmsUrl;

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }

    @Override
    public String toString() {
        return "FakeJmsSource{" +
                "jmsUsername='" + jmsUsername + '\'' +
                ", jmsPassword='" + jmsPassword + '\'' +
                ", jmsUrl='" + jmsUrl + '\'' +
                '}';
    }
}
