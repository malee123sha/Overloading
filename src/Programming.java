public class Programming {
    String language;
    Programming(){
        this.language = "Java";
    }
    Programming(String language){
        this.language = language;
    }
    public void getName() {
        System.out.println("Programming Language:"+this.language);
    }
    public static void main(String[] args) {
        Programming p = new Programming();
        Programming p1 = new Programming("Python");
        p.getName();
        p1.getName();
    }
}
