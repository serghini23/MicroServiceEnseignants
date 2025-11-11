package net.serghini.tpenseignants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

public class TpEnseignantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpEnseignantsApplication.class, args);
    }

}
