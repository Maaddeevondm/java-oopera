public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor( "Антон", "Крутой", Gender.MALE, 183);
        Actor actor2 = new Actor("Кирилл", "Петров", Gender.MALE, 167);
        Actor actor3 = new Actor("Анна", "Иванова", Gender.FEMALE, 174);

        Director director1 = new Director("Генадий", "Горин", Gender.MALE, 12);
        Director director2 = new Director("Елена", "Светлова", Gender.FEMALE, 7);

        String musicAuthor = "Шопен";
        String choreographer = "Владимир";

        MusicalShow musicalShow = new MusicalShow("Холодильник", 60,
                director1, musicAuthor, "Удивление нахождению в холодильнике.");

        Ballet ballet = new Ballet("Лебединое озеро", 120, director2,
                musicAuthor, "Принцесса Одетта превращена в лебедя злым колдуном.", choreographer);

        Opera opera = new Opera("Кармен", 180, director2,
                musicAuthor, "Трагическая история любви цыганки Кармен и солдата Хосе.", 40);

        musicalShow.addActor(actor1);
        musicalShow.addActor(actor3);
        System.out.print("Участники музыкального шоу: ");
        musicalShow.printListOfActors();

        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.print("Участники балета: ");
        ballet.printListOfActors();

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);
        System.out.print("Участники Оперы: ");
        opera.printListOfActors();

        musicalShow.changeActor(actor2, "Крутой");
        System.out.print("Измененные участники музыкального шоу: ");
        musicalShow.printListOfActors();

        ballet.changeActor(actor2,"Кузнецов");
        System.out.print("Либретто оперы: ");
        opera.printLibretto();
        System.out.print("Либретто балета: ");
        ballet.printLibretto();
        System.out.println("Режиссеры: ");
        director1.printInfo();
        director2.printInfo();
    }
}
