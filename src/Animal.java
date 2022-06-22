public class Animal {
    private String name;
    private String specie;
    private int age;

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        String s ="Animal: " + name;
        s +="\n Specie: " + specie;
        s += "\n Age: " + age + " years.";
        return s;
    }
    
    
}
