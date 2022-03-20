package NestedClass.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math {
    public void getResult() {
        class Delenie {
            private int delomoe;
            private int delitel;

            public void setDelomoe(int delomoe) {
                this.delomoe = delomoe;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getDelomoe() {
                return delomoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public int getChasnoe() {
                return delomoe / delitel;
            }
            public int getOstatok() {
                return delomoe % delitel;
            }

        }

        Delenie delenie = new Delenie();
        delenie.setDelomoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelomoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chasnoe = " + delenie.getChasnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());

    }
}

