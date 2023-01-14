package ro.sda.advanced._5_local_class;

public class LocalClass {
    public static void main(String[] args) {

    }
    public void createPair(String k,String v) {
        class Pair {
            public String key;
            public String value;

            public Pair(String key,String value){
                this.key=key;
                this.value=value;
            }
        }
        Pair myPair=new Pair(k,v);
    }
}
