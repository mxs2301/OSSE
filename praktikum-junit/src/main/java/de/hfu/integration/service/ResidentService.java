package de.hfu.integration.service;

import java.util.List;

//import de.hfu.residents.domain.Resident;
import de.hfu.integration.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentService {

  Resident getUniqueResident(Resident filterResident) throws ResidentServiceException;

  List<Resident> getFilteredResidentsList(Resident filterResident);

}