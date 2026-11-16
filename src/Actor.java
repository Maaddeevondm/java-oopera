import java.util.Objects;

public class Actor extends Person{
    private int height;
    public Actor(String name, String surname, Gender gender, int height){
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor other = (Actor) obj;
        return height == other.height &&
                getName().equals(other.getName()) &&
                getSurname().equals(other.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }   // Я сделал вывод такой потому что
        // Actor{, name='Антон', surname='Крутой'(183)}, Actor{, name='Анна', surname='Иванова'(174)}]
        // выглядел слишком громоздко

    /*PS 2. equals и hashCode не были по ТЗ это было в подсказках которые вроде необязательные
     По ТЗ было: Добавить нового актёра в спектакль. При добавлении актёра должна быть проверка,
     нет ли уже такого актёра среди добавленных. Если есть, должно выводиться предупреждающее сообщение,
     и актёр не должен добавляться. Актёры считаются одинаковыми, если у них совпадают имя, фамилия и рост.
     Что я и сделал*/


}
