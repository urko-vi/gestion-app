package com.urkovillanueva.gestion.model.config.storage;


import java.io.File;

public class StorageServiceOnPremise implements StorageService{

    private String rootLocation;
    private StorageServiceOnPremise(){
        super();
    }

    public StorageServiceOnPremise (String rootLocation){
        this.rootLocation = rootLocation;
        new StorageServiceOnPremise();
    }

    @Override
    public byte[] readFile(String path) {
        String fullPath = rootLocation+ File.pathSeparatorChar+path;
        return new byte[0];
    }

    @Override
    public void writeFile(String path, byte[] file) {
        String fullPath = rootLocation+ File.pathSeparatorChar+path;
    }

    @Override
    public void deleteFile(String path) {
        String fullPath = rootLocation+ File.pathSeparatorChar+path;
    }
}
