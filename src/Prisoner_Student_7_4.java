//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner_Student_7_4 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    public Prisoner_Student_7_4()//sobreposicao de construtor caso nao tenha valores iniciais
    {
   
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
        public void Display()
        {
        System.out.println("Nome: " + name);
        System.out.println("Altura: " + height + " m");
        System.out.println("Sentença: " + sentence + " anos");
    
        }
    
    public void Prisoner()//sobreposicao caso nao tenha nenhum valor no parametro da instancia
    {
        Display();
    }
    
    public void Prisoner(boolean b)//sobreposicao para caso tenha um valor no parametro da instancia
    {
        if(b)
        {
            think();
        }
           
    }
    
    
    
}
