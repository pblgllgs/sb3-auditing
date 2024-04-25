package com.pblgllgs.sb3auditing.repository;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import com.pblgllgs.sb3auditing.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
