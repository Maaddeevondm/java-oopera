public class Actor extends Person{
    int height;
    public Actor(String name, String surname, Gender gender, int height){
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }   // Я сделал вывод такой потому что
        // Actor{, name='Антон', surname='Крутой'(183)}, Actor{, name='Анна', surname='Иванова'(174)}]
        // выглядел слишком громоздко
}
