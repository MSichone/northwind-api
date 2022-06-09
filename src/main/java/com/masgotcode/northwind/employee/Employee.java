package com.masgotcode.northwind.employee;

import com.masgotcode.northwind.contact.Contact;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Employee")
@Table(name = "employees")
public class Employee extends Contact {
}
