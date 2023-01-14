package ro.sda.advanced._6_Annonimous_classes;

public abstract class AnnonimusClasses {

    public abstract void doIt();

}


class Main {
    public static void main(String[] args) {
        AnnonimusClasses annonimusClasses = new AnnonimusClasses() {
            @Override
            public void doIt() {
                System.out.println("Implemented method");
            }
        };
        annonimusClasses.doIt();
    }
}
