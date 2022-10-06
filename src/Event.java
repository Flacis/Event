public abstract class Event {
    String title;
    int releaseYear;
    int age;

    public Event(String title, int releaseYear, int age) {

        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    public String toString() {

        return "Название: " + title + "\n" +
                "Год выпуска: " + releaseYear + "\n" +
                "Ограничение по возрасту: " + age;
    }
}
