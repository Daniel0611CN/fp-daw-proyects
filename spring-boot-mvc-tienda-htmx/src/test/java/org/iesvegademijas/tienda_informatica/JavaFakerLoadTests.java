package org.iesvegademijas.tienda_informatica;

import com.github.javafaker.Faker;
import org.iesvegademijas.tienda_informatica.modelo.Fabricante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootTest
public class JavaFakerLoadTests {

    Faker faker = new Faker(Locale.of("es"));

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void load() {

        for (int i = 0; i < 10; i++) {

            List<Fabricante> listFabs = new ArrayList<>(1000);
            for (int j = 0; j < 1000; j++) {

                Fabricante fab = Fabricante.builder()
                                    .nombre(faker.company().name())
                                    .build();

                listFabs.add(fab);
            }
            int batchSize = 100;
            jdbcTemplate.batchUpdate("""
                            INSERT INTO fabricante (nombre)
                            VALUES  (  ? )
                            """, listFabs, batchSize,
                    (PreparedStatement ps, Fabricante fab) -> {
                        ps.setString(1, fab.getNombre());
                    });
        }



    }

}
