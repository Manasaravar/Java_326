public class Teacher extends Human
{
    private String speciality;
    private int experience;

    public String getSpeciality() {
        return speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Teacher(String lastName, String firstName, int age, String speciality, int experience) {
        super(lastName, firstName, age);
        setSpeciality(speciality);
        setExperience(experience);
        System.out.println("TConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public void init (String [] values) {
        super.init(values);
        speciality = values[4];
        experience = Integer.parseInt(values[5]);
    }
    @Override
    public String toString() {
        return super.toString() + ", " + speciality + ", " + experience;
    }
}
