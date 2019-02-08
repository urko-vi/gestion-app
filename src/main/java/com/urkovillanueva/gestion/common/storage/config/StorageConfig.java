package com.urkovillanueva.gestion.common.storage.config;

import com.urkovillanueva.gestion.common.storage.services.StorageService;
import com.urkovillanueva.gestion.common.storage.services.StorageServiceOnPremise;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class StorageConfig {

    @Profile(value = "onpremise")
    @Bean
    public StorageService getStorageService(@Value("${file.location}")String rootLocation){
        return new StorageServiceOnPremise(rootLocation);
    }
}
