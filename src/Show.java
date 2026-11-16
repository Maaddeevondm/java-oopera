import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printListOfActors(){
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor){
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже есть!");
            return;
        }
        listOfActors.add(newActor);
    }

    public void changeActor(Actor newActor, String surname){
        boolean find = false;
        Actor findActor = null;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)){
                findActor = actor;
                find = true;
                break;
            }
        }
        if(find) {
            listOfActors.remove(findActor);
            listOfActors.add(newActor);
        } else {
            System.out.println("Такой актер не участвует!");
        }
    }
}
