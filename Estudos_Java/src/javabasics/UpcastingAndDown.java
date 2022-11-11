package javabasics;

public class UpcastingAndDown {
    public static void main(String[] args) {
        
        Heranca account1 = new Heranca(1233, "Rubao", 0.0);
        Heranca2 account2 = new Heranca2(5464, "Jao", 0.0, 100.0);

        //UPCASTING

        Heranca account3 = account2;
        //account1.getBalance();
        Heranca account4 = new Heranca2(3592, "Maria", 100.0, 1000.0);
        Heranca account5 = new Heranca3(6531, "Anna", 50.0, 0.01);

        //DOWNCASTING

        Heranca2 account6 = (Heranca2)account4;  // o account4 não é a superclasse(superclasse Heranca), instanciamos o Heranca2
        //funciona apenas a classes extends a super classe, nao funcionaria no Heranca2 para o Heranca3, para verificar usamos instanceof

        if (account5 instanceof Heranca2) {
            Heranca2 account7 = (Heranca2)account5; 
            account7.loan(100.0);
            System.out.println("Loan!");
        }

        if (account5 instanceof Heranca3) {
            Heranca3 account7 = (Heranca3)account5;
            account7.updateBalance();
            System.out.println("Update!");
        }
        System.out.println(account3);
        System.out.println(account1);
        System.out.println(account6);
    }
}
