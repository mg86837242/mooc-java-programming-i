import java.util.ArrayList;

public class Room {
  ArrayList<Person> persons;

  public Room() {
    this.persons = new ArrayList<Person>();
  }

  public void add(Person person) {
    this.persons.add(person);
  }

  public boolean isEmpty() {
    return this.persons.isEmpty();
  }

  public ArrayList<Person> getPersons() {
    return this.persons;
  }

  public Person shortest() {
    if (this.persons.size() == 0) {
      return null;
    }

    Person shortest = this.persons.get(0);
    for (Person person : this.persons) {
      if (person.getHeight() < shortest.getHeight()) {
        shortest = person;
      }
    }
    return shortest;
  }

  public Person take() {
    if (this.persons.size() == 0) {
      return null;
    }

    Person taken = this.shortest();
    this.persons.remove(taken);
    return taken;
  }
}
