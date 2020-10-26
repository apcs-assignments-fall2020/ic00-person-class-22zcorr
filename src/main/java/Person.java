public class Person 
{
    private String firstName;
    private String lastName;
    private int xp;

    public Person(String a, String b, int c)
    {
        firstName = a;
        lastName = b;
        xp = c;

    }
    
    @Override
    public String toString(){
        return this.firstName+ " " +this.lastName;
    }

    public void doSomething(){
        xp+=3;
        System.out.println(this.firstName+ " did something.");
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getXP(){
        return this.xp;
    }
    public void setFirstName(String a) {
		if(a.trim().length()>0){this.firstName = a;}
    }
    public void setLastName(String a) {
		if(a.trim().length()>0){this.lastName = a;}
    }
    
    public void cook(){
        xp+=5;
        int randomDish = ((int)(Math.random()*4))+1;

        if(randomDish==1){
            System.out.println( this.toString() + " has baked apples, cinnamon, and sugar into a warm Apple Pie!");
        }
        else if(randomDish==2){
            System.out.println( this.toString() + " has blended various fruits into a Smoothie!");
        }
        else if(randomDish==3){
            System.out.println( this.toString() + " has sautéed some vegetables, meat, egg, and rice into Bibimbap!");
        }
        else{
            System.out.println( this.toString() + " has boiled some rice cakes and mixed it with red chili pepper paste to make Tteokbokki");
        }
    }

    public void nothing(){
        xp+=1;
        System.out.println(this.toString()+ " did nothing. (Why did you choose this one?)");
    }















}













