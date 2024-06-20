//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class PrisonTest_Student_7_4 {
    public static void main(String[] args){
        Prisoner_Student_7_4 p01 = new Prisoner_Student_7_4("Bubba", 2.08, 4);
        Prisoner_Student_7_4 p02 = new Prisoner_Student_7_4();
        
        
        System.out.println(p01.name);
        System.out.println(p02.name);
        
       
        p01.Prisoner();//sobreposicao de metodos, se nao tiver nada, aparece o primeiro metodo, se for verdadeiro aparece o metodo think()
    }
}
