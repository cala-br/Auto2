package optional;

public class Optional {

    protected String descriptionOptional; 
    protected double priceOptional; 
    protected int codeOptional; 

    public Optional (string description, double price, int code) {

        this.codeOptional = code; 
        
        if (description != null)
            {this.descriptionOptional = stringValueof(descriptionOptional); }

        else
            this.descriptionOptional = "Descrizione non disponibile"; 
        
        this.priceOptional = price; 
    } 

    public toString () {
        System.out.println("Optional Code: " + codeOptional + "\t Prezzo: " + priceOptional + "\n" + descriptionOptional + "\n");
    }
}