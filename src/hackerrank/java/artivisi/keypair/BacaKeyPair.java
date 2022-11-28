package hackerrank.java.artivisi.keypair;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Enumeration;

public class BacaKeyPair {
    public static void main(String[] args) throws Exception {
        KeyStore p12 = KeyStore.getInstance("PKCS12");
        p12.load(new FileInputStream(
                        "/home/yeahbutstill/IdeaProjects/fuck-off-lets-back-to-basic/src/hackerrank/java/artivisi/keypair/remote.p12"),
                "".toCharArray());

        Enumeration<String> e = p12.aliases();
        String alias = e.nextElement();
        X509Certificate c = (X509Certificate) p12.getCertificate(alias);

        System.out.println("-----BEGIN PUBLIC KEY-----");
        System.out.println(Base64.getMimeEncoder().encodeToString(c.getPublicKey().getEncoded()));
        System.out.println("-----END PUBLIC KEY-----");
    }
}