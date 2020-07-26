package proyecto1jframe;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Locaciondeventana extends JFrame {      //Ventana Principal
    //----------------------------------------------------------------------------------------
        public Locaciondeventana(){
        this.setSize(500, 500); 
        setTitle("Calculadora de MRU de un triangulo");
        setBounds(575, 230, 650,410);
        setLocationRelativeTo(null);
        Componentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Se sale del programa apenas cierras la ventana
        
        }
        
        
private void Componentes(){                      // Panel Principal
    JPanel PanelPrincipal = new JPanel();
    PanelPrincipal.setVisible(true);
    //PanelPrincipal.setBackground(Color.YELLOW);     
    this.getContentPane().add(PanelPrincipal);
    PanelPrincipal.setLayout(null);
//Etiquetas
JLabel ETitulo = new JLabel();
JLabel ESubtitulo = new JLabel();
JLabel EDistancia = new JLabel();
JLabel ETiempo = new JLabel();
JLabel EVelocidad = new JLabel();
//Fin de etiquetas
//------------------------------------------------------------- Titulo del panel
ETitulo.setText("Hallar el MRU de un triangulo");
ETitulo.setLayout(null);
ETitulo.setFont(new Font("Consolas",1,22));
ETitulo.setHorizontalAlignment(SwingConstants.CENTER);
ETitulo.setBounds(120,10,400,50);
ETitulo.setForeground(Color.BLACK);
ETitulo.setOpaque(true);
//ETitulo.setBackground(Color.GREEN);
//---------------------------------------------------------------Fin de tu titulo del panel
//-------------------------------------------------------------- Subtitulo del panel
ESubtitulo.setText("Escoja la incognita que desea hallar ");
ESubtitulo.setLayout(null);
ESubtitulo.setFont(new Font("Consolas",1,15));
ESubtitulo.setHorizontalAlignment(SwingConstants.LEFT);
ESubtitulo.setBounds(10,67,400,50);
ESubtitulo.setForeground(Color.BLACK);
ESubtitulo.setOpaque(true);
//ETitulo.setBackground(Color.GREEN);
//-------------------------------------------------------------- Fin Subtitulo del panel
//----------------------------------------------------------------Etiqueta de la distancia
EDistancia.setText("Escriba la distancia :");
EDistancia.setLayout(null);
EDistancia.setFont(new Font("Consolas",1,14));
EDistancia.setHorizontalAlignment(SwingConstants.LEFT);
EDistancia.setBounds(20,150,180,30);
EDistancia.setForeground(Color.BLACK);
EDistancia.setOpaque(true);
//EDistancia.setBackground(Color.CYAN);
//----------------------------------------------------------------Fin de la etiqueta de la distancia
//----------------------------------------------------------------Etiqueta del tiempo
ETiempo.setText("Escriba el tiempo :");
ETiempo.setLayout(null);
ETiempo.setFont(new Font("Consolas",1,14));
ETiempo.setHorizontalAlignment(SwingConstants.LEFT);
ETiempo.setBounds(20,190,160,30);
ETiempo.setForeground(Color.BLACK);
ETiempo.setOpaque(true);
//ETiempo.setBackground(Color.ORANGE);
//----------------------------------------------------------------Fin de la etiqueta del tiempo
//---------------------------------------------------------------Etiqueta de velocidad
EVelocidad.setText("Escriba la velocidad :");
EVelocidad.setLayout(null);
EVelocidad.setFont(new Font("Consolas",1,14));
EVelocidad.setHorizontalAlignment(SwingConstants.LEFT);
EVelocidad.setBounds(20,230,200,30);
EVelocidad.setForeground(Color.BLACK);
EVelocidad.setOpaque(true);
//EVelocidad.setBackground(Color.GREEN);
//-------------------------------------------------------------------Fin de etiqueta de velocidad
//Comienzo a poner las campos de texto de cada una de las variables chidas                CAMPOS DE TEXTO
JTextField AreaDistancia = new JTextField();
JTextField AreaTiempo = new JTextField();
JTextField AreaVelocidad = new JTextField();
AreaDistancia.setEditable(true);
AreaTiempo.setEditable(true);
AreaVelocidad.setEditable(true);
AreaDistancia.setBounds(200,150,180,30);
AreaTiempo.setBounds(180,190,178,30);
AreaVelocidad.setBounds(200,230,200,30);
//------------------------------------------------------------------------ Etiqueta de Respuesta brutal
JLabel Respuesta = new JLabel();
Respuesta.setText("");
Respuesta.setLayout(null);
Respuesta.setFont(new Font("Consolas",1,18));
Respuesta.setHorizontalAlignment(SwingConstants.CENTER);
Respuesta.setBounds(320,325,250,40);
Respuesta.setForeground(Color.RED);
Respuesta.setOpaque(true);
Respuesta.setBackground(Color.white);
//------------------------------------------------------------------- Creacion de boton Calcular
JButton BotonCalcular = new JButton();
BotonCalcular.setText("Calcular");
BotonCalcular.setBounds(100,325,100,40);
//--------------------------------------------------------------------Fin de creacion de boton
//--------------------------------------------------------------------Creacion de lista de incognitas

String[] incognitas = {"Distancia","Tiempo","Velocidad"};
        JComboBox ListaIncognita = new JComboBox(incognitas);
        ListaIncognita.setBounds(315, 75, 100,30);
        //ListaIncognita.addItem("Alguna otra incognita");
        ListaIncognita.setSelectedItem(null);
//---------------------------------------------------------------------------Fin de creacion de lista de incognita        
//---------------------------------------------------------------------- Creacion de oyente de items para deshabilitar un cuadro de texto cuando se seleccione
ItemListener Oyentedecaja = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
            String Itemdelacaja = (String) ListaIncognita.getSelectedItem();
            
switch(Itemdelacaja){     

    case "Distancia":
        AreaDistancia.setEditable(false);
        AreaDistancia.setBackground(Color.GRAY);
        AreaTiempo.setBackground(Color.WHITE);
        AreaTiempo.setEditable(true);
        AreaVelocidad.setBackground(Color.WHITE);
        AreaVelocidad.setEditable(true);
    break;
    case "Tiempo":
        AreaTiempo.setEditable(false);
        AreaTiempo.setBackground(Color.GRAY);
        AreaVelocidad.setBackground(Color.WHITE);
        AreaVelocidad.setEditable(true);
        AreaDistancia.setBackground(Color.WHITE);
        AreaDistancia.setEditable(true);
    break;
    case "Velocidad":
        AreaVelocidad.setEditable(false);    
        AreaVelocidad.setBackground(Color.GRAY);
        AreaTiempo.setBackground(Color.WHITE);
        AreaTiempo.setEditable(true);
        AreaDistancia.setBackground(Color.WHITE);
        AreaDistancia.setEditable(true);
    break;
    default:
    break;  
}
        }
    };
ListaIncognita.addItemListener(Oyentedecaja);
//------------------------------------------------------------------------Fin creacion de oyente de items        
//----------------------------------------------------------------------------- Fin de creacion de lista de incognitas
//Inicio de oyente------------------------------------------------------------------------------------
    @SuppressWarnings("Convert2Lambda")
ActionListener OyenteDeClicks = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            double VDistancia,VTiempo,VVelocidad;
            String Itemdelacaja = (String) ListaIncognita.getSelectedItem();
            if(Itemdelacaja == null || Itemdelacaja.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error escoje una incognita");
            }else 
            
           
switch(Itemdelacaja){
    
    case "Distancia":
        VDistancia = (Double.parseDouble(AreaTiempo.getText()) * Double.parseDouble(AreaVelocidad.getText())) ;
        Respuesta.setText("La respuesta es : "+String.valueOf(VDistancia));
    break;
        
    case "Tiempo":  
        VTiempo = (Double.parseDouble(AreaDistancia.getText()) * Double.parseDouble(AreaVelocidad.getText())) ;
        Respuesta.setText("La respuesta es : "+String.valueOf(VTiempo));
    break;    
    case "Velocidad":
        VVelocidad = (Double.parseDouble(AreaDistancia.getText()) / Double.parseDouble(AreaTiempo.getText())) ;
        Respuesta.setText("La respuesta es : "+String.valueOf(VVelocidad));
    break;    
    
    default: 
       
    break;
}      
        }
        
    };
BotonCalcular.addActionListener(OyenteDeClicks);
//Fin de oyente del boton de calcular----------------------------------------------------------------------
//---------------------------------------- Adicion de objetos al panel principal para que se muestre en el metodo principal "Proyecto1JFrame"
PanelPrincipal.add(ListaIncognita);
//-----------------------------------------
PanelPrincipal.add(Respuesta);
//----------------------------------------
PanelPrincipal.add(BotonCalcular);
//----------------------------------------
PanelPrincipal.add(AreaDistancia);
PanelPrincipal.add(AreaTiempo);
PanelPrincipal.add(AreaVelocidad);
//----------------------------------------
PanelPrincipal.add(ETitulo);
PanelPrincipal.add(EDistancia);
PanelPrincipal.add(ETiempo);
PanelPrincipal.add(EVelocidad);
PanelPrincipal.add(ESubtitulo);

    }
}