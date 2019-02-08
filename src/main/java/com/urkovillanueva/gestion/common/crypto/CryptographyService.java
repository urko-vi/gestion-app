package com.urkovillanueva.gestion.common.crypto;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public interface CryptographyService {


    public byte[] encrypt(byte[] publicKey, byte[] inputData);

    public byte[] decrypt(byte[] privateKey, byte[] inputData);

    public KeyPair generateKeyPair()
            throws NoSuchAlgorithmException, NoSuchProviderException;
}
