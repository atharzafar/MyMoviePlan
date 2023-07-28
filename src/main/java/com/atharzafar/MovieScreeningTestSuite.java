package com.suryaditya;

import com.suryaditya.business.service.ScreeningServiceIntegrationTest;
import com.suryaditya.data.repository.ScreeningRepositoryIntegrationTest;
import com.suryaditya.web.application.ScreeningControllerIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ScreeningServiceIntegrationTest.class, ScreeningControllerIntegrationTest.class,
        ScreeningRepositoryIntegrationTest.class})
public class MovieScreeningTestSuite {
}
