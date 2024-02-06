package Controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ValidacionesCampos {
    //Atributos de captura del teclado
    private char Tecla;
    private int TeclaCapturada;
    private boolean numeroASCII;
    
    //Constructor por defecto
    public ValidacionesCampos(){
    }
    
    //Funcion para permitir solo numeros por teclado
    public String PermitirSoloNumeros(java.awt.event.KeyEvent evento){
        this.TeclaCapturada = evento.getKeyChar();
        this.numeroASCII = this.TeclaCapturada>=48 && this.TeclaCapturada<=57;
        
        if(!this.numeroASCII){
            evento.consume();
        }
        return ""+evento.getKeyChar();
    }
    
    public String PermitirSoloNumerosDecimales(java.awt.event.KeyEvent evento){
        this.TeclaCapturada = evento.getKeyChar();
        this.numeroASCII = this.TeclaCapturada>=48 && this.TeclaCapturada<=57 
                || this.TeclaCapturada==46;
        
        if(!this.numeroASCII){
            evento.consume();
        }
        return ""+evento.getKeyChar();
    }
    
    //Funcion para permitir solo letras con caracteres por teclado
    public void PermitirSoloLetras(java.awt.event.KeyEvent evento){
        this.TeclaCapturada = evento.getKeyChar();
//        System.out.println("Codigo ASCCI: "+this.TeclaCapturada);
//        System.out.println("Codigo ASCCI: "+evento.getKeyChar());
        String hola=""+evento.getKeyChar();
        boolean matches = hola.matches("^[a-zA-Z\\u00C0-\\u017F-\\s]+$");
//        System.out.println(matches);
        if(!matches){
            evento.consume();
        }
    }
    
    //Funcion para habilitar botones, verificando que no esten vacios x campos ni el index del combobox sea 0
    public void HabilitarBotones(JTextField[] Campos,JButton[] Botones, JComboBox[] CajaSelecciones){
        int VerificadorCamposLLenos= 0;
        
        for(int i=0; i<Campos.length; i++){
            if(!Campos[i].getText().isEmpty() && CajaSelecciones.length==ValidarSeleccionComboBox(CajaSelecciones)){
                VerificadorCamposLLenos++;
                if(VerificadorCamposLLenos==Campos.length){
                    for(int j=0; j<Botones.length; j++){
                        Botones[j].setEnabled(true);
                    }
                }
            }else{
                VerificadorCamposLLenos--;
                for(int j=0; j<Botones.length; j++){
                    Botones[j].setEnabled(false);
                }
            }
        }
    }
    
    public void HabilitarBotones(JTextField[] Campos,JButton[] Botones, JComboBox[] CajaSelecciones, JTextField campoADeshabilitar){
        int VerificadorCamposLLenos= 0;
        
        for(int i=0; i<Campos.length; i++){
            if(!Campos[i].getText().isEmpty() && CajaSelecciones.length==ValidarSeleccionComboBox(CajaSelecciones)){
                VerificadorCamposLLenos++;
                if(VerificadorCamposLLenos==Campos.length){
                    campoADeshabilitar.setEnabled(true);
                    for(int j=0; j<Botones.length; j++){
                        Botones[j].setEnabled(true);
                    }
                }
            }else{
                VerificadorCamposLLenos--;
                campoADeshabilitar.setEnabled(false);
                for(int j=0; j<Botones.length; j++){
                    Botones[j].setEnabled(false);
                }
            }
        }
    }
    
    //Sobrecarga para deshabilitar o habilitar botones segun x cantidad de campos
    public void HabilitarBotones(JTextField[] Campos,JButton[] Botones){
        /*Sobrecarga realizada por si luego se usa solo con JTextField y botones*/
        int VerificadorCamposLLenos= 0;
        
        for(int i=0; i<Campos.length; i++){
            if(!Campos[i].getText().isEmpty()){
                VerificadorCamposLLenos++;
                if(VerificadorCamposLLenos==Campos.length){
                    for(int j=0; j<Botones.length; j++){
                        Botones[j].setEnabled(true);
                    }
                }
            }else{
                VerificadorCamposLLenos--;
                for(int j=0; j<Botones.length; j++){
                    Botones[j].setEnabled(false);
                }
            }
        }
    }
    
    
    //Funcion para permitir numeros de x numero a z numero 
    public void PermitirUnRangoDeNumeros(Double num_Min, Double num_Max, JTextField campo,int largoCampoMinimo, java.awt.event.KeyEvent teclado){
        int largoCampo=campo.getText().length();
        
        try{
            Double NumeroDelCampo= Double.parseDouble(campo.getText());
            //System.out.println(largoCampo);
            //System.out.println("Length del txt ==> "+campo.getText().length());
            int numeroCapturado = Integer.parseInt(PermitirSoloNumerosDecimales(teclado));
            
            if(largoCampo > largoCampoMinimo){
                teclado.consume();
            }else{
                if(numeroCapturado<num_Min){
                    teclado.consume();
                }else if(NumeroDelCampo>num_Max){
                    //System.out.println("Si es mas grande");
                    campo.setText("");
                    teclado.consume();
                }
                /*if(largoCampo==1){
                    char NumeroPrimeraPosicion = campo.getText().charAt(0);
                    System.out.println("Numero en primera posicion => "+NumeroPrimeraPosicion);
                    if(Integer.parseInt(""+NumeroPrimeraPosicion)>num_Max){
                        System.out.println("Si es mas grande");
                        teclado.consume();
                    }
                era para probarlo con el KeyReleased mas sin embargo no funciono
                }*/
                campo.setText(PonerPuntoEnJTextField(campo));
            }
            //System.out.println("Numero capturado por teclado: "+numeroCapturado);
        }catch(Exception e){
        }
    }
    
        //Subfuncion para poner el punto automaticamente
        private String PonerPuntoEnJTextField(JTextField Campo){
            String campo = Campo.getText();

            if(campo.length()==1){
                campo=campo.substring(0,1)+".";
                //System.out.println("Valor con punto: "+campo);
            }
            return campo;
        }
    
    //Funcion para deshabilitar botones
    public void DeshabilitarBotones(JButton[] Botones, boolean Habilitado){
        if(Habilitado){
            for(int i=0; i<Botones.length; i++){
                Botones[i].setEnabled(true);
            }
        }else{
            for(int j=0; j<Botones.length; j++){
                Botones[j].setEnabled(false);
            }
        }
    }
    
    //Funcion para habilitar un boton verificando que el campo no sea nulo
    public void HabilitarUnBoton(JTextField Campo, JButton BotonADeshabilitar){
        if(!Campo.getText().isEmpty()){
            BotonADeshabilitar.setEnabled(true);
        }else{
            BotonADeshabilitar.setEnabled(false);
        }
    }
    //Funcion para habilitar un boton segun un campo y un tamanio minimo de caracteres
    public void HabilitarUnBoton(JTextField Campo,int MinLength,JButton BotonADeshabilitar){
        BotonADeshabilitar.setEnabled(false);
        
        if(!Campo.getText().isEmpty() && Campo.getText().length()>=MinLength){
            BotonADeshabilitar.setEnabled(true);
        }//Tiene que usarse con un ActionListener de KeyReleased
    }
    
    //Funcion para validar que el ComboBox este seleccionada una opcion
    public int ValidarSeleccionComboBox(JComboBox[] ComboBox){
        /*Esta funcion retornara el numero de selecciones que tengan los ComboBox (siempre y cuando), 
        cada vez que un campo en su seleccion del index sea diferente de 0, entonces 
        cantidadDeIgualdades sumara un punto. Si cantidadDeIgualdades es igual al tamaño del 
        comboBox, entonces todos los ComboBox tienen un indice de seleccion diferente de 0
        */
        int cantidadDeSelecciones=0;
        for(int i=0; i< ComboBox.length; i++){
            if(ComboBox[i].getSelectedIndex()!=0){
                cantidadDeSelecciones++;
            }else{
                cantidadDeSelecciones--;
            }
        }
        return cantidadDeSelecciones;
        
        //En el llamado a esta funcion, seria validar que el ComboBox de la otra funcion
                //tenga el mismo tamaño del que retorne esta funcion
    }    
}