package Patterns.Pattern_dekorator;


class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper( new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
public interface Developer {
    public String makeJob();
}

class DeveloperDecorator implements Developer {
    Developer developer;
    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write code. ";
    }
}
class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
class TeamLeadJavaDeveloper extends DeveloperDecorator {
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String SendList(){
        return "Send list costumers. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + SendList();
    }
}

