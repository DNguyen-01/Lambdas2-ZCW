import java.time.LocalDate;
import java.util.List;

public class Local implements CheckPerson{


    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


    @Override
    public boolean test(Person p) {

        if(p.name.equals("David") && p.gender == Person.Sex.MALE){
            return true;
        }

        return false;
    }
}
