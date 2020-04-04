package com.sarracent.petclinic.services;

import com.sarracent.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
