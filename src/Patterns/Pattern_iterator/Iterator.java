package Patterns.Pattern_iterator;

public interface Iterator {
    public boolean hesNext();

    public Object next();
}

interface Collection {
    Iterator getIterator();
}

class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hesNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
class JavaDeveloperRunner{
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Andrii Osadchuk", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");
        while(iterator.hesNext()){
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}


