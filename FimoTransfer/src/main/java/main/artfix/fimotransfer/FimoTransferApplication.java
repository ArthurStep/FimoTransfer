package main.artfix.fimotransfer;

import main.artfix.Coft;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FimoTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(FimoTransferApplication.class, args);
        Coft.logging.StartLogging();
    }

}
