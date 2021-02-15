package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot() {
        return "A shark that eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    public String plot() {
        return "Aliens attempt to take over the Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kids try and scape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }

    // no plot method
}

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie " + i + "# " + " Movie name is: " + movie.getName()
                + "and plot is: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}
