package kr.co.mz.order_paper.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEncryptableProperties
public class JasyptConfig {

  @Bean(name = "jasyptStringEncryptor")
  public StringEncryptor stringEncryptor() {
    var key = "order_paper_key";
    var encryptor = new PooledPBEStringEncryptor();
    var config = new SimpleStringPBEConfig();
    config.setPassword(key);
    config.setAlgorithm("PBEWithMD5AndDES"); // 암호화 알고리즘
    config.setKeyObtentionIterations("1000"); // 반복할 해싱 회수
    config.setPoolSize("1"); // 인스턴스 pool
    config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator"); // salt 생성 클래스
    config.setStringOutputType("base64"); //인코딩 방식
    encryptor.setConfig(config);
    return encryptor;
  }

  //  암호설정
  public static void main(String[] args) {
    String key = "order_paper_key";
    StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
    encryptor.setAlgorithm("PBEWithMD5AndDES");
    encryptor.setPassword(key);
    System.out.println(encryptor.encrypt("order!"));
//    System.out.println(encryptor.decrypt("t3Iq2+Crlyh4i8bmTy1efg=="));

  }

}
