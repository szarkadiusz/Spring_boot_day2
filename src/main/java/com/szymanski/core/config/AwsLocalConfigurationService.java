package com.szymanski.core.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"local", "default"})
public class AwsLocalConfigurationService implements AwsConfigurationService{
    @Override
    public String getAwsRegion(){
        return "AWS region for Local";
    }

    @Override
    public String getAwsAZ() {
        return "AWS AZ for local";
    }

}
