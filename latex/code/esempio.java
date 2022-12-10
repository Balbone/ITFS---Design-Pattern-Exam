
public class Persona{
    private String nome;
}

public class Studente extends Persona{
    private String matricola = 10; // valore di default
}

public class Lavoratore extends Persona{
    private String nome = "pippo";
}

public class StudenteLavoratore extends Persona, Lavoratore{
    private String nome;
}

