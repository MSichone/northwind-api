package com.masgotcode.northwind.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository underTestCustomerRepository;

    @Test
    void shouldCheckIfCustomerExistsByEmailAddress() {
        System.out.println("CustomerRepositoryTest.shouldCheckIfCustomerExistsByEmailAddress");
        //given
        String emailAddress = "anna@companya.com";
        //when
        boolean expected = underTestCustomerRepository.existsByEmailAddress(emailAddress);
        //then
        assertThat(expected).isTrue();
    }

    @Test
    void shouldCheckIfCustomerDoesNotExistsByEmailAddress() {
        System.out.println("CustomerRepositoryTest.shouldCheckIfCustomerDoesNotExistsByEmailAddress");
        //given
        String emailAddress = "stranger@companya.com";
        //when
        boolean expected = underTestCustomerRepository.existsByEmailAddress(emailAddress);
        //then
        assertThat(expected).isFalse();
    }
}