package com.masgotcode.northwind.order;

import com.masgotcode.northwind.customer.Customer;
import com.masgotcode.northwind.customer.CustomerService;
import com.masgotcode.northwind.employee.Employee;
import com.masgotcode.northwind.employee.EmployeeService;
import com.masgotcode.northwind.shipper.Shipper;
import com.masgotcode.northwind.shipper.ShipperService;
import com.masgotcode.northwind.supplier.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    private Logger log = LoggerFactory.getLogger(OrderController.class);

    private final OrdersRepository ordersRepository;
    private final CustomerService customerService;
    private final EmployeeService employeeService;
    private final ShipperService shipperService;

    @Autowired
    public OrderController(OrdersRepository ordersRepository, CustomerService customerService, EmployeeService employeeService, SupplierService supplierService, ShipperService shipperService) {
        this.ordersRepository = ordersRepository;
        this.customerService = customerService;
        this.employeeService = employeeService;
        this.shipperService = shipperService;
    }

    @GetMapping("all")
    public Iterable<Orders> getAllOrders(){
        log.info("OrdersController.getAllOrders");
        return ordersRepository.findAll();
    }

    @GetMapping("all/customer/{customerId}")
    public Iterable<Orders> getAllOrdersByCustomer(@PathVariable Long customerId){
        log.info("OrderController.getAllOrdersByCustomer["+customerId+"]");
        Iterable<Orders> orders = new ArrayList<>();
        Optional<Customer> optionalCustomer = customerService.getCustomerById(customerId);
        if (optionalCustomer.isPresent()){
            orders = ordersRepository.findAllByCustomer(optionalCustomer.get());
        }
        return orders;
    }

    @GetMapping("all/employee/{employeeId}")
    public Iterable<Orders> getAllOrdersByEmployee(@PathVariable Long employeeId){
        log.info("OrderController.getAllOrdersByEmployee["+employeeId+"]");
        Iterable<Orders> orders = new ArrayList<>();
        Optional<Employee> optionalEmployee = employeeService.getEmployeeById(employeeId);
        if(optionalEmployee.isPresent()){
            orders = ordersRepository.findAllByEmployee(optionalEmployee.get());
        }
        return orders;
    }

    @GetMapping("all/shipper/{shipperId}")
    public Iterable<Orders> getAllOrdersByShipper(@PathVariable Long shipperId){
        log.info("OrderController.getAllOrdersByShipper["+shipperId+"]");
        Iterable<Orders> orders = new ArrayList<>();
        Optional<Shipper> optionalShipper = shipperService.getShipperById(shipperId);
        if(optionalShipper.isPresent()){
            orders = ordersRepository.findAllByShipper(optionalShipper.get());
        }
        return orders;
    }

}
