public class Lion extends Animal {
    private String mane;
    private String headRubbing;

    public String getMane() {
        return mane;
    }

    public String getHeadRubbing() {
        return headRubbing;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    public void setHeadRubbing(String headRubbing) {
        this.headRubbing = headRubbing;
    }

    public String curiosity(String curiosity){
        return curiosity;
    }

    public Lion(){
        this.setName("Lion");
        this.setSpecie("Panthera leo");
        this.setAge(16);
        mane = "Lion's have a light orange mane";
        headRubbing = "Lion's do head rubbing as their main socialization behaviour";
    }
    
    @Override
    public String toString(){
        String s = super.toString();
        s += "\nFeature: " + mane;
        s += "\n Feature: " + headRubbing;
        return s;
    }
   
}
