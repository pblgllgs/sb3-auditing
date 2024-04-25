package com.pblgllgs.sb3auditing.dto;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SupplierInputDTO {
    private final String name;
    private final String address;
    private final String contactDetails;
    private final String specialties;
}
