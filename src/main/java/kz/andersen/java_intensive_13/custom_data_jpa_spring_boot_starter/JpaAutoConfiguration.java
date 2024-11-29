package kz.andersen.java_intensive_13.custom_data_jpa_spring_boot_starter;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "org.springframework.data.jpa.repository.JpaRepository")
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
public class JpaAutoConfiguration {
}

