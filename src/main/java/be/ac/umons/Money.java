//Rajouter dans les variables d'environnement les chemins de Maven et de Java
//et rajouter dans Path les même chemins avec \bin

package be.ac.umons;
public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int amount() {

        return this.amount;
    }

    public String currency(){

        return this.currency;
    }



    /**
     *
     *
     * Question 2 : Création de la méthode add(Money m) qui retourne un objet Money
     *
     *
     */

    public Money add(Money m) throws Exception{

        if(this.currency().equals(m.currency())){
            return new Money (this.amount()+m.amount(),this.currency());
        }
        throw new Exception("Not Same currency");
    }


    /**
     *
     *
     * Question 2 : Le retour de cette fonction sera un objet Money; Voir le "comment 10"
     *
     * /


     public Money add(int namount, String currency) throws Exception{

     /**
     *  Comment 10 /
     *
     *  return this.add(new Money(namount, currency));
     */

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
