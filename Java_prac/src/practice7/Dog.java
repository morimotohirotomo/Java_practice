package practice7;

class Dog {
    private String Name;
    private int Age;

    public void SetName( String nm ) {
        Name = nm;
    }

    public void ShowProfile(){
        System.out.println( "名前は" + Name + "です。" );
        System.out.println("年齢は" + Age + "です。");
    }

    public void SetAge(int age) {
    	Age = age;
    }
}
