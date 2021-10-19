package motor;
import java.util.Random;

public abstract class Motor {
    
    protected double displacement; 
    protected int nCylinder, power; 
    protected boolean fuel; //0 Diesel 1 Benzina

    /** 
     * @return double cilindrata motore
     */
    public double getDisplacement () {return this.displacement;}
    
    /** 
     * @return int numero dei cilindri
     */
    public int getCylinder () {return this.nCylinder;}
    
    /** 
     * @return int potenza calcolata
     */
    public int getPower () {return this.power;}

    /**
     * Metodo Costruttore classe astratta
     * @param displacement cilindrata del motore   
     * @param nCylinder numero di cilindri nel motore
     */
    public Motore (int displacement, int nCylinder)
    {
    	this.displacement = cilindrata;
    	this.nCylinder = cilindri;
    	//this.power = calculatePower();
    }

    public void viewInfo () {

        System.out.println("Numero di cilindri: " + this.nCylinder + "\n");
        System.out.println("Cilindrata" + this.displacement + "\n");
    }
}

public class GasolineMotor extends Motor {

    public int maxRPM () {return 7500;}

    /* 
        Metodo Costruttore classe concreta, con assegnazione parametro potenza
    */

    public Motore (int displacement, int nCylinder) {

        Random rand = new Random ();

        this.displacement = displacement; 
        this.nCylinder = nCylinder; 
        this.fuel = true; 

        this.power = rand.nextInt(1000); 
        //Random rand = new Random(); 
    }
}

public class DieselMotor extends Motor {

    public int maxRPM () {return 4000;}

    public Motore (int displacement, int nCylinder) {

        Random rand = new Random ();

        this.displacement = displacement; 
        this.nCylinder = nCylinder; 
        this.fuel = false; 

        this.power = rand.nextInt(1000); 
    }
}

