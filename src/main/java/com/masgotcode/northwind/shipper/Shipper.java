package com.masgotcode.northwind.shipper;

import com.masgotcode.northwind.contact.Contact;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "Shipper")
@Table(name = "shippers")
public class Shipper extends Contact {
}
