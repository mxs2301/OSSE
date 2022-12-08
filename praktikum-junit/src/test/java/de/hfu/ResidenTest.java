package de.hfu;

import de.hfu.integration.domain.Resident;
import de.hfu.integration.repository.ResidentRepositoryStub;
import de.hfu.integration.service.BaseResidentService;
import de.hfu.integration.service.ResidentServiceException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class ResidenTest {
    Resident human_1 = new Resident("Max", "Schopf", "Student", "Fuwa", new Date(23, 1, 22));
    Resident micky = new Resident("Micky", "Maus", "Katzenstraße", "Entenhausen", new Date(12, 11, 1940));

    Resident dummy = new Resident("Mi", null, null, null, null);
    Resident dummy_2 = new Resident("Ma*", null, null, null, null);
    List<Resident> test_list = new ArrayList<>();
    BaseResidentService obj_1;

    @Test
    public void TestResidentUnique_1() throws ResidentServiceException {
        obj_1 = new BaseResidentService();
        obj_1.setResidentRepository(new ResidentRepositoryStub());
        try {
            obj_1.getUniqueResident(dummy_2);
            fail("Sollte nicht gefunden werden");
        } catch (ResidentServiceException e) {
            System.out.println("Exception bei TestResidentUnique_1");
        }
    }

    @Test
    public void TestResidentUnique_2() throws ResidentServiceException {
        assertNotNull(micky);
        assertNull(obj_1);
        obj_1 = new BaseResidentService();
        assertNotNull(obj_1);
    }

    @Test
    public void TestResidentUnique_3() throws ResidentServiceException {
        obj_1 = new BaseResidentService();
        obj_1.setResidentRepository(new ResidentRepositoryStub());
        assertNotNull(obj_1);

        Resident dummy_3 = obj_1.getUniqueResident(micky);

        assertEquals(dummy_3.getGivenName(), micky.getGivenName());
        assertEquals(dummy_3.getStreet(), micky.getStreet());
    }

    @Test
    public void TestResidentFilters() throws ResidentServiceException {

        test_list.add(micky);

        obj_1 = new BaseResidentService();
        obj_1.setResidentRepository(new ResidentRepositoryStub());

        test_list = obj_1.getFilteredResidentsList(micky);

        assertEquals(1, test_list.size());

        try {
            obj_1.getUniqueResident(human_1);
            fail("Irgendwas hat funktioniert, sollte aber nicht");
        } catch (ResidentServiceException e) {
            System.out.println("Es wurde eine Exception geworfen");
        }

        assertEquals(test_list.get(0), obj_1.getUniqueResident(micky));

    }

    @Test
    public void TestWithHamcrestAndEasyMock() throws ResidentServiceException{

    }

}
