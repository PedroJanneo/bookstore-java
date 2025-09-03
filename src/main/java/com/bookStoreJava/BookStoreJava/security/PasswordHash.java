package com.bookStoreJava.BookStoreJava.security;
import org.mindrot.jbcrypt.BCrypt;
public class PasswordHash {

    public static String hash(String senha) {
        return BCrypt.hashpw(senha, BCrypt.gensalt());
    }
    public static boolean verificar(String senha, String hash) {
        return BCrypt.checkpw(senha, hash);
    }


}
