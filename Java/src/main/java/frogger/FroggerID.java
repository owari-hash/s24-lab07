package frogger;

/**
 * Encapsulates Frogger's personal information.
 */
public class FroggerID {

    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String zipCode;
    private final String state;
    private final String gender;

    public FroggerID(String firstName, String lastName, String phoneNumber, String zipCode, String state,
            String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String zipCode() {
        return zipCode;
    }

    public String state() {
        return state;
    }

    public String gender() {
        return gender;
    }

    /**
     * Records Frogger's movement to the specified position.
     *
     * @param records  The records object to update.
     * @param position The position Frogger moved to.
     * @return true if record successful, else false.
     */
    public boolean recordTo(Records records, int position) {
        return records.addRecord(firstName, lastName, phoneNumber, zipCode, state, gender, position);
    }
}