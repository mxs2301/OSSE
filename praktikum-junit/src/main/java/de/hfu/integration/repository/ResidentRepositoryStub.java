package de.hfu.integration.repository;

import de.hfu.integration.domain.Resident;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResidentRepositoryStub implements ResidentRepository {

    List<Resident> residents;

    public ResidentRepositoryStub(){
        residents = new ArrayList<>();
        residents.add(new Resident("Micky", "Maus", "Katzenstraße", "Entenhausen", new Date(12, 11, 1940)));
       /* residents.add(new Resident("Donald", "Duck", "Tresorstraße", "Entenhausen", new Date(23, 8, 1940)));
        residents.add(new Resident("Goofy", "Goofy", "Hundestraße", "Entenhausen", new Date(4, 12, 1945)));*/
    }

    @Override
    public List<Resident> getResidents() {
        return residents;
    }
}
