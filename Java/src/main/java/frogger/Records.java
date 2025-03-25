package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages records of Frogger's movements.
 */
public class Records {

    private final List<String> recordList = new ArrayList<>();

    /**
     * Adds a record of Frogger's movement.
     *
     * @return true if record successful, else false.
     */
    public boolean addRecord(String firstName, String lastName, String phoneNumber, String zipCode, String state,
            String gender, int position) {
        String record = String.format("Frogger %s %s moved to position %d (Phone: %s, Zip: %s, State: %s, Gender: %s)",
                firstName, lastName, position, phoneNumber, zipCode, state, gender);
        return recordList.add(record);
    }

    public List<String> getRecords() {
        return new ArrayList<>(recordList);
    }
}