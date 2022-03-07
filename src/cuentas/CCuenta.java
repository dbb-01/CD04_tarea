
package cuentas;
/**Prueba Javadoc
 * 
 * @author diego
 * @version 1.0
 */



public class CCuenta {
    
    /**nombre del usuario*/
    private String nombre;
    
    /**cuenta del cliente*/
    private String cuenta;
    
    private double saldo;
    private double tipoInterés;
    
    /** @return el nombre del cliente*/
   
    
    /** @param n es el nombre que se le quiere dar*/
    
    /** @return cuenta del cliente*/
    public String getCuenta(){
        return cuenta;
    }
    
    /**Fija la cuenta
     * 
     * @param c es la cuenta
     */
    public void setCuenta(String c){
        this.cuenta=c;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
    
    public double getTipodeinteres(){
        return tipoInterés;
    }
    public void setTipodeinteres(double ti){
        this.tipoInterés=ti;
    }
    public CCuenta()
    {
    }

    /**Constructor de cuentas*/
    public CCuenta(String nom, String cue, double sal, double tipo) 
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /* @return saldo de la cuenta*/
    public double estado()
    {
        return saldo;
    }

    /**Ingresa dinero en cuenta*/
    public void ingresar(double cantidad) throws Exception 
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**Retira dinero de la cuenta*/
    public void retirar(double cantidad) throws Exception 
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**Método usado en el main*/
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad){ 
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print(FALLO_AL_RETIRAR);
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    
}
    private static final String FALLO_AL_RETIRAR = "Fallo al retirar";

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }/*8*/
}
