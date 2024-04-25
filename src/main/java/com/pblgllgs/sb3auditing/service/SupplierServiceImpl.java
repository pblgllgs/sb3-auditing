package com.pblgllgs.sb3auditing.service;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import com.pblgllgs.sb3auditing.controller.SupplierOutputDTO;
import com.pblgllgs.sb3auditing.dto.SupplierInputDTO;
import com.pblgllgs.sb3auditing.entity.Supplier;
import com.pblgllgs.sb3auditing.exception.ResourceNotFoundException;
import com.pblgllgs.sb3auditing.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements  SupplierService{

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(final SupplierRepository supplierRepository){
        this.supplierRepository = supplierRepository;
    }
    @Override
    public List<SupplierOutputDTO> getAllSuppliers() {
        return supplierRepository.findAll().stream().map(Supplier::viewAsOutputDto).toList();
    }

    public SupplierOutputDTO getSupplierById(Long id) {
        return supplierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("No Supplier entity with id %s exists!", id))).viewAsOutputDto();
    }

    public SupplierOutputDTO createSupplier(SupplierInputDTO supplierDto) {
        Supplier supplier = Supplier.builder().name(supplierDto.getName()).contactDetails(supplierDto.getContactDetails()).address(supplierDto.getAddress()).specialties(supplierDto.getSpecialties()).build();
        return supplierRepository.save(supplier).viewAsOutputDto();
    }

    public SupplierOutputDTO updateSupplier(long id, SupplierInputDTO supplierDto) {
        SupplierOutputDTO existingSupplier = getSupplierById(id);
        Supplier supplier = Supplier.builder().name(supplierDto.getName()).contactDetails(supplierDto.getContactDetails()).address(supplierDto.getAddress()).specialties(supplierDto.getSpecialties()).id(existingSupplier.getId()).createdBy(existingSupplier.getCreatedBy()).createdDate(existingSupplier.getCreatedDate()).build();
        return supplierRepository.save(supplier).viewAsOutputDto();
    }



}
