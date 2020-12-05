package com.company.services;

/**
 *
 * Autor Craig Kem Castro Pairazaman
 */
public class EncryptServices {
    private final int salt;
    private final int encryptRounds;

    /**
     * Método para encriptar
     * */

    public String encrypt(String sentence) {

        char[] letters = sentence.toCharArray();

        for (int e = 0; e < encryptRounds; e++){
            for (int i = 0;
                 i < letters.length;
                 i++) {
                letters[i] = (char) (letters[i] + (char) (this.salt + this.salt));
            }
        }

        return String.valueOf(letters);
    }

    /**
     * Método para desencriptar
     * */

    public String decrypt(String encrypted) {

        char[] letters = encrypted.toCharArray();

        for (int e = 0; e < encryptRounds; e++) {
            for (int i = 0;
                 i < letters.length;
                 i++) {
                letters[i] = (char) (letters[i] - (char) (this.salt + this.salt));
            }
        }

        return String.valueOf(letters);
    }


    public EncryptServices(int salt, int encryptRounds) {
        this.salt = salt;
        this.encryptRounds = encryptRounds;
    }
}
