package de.hfu.integration.repository;

import java.util.List;

import de.hfu.integration.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}