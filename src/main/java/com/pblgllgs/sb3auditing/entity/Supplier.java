package com.pblgllgs.sb3auditing.entity;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import com.pblgllgs.sb3auditing.audit.AuditBase;
import com.pblgllgs.sb3auditing.controller.SupplierOutputDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "suppliers")
@Getter
@NoArgsConstructor
@SuperBuilder
public class Supplier extends AuditBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String contactDetails;
    private String specialties;
    public SupplierOutputDTO viewAsOutputDto(){
        return new SupplierOutputDTO(id,name,address,contactDetails,specialties,
                this.getCreatedBy(),this.getCreatedDate(),
                this.getLastModifiedBy(),this.getLastModifiedDate());
    }
}
