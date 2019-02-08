package com.urkovillanueva.gestion.model.config.storage;

public interface StorageService {

    public byte [] readFile(String path);

    public void  writeFile(String path, byte [] file);

    public void  deleteFile(String path);
}

