public class Tiger extends Animal {
    private String stripes;
    private String fur;

    public String getStripes() {
        return stripes;
    }

    public String getFur() {
        return fur;
    }

    public void setStripes(String stripes) {
        this.stripes = stripes;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public Tiger(){
        this.setName("Tiger");
        this.setSpecie("Panthera tigris");
        this.setAge(11);
        stripes = "Tigers have dark vertical stripes";
        fur = "Tigers have a very beautiful orange fur and white underside";
    }
    
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "\nFeature: " + stripes;
        s += "\n Feature: " + fur;
        return s;
    }
    
}
