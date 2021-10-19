package auto;

import optional.*;
import motori.*;

import jdk.isnternal.org.jline.terminal.impl.LineDisciplineTerminal;
public class Auto {
    
    //final int dimLicensePlate = 6; 

    protected String licensePlate; 
    protected String brandName, veichleName;

    protected Optional optionals [];
    protected Motore motore []; 

    public Auto (String licensePlate, String brandName, String veichleName, Motore motore) {

        this.brandName = brandName; 
        this.licensePlate = licensePlate; 
        this.motore = motore; 
        this.veichleName = veichleName; 
    }

    public void addOptional (Optional optionalToAdd) {

        if (optional == null) {
            optionals = new Optional [1]; 
            optional [0] = optionalToAdd;
        }

        /*Rigenerazione lista optional 
            Generazione array più lungo tramite operatore new
            copia del array sorgente tramite metodo arraycopy
            deposito nuovo optional su ultima cella array tmp
            attacco il nuovo array creato sul puntatore 
        */

        else {
            Optional tmp [] = new Optional [optional.lenght + 1];
            System.arraycopy(optionals, 0, tmp, 0, optionals.length); 
            tmp [tmp.length-1] = opt;
            optionals = tmp; 
        }
    }
}