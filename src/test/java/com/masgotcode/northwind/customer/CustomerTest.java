package com.masgotcode.northwind.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CustomerTest {
    /**
     * Method under test: {@link Customer#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Customer()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Customer#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Customer customer = new Customer();

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setBusinessPhone("4105551212");
        customer1.setCity("Oxford");
        customer1.setCompany("Company");
        customer1.setCountryRegion("us-east-2");
        customer1.setEmailAddress("42 Main St");
        customer1.setFaxNumber("42");
        customer1.setFirstName("Jane");
        customer1.setHomePhone("4105551212");
        customer1.setId(123L);
        customer1.setJobTitle("Dr");
        customer1.setLastName("Doe");
        customer1.setMobilePhone("4105551212");
        customer1.setNotes("Notes");
        customer1.setStateProvince("MD");
        customer1.setWebPage("Web Page");
        customer1.setZipPostalCode("21654");
        assertTrue(customer.canEqual(customer1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Customer}
     *   <li>{@link Customer#toString()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals("Customer()", (new Customer()).toString());
    }

    /**
     * Method under test: {@link Customer#equals(Object)}
     */
    @Test
    void testEquals() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setBusinessPhone("4105551212");
        customer.setCity("Oxford");
        customer.setCompany("Company");
        customer.setCountryRegion("us-east-2");
        customer.setEmailAddress("42 Main St");
        customer.setFaxNumber("42");
        customer.setFirstName("Jane");
        customer.setHomePhone("4105551212");
        customer.setId(123L);
        customer.setJobTitle("Dr");
        customer.setLastName("Doe");
        customer.setMobilePhone("4105551212");
        customer.setNotes("Notes");
        customer.setStateProvince("MD");
        customer.setWebPage("Web Page");
        customer.setZipPostalCode("21654");
        assertNotEquals(customer, null);
    }

    /**
     * Method under test: {@link Customer#equals(Object)}
     */
    @Test
    void testEquals2() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setBusinessPhone("4105551212");
        customer.setCity("Oxford");
        customer.setCompany("Company");
        customer.setCountryRegion("us-east-2");
        customer.setEmailAddress("42 Main St");
        customer.setFaxNumber("42");
        customer.setFirstName("Jane");
        customer.setHomePhone("4105551212");
        customer.setId(123L);
        customer.setJobTitle("Dr");
        customer.setLastName("Doe");
        customer.setMobilePhone("4105551212");
        customer.setNotes("Notes");
        customer.setStateProvince("MD");
        customer.setWebPage("Web Page");
        customer.setZipPostalCode("21654");
        assertNotEquals(customer, "Different type to Customer");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Customer#equals(Object)}
     *   <li>{@link Customer#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setBusinessPhone("4105551212");
        customer.setCity("Oxford");
        customer.setCompany("Company");
        customer.setCountryRegion("us-east-2");
        customer.setEmailAddress("42 Main St");
        customer.setFaxNumber("42");
        customer.setFirstName("Jane");
        customer.setHomePhone("4105551212");
        customer.setId(123L);
        customer.setJobTitle("Dr");
        customer.setLastName("Doe");
        customer.setMobilePhone("4105551212");
        customer.setNotes("Notes");
        customer.setStateProvince("MD");
        customer.setWebPage("Web Page");
        customer.setZipPostalCode("21654");
        assertEquals(customer, customer);
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Customer#equals(Object)}
     *   <li>{@link Customer#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setBusinessPhone("4105551212");
        customer.setCity("Oxford");
        customer.setCompany("Company");
        customer.setCountryRegion("us-east-2");
        customer.setEmailAddress("42 Main St");
        customer.setFaxNumber("42");
        customer.setFirstName("Jane");
        customer.setHomePhone("4105551212");
        customer.setId(123L);
        customer.setJobTitle("Dr");
        customer.setLastName("Doe");
        customer.setMobilePhone("4105551212");
        customer.setNotes("Notes");
        customer.setStateProvince("MD");
        customer.setWebPage("Web Page");
        customer.setZipPostalCode("21654");

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setBusinessPhone("4105551212");
        customer1.setCity("Oxford");
        customer1.setCompany("Company");
        customer1.setCountryRegion("us-east-2");
        customer1.setEmailAddress("42 Main St");
        customer1.setFaxNumber("42");
        customer1.setFirstName("Jane");
        customer1.setHomePhone("4105551212");
        customer1.setId(123L);
        customer1.setJobTitle("Dr");
        customer1.setLastName("Doe");
        customer1.setMobilePhone("4105551212");
        customer1.setNotes("Notes");
        customer1.setStateProvince("MD");
        customer1.setWebPage("Web Page");
        customer1.setZipPostalCode("21654");
        assertEquals(customer, customer1);
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer1.hashCode());
    }
}

