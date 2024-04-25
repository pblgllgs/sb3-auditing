package com.pblgllgs.sb3auditing.service;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import com.pblgllgs.sb3auditing.controller.SupplierOutputDTO;
import com.pblgllgs.sb3auditing.dto.SupplierInputDTO;

import java.util.List;

public interface SupplierService {

    public List<SupplierOutputDTO> getAllSuppliers();

    public SupplierOutputDTO getSupplierById(Long id);

    public SupplierOutputDTO createSupplier(SupplierInputDTO supplierDto);

    public SupplierOutputDTO updateSupplier(long id, SupplierInputDTO supplierDto);

}
