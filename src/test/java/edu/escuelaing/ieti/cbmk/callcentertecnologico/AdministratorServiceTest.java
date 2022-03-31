package edu.escuelaing.ieti.cbmk.callcentertecnologico;

import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
@TestInstance( TestInstance.Lifecycle.PER_CLASS )
public class AdministratorServiceTest {
    @InjectMocks
    AdministratorServiceImpl service;

    @MockBean
    AdministratorRepository repository ;
}
