package Patterns.Pattern_observer;

import java.util.List;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite =new  JavaDeveloperJobSite();
        jobSite.addVacancies("First Java Position");
        jobSite.addVacancies("Second Java Position");

        Observer firstSubscriber = new Subscriber("Andrii Osadchuk");
        Observer secondSubscriber = new Subscriber("Taras Osadchuk");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancies("Third Java Position");
        jobSite.removeVacancy("First Java Position");

    }
}
