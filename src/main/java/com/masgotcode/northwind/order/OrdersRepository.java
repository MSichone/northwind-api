package com.masgotcode.northwind.order;

import com.masgotcode.northwind.customer.Customer;
import com.masgotcode.northwind.employee.Employee;
import com.masgotcode.northwind.shipper.Shipper;
import com.masgotcode.northwind.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

    List<Orders> findAllByCustomer(Customer customer);
    List<Orders> findAllByEmployee(Employee employee);
    List<Orders> findAllByShipper(Shipper shipper);

}
