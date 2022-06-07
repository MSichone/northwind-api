package com.masgotcode.northwind.supplier;

import com.masgotcode.northwind.contact.Contact;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity(name = "Supplier")
@Table(name = "suppliers")
public class Supplier extends Contact {
}
