package Multithreading;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendsAction = new ArrayList<>();
        friendsAction.add(Action.NOJNICI);
        friendsAction.add(Action.BUMAGA);
        friendsAction.add(Action.NOJNICI);

        List<Action> friends2Action = new ArrayList<>();
        friends2Action.add(Action.BUMAGA);
        friends2Action.add(Action.KAMEN);
        friends2Action.add(Action.KAMEN);

        new BestFriend("Vanya", friendsAction, exchanger );
        new BestFriend("Andrii", friends2Action, exchanger );
    }
}
enum Action{
    KAMEN, NOJNICI, BUMAGA;
}
class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWings(Action myAction, Action friendsAction){
        if((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
            ||(myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
            || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)){
            System.out.println(name + " Wins...");
        }
    }
    public void run(){
        Action reply;
        for(Action action: myActions){
            try {
                reply = exchanger.exchange(action);
                whoWings(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
