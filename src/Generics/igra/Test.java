package Generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Sasha", 11);

        Schoolar schoolar3 = new Schoolar("Katya", 13);
        Schoolar schoolar4 = new Schoolar("Ira", 11);

        Student student1 = new Student("Oleh", 19);
        Student student2 = new Student("Masha", 21);

        Emploee emploee1 = new Emploee("Dima", 35);
        Emploee emploee2 = new Emploee("Andrii", 26);

        Team<Schoolar> schoolarTeam = new Team<>("Draconi");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Draconi2");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Orli");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Emploee> emploeeTeam = new Team<>("Osi");
        emploeeTeam.addNewParticipant(emploee1);
        emploeeTeam.addNewParticipant(emploee2);

        schoolarTeam.playWith(schoolarTeam2);



    }
}
