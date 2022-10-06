public class Main {
    final static int invalidValue = 0;

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle()==null) {
            throw new RuntimeException("Не заполнено поле с названием");
        } else if (event.getReleaseYear() == invalidValue) {
            throw new RuntimeException("Не заполнено поле с датой выпуска");
        } else if (event.getAge() == invalidValue) {
            throw new RuntimeException("Не заполнено поле с возраста");
        }
    }
}