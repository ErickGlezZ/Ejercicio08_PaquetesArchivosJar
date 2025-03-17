package edu.tecjerez.topicos.vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;

import edu.tecjerez.topicos.figuras.dosdimensiones.*;
import edu.tecjerez.topicos.figuras.tresdimensiones.*;
import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.figuras.Rectangulo;


public class VentanaInicio extends JFrame implements ActionListener{
	//NO SE PUEDE UTILIZAR YA QUE TIENE UN MODIFICADOR DE ACCESO
	//QUE IMPIDE SU VISUALIZACION (DEFAULT)
	//Circulo c1 = new Circulo();
	
	Triangulo triangulo1 = new Triangulo();
	
	Rectangulo rectangulo1 = new Rectangulo();
	
	Conicos.Circulo circulo1 = new Conicos().new Circulo();
	Conicos.Elipse elipse1 = new Conicos().new Elipse();
	
	Poligono.Rombo rombo1 = new Poligono().new Rombo();
	
	Cono cono1 = new Cono();

	Piramide piramide1 = new Piramide();
	
	
	JMenuBar menuBar;
	JMenu menufiguras2D, menufiguras3D;
	JMenuItem itemTriangulo, itemRectangulo, itemCirculo, itemElipse, itemRombo, itemCono, itemPiramide;
	JInternalFrame IF_Triangulo, IF_Rectangulo, IF_Circulo, IF_Elipse, IF_Rombo, IF_Cono, IF_Piramide;
	JPanel plTriangulo, plRectangulo, plCirculo, plElipse, plRombo, plCono, plPiramide;
	JLabel txtFigSelec, txtEspecificaciones, txtHeron, txtArea, txtBase, txtAltura, txtLadoA, txtLadoB, txtLadoC, txtSemiejeMay, txtSemiejeMen, txtRadio, txtLado, txtApotema, txtDiagMayor, txtDiagMenor, txtPerimetro, txtVolumen, txtResultados;
	JComboBox<String> cbPiramides;
	
	JTextField cajaAreaTriangulo, cajaAreaRectangulo, cajaAreaCirculo, cajaAreaElipse, cajaAreaRombo, cajaAreaCono,
	cajaPerimetroTr, cajaPerimetroRec, cajaPerimetroCir, cajaPerimetroElip, cajaPerimetroRom, cajaPerimetroCono, cajaPerimetroPirCuadrada, cajaPerimetroPirRectangular, cajaPerimetroPirTriangular,
	cajaVolumenCono, cajaVolumenPirCuadrada, cajaVolumenPirRectangular, cajaVolumenPirTriangular, 
	cajaBaseTri, cajaBaseRec, cajaBasePirRectangular, cajaBasePirCuadrada, cajaBasePirTriangular,
	cajaAreaPirCuadrada, cajaAreaPirTriangular, cajaAreaPirRectangular,
	cajaAlturaRec, cajaAlturaCono, cajaAlturaPirRectangular, cajaAltura3, cajaAltura4, cajaAltura5, cajaAltura6, cajaLadoA, cajaLadoB, cajaLadoC, cajaRadioCir, cajaRadioCono, cajaSemiejeMay, cajaSemiejeMen, cajaDiagMayor, cajaDiagMenor, cajaLadoPirCuadrada, cajaLadoPirRectangular, cajaLadoPirTriangular, cajaApotema;
	JButton btnCalcular7, btnCalcular8, btnCalcular9, btnRestablecer1, btnRestablecer2, btnRestablecer3, btnRestablecer4, btnRestablecer5, btnRestablecer6, btnRestablecer7, btnRestablecer8, btnRestablecer9, btnRestablecer10;
	
	
	public VentanaInicio() {
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MENÚ FIGURAS");
		setSize(500, 500);		
		setLocationRelativeTo(null);  //centar
		setVisible(true); //para q se vea la ventana
		
		menuBar = new JMenuBar();
		menufiguras2D = new JMenu("Figuras 2D");
		
		itemTriangulo = new JMenuItem("Triangulo");
		menufiguras2D.add(itemTriangulo);
		itemTriangulo.addActionListener(this);
		
		
		itemRectangulo = new JMenuItem("Rectangulo");
		menufiguras2D.add(itemRectangulo);
		itemRectangulo.addActionListener(this);
		
		itemCirculo = new JMenuItem("Circulo");
		menufiguras2D.add(itemCirculo);
		itemCirculo.addActionListener(this);
		
		itemElipse = new JMenuItem("Elipse");
		menufiguras2D.add(itemElipse);
		itemElipse.addActionListener(this);
		
		itemRombo = new JMenuItem("Rombo");
		menufiguras2D.add(itemRombo);
		itemRombo.addActionListener(this);
		
		menuBar.add(menufiguras2D);
		
		
		menufiguras3D = new JMenu("Figuras 3D");
		
		itemCono = new JMenuItem("Cono");
		menufiguras3D.add(itemCono);
		itemCono.addActionListener(this);
		
		itemPiramide = new JMenuItem("Piramide");
		menufiguras3D.add(itemPiramide);
		itemPiramide.addActionListener(this);
		
		menuBar.add(menufiguras3D);	
		setJMenuBar(menuBar);
		//btnCalcular.addActionListener(this);
		
		JDesktopPane desktopPane = new JDesktopPane();
		//inicia IF_Triangulo
		IF_Triangulo = new JInternalFrame("IF_TRIANGULO", true, true, true, true);
		IF_Triangulo.setSize(400,400); 
		/*
		IF_Triangulo.setClosable(true);
		IF_Triangulo.setMaximizable(true);
		IF_Triangulo.setIconifiable(true);
		IF_Triangulo.setResizable(true);
		*/
		IF_Triangulo.setDefaultCloseOperation(HIDE_ON_CLOSE); //para que se pueda seguir abriendo
		//figTriangulo.getContentPane().setLayout(null);
		
		plTriangulo = new JPanel();
		plTriangulo.setLayout(null);
		
		txtFigSelec = new JLabel("Seleccionaste el Triangulo!");
		agregarComponente(plTriangulo, txtFigSelec, 10, 10, 170, 20);
		
		txtHeron = new JLabel("Calculado por formula de Heron");
		agregarComponente(plTriangulo, txtHeron, 10, 25, 200, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de sus TRES lados");
		agregarComponente(plTriangulo, txtEspecificaciones, 10, 45, 200, 20);
		
		txtLadoA = new JLabel("Lado A:");
		agregarComponente(plTriangulo, txtLadoA, 10, 65, 100, 20);
		
		cajaLadoA = new JTextField(5);
		agregarComponente(plTriangulo, cajaLadoA, 80, 68, 100, 20);
		
		txtLadoB = new JLabel("Lado B:");
		agregarComponente(plTriangulo, txtLadoB, 10, 90, 100, 20);
		
		cajaLadoB = new JTextField(5);
		agregarComponente(plTriangulo, cajaLadoB, 80, 91, 100, 20);
		
		txtLadoC = new JLabel("Lado C:");
		agregarComponente(plTriangulo, txtLadoC, 10, 115, 100, 20);
		
		cajaLadoC = new JTextField(5);
		agregarComponente(plTriangulo, cajaLadoC, 80, 114, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plTriangulo, txtResultados, 10, 150, 100, 20);
			
		txtArea = new JLabel("Area:");
		agregarComponente(plTriangulo, txtArea, 10, 170, 100, 20);
		
		cajaAreaTriangulo = new JTextField(5);
		agregarComponente(plTriangulo, cajaAreaTriangulo, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plTriangulo, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroTr = new JTextField(5);
		agregarComponente(plTriangulo, cajaPerimetroTr, 85, 196, 100, 20);
	
		//btnCalcular = new JButton("Calcular");
		//agregarComponente(plTriangulo, btnCalcular, 80, 230, 100, 20);
		
		
		IF_Triangulo.add(plTriangulo, BorderLayout.CENTER);
		
		desktopPane.add(IF_Triangulo);
		
	
		JButton btnCalcularTriangulo = new JButton("Calcular");
		agregarComponente(plTriangulo, btnCalcularTriangulo, 80, 230, 100, 20);
		
		btnRestablecer1 = new JButton("Restablecer");
		agregarComponente(plTriangulo, btnRestablecer1, 185, 230, 110, 20);

		btnCalcularTriangulo.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	 try {
		             // Verificar si los campos no están vacíos
		             String textoLadoA = cajaLadoA.getText();
		             String textoLadoB = cajaLadoB.getText();
		             String textoLadoC = cajaLadoC.getText();
		             
		             cajaAreaTriangulo.setEnabled(false);
		             
		             cajaPerimetroTr.setEnabled(false);
		             
		             if (textoLadoA.isEmpty() || textoLadoB.isEmpty() || textoLadoC.isEmpty()) {
		                 JOptionPane.showMessageDialog(null, "Por favor ingrese todos los lados.");
		                 return;
		             }

		             // Intentar convertir a double
		             double ladoA = Double.parseDouble(textoLadoA);
		             double ladoB = Double.parseDouble(textoLadoB);
		             double ladoC = Double.parseDouble(textoLadoC);

		             // Realizar los cálculos
		             double perimetro = triangulo1.semiPerimetroTriangulo(ladoA, ladoB, ladoC);
		             double area = triangulo1.areaTriangulo(ladoA, ladoB, ladoC);

		             // Mostrar resultados
		             //cajaPerimetroTr.setText(String.valueOf(perimetro));
		             cajaAreaTriangulo.setText(String.format("%.2f", area));
		             cajaPerimetroTr.setText(String.format("%.2f", perimetro));
		             
		         } catch (NumberFormatException ex) {
		             JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos válidos.");
		         } catch (Exception ex) {
		             JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		         }
		     }
		});
		
		btnRestablecer1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        cajaLadoA.setText("");
		        cajaLadoB.setText("");
		        cajaLadoC.setText("");
		        cajaAreaTriangulo.setText("");
		        cajaPerimetroTr.setText("");
		        
		    }
		});
		//termina IF_Triangulo
		
		
		
		// inicia IF_Rectangulo
		IF_Rectangulo = new JInternalFrame("IF_RECTANGULO", true, true, true, true);
		IF_Rectangulo.setSize(400, 400);
		IF_Rectangulo.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		plRectangulo = new JPanel();
		plRectangulo.setLayout(null);
		
		txtFigSelec = new JLabel("Seleccionaste el Rectangulo!");
		agregarComponente(plRectangulo, txtFigSelec, 10, 10, 170, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de su BASE y su ALTURA");
		agregarComponente(plRectangulo, txtEspecificaciones, 10, 45, 230, 20);
		
		txtBase = new JLabel("Base:");
		agregarComponente(plRectangulo, txtBase, 10, 65, 100, 20);
		
		cajaBaseRec = new JTextField(5);
		agregarComponente(plRectangulo, cajaBaseRec, 80, 68, 100, 20);
		
		txtAltura = new JLabel("Altura:");
		agregarComponente(plRectangulo, txtAltura, 10, 90, 100, 20);
		
		cajaAlturaRec = new JTextField(5);
		agregarComponente(plRectangulo, cajaAlturaRec, 80, 91, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plRectangulo, txtResultados, 10, 150, 100, 20);
		
		txtArea = new JLabel("Area:");
		agregarComponente(plRectangulo, txtArea, 10, 170, 100, 20);
		
		cajaAreaRectangulo = new JTextField(5);
		agregarComponente(plRectangulo, cajaAreaRectangulo, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plRectangulo, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroRec = new JTextField(5);
		agregarComponente(plRectangulo, cajaPerimetroRec, 85, 196, 100, 20);
		
	
		
		IF_Rectangulo.add(plRectangulo, BorderLayout.CENTER);
		
		desktopPane.add(IF_Rectangulo);
		
		add(desktopPane, BorderLayout.CENTER);
		
		
		
		JButton btnCalcularRectangulo = new JButton("Calcular");
		agregarComponente(plRectangulo, btnCalcularRectangulo, 80, 230, 100, 20);
		
		btnRestablecer2 = new JButton("Restablecer");
		agregarComponente(plRectangulo, btnRestablecer2, 185, 230, 110, 20);

		btnCalcularRectangulo.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double base = Double.parseDouble(cajaBaseRec.getText());
		            double altura = Double.parseDouble(cajaAlturaRec.getText());

		            double perimetro = rectangulo1.perimetroRectangulo(base, altura);
		            double area = rectangulo1.areaRectangulo(base, altura);
		            
		            cajaAreaRectangulo.setEnabled(false);
		             
		            cajaPerimetroRec.setEnabled(false);

		            cajaPerimetroRec.setText(String.format("%.2f",perimetro));
		            cajaAreaRectangulo.setText(String.format("%.2f",area));
		        } catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		        }
		    }
		});
		
		btnRestablecer2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        cajaBaseRec.setText("");
		        cajaAlturaRec.setText("");
		        cajaAreaRectangulo.setText("");
		        cajaPerimetroRec.setText("");
		        
		    }
		});
		// termina IF_Rectangulo
		
		// inicia IF_Circulo
		IF_Circulo = new JInternalFrame("IF_CIRCULO", true, true, true, true);
		IF_Circulo.setSize(400, 400);
		IF_Circulo.setDefaultCloseOperation(HIDE_ON_CLOSE);
				
		plCirculo = new JPanel();
		plCirculo.setLayout(null);
				
		txtFigSelec = new JLabel("Seleccionaste el Circulo!");
		agregarComponente(plCirculo, txtFigSelec, 10, 10, 170, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de su RADIO");
		agregarComponente(plCirculo, txtEspecificaciones, 10, 45, 230, 20);
		
		txtRadio = new JLabel("Radio:");
		agregarComponente(plCirculo, txtRadio, 10, 65, 100, 20);
		
		cajaRadioCir = new JTextField(5);
		agregarComponente(plCirculo, cajaRadioCir, 80, 68, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plCirculo, txtResultados, 10, 150, 100, 20);
		
		txtArea = new JLabel("Area:");
		agregarComponente(plCirculo, txtArea, 10, 170, 100, 20);
		
		cajaAreaCirculo = new JTextField(5);
		agregarComponente(plCirculo, cajaAreaCirculo, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plCirculo, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroCir = new JTextField(5);
		agregarComponente(plCirculo, cajaPerimetroCir, 85, 196, 100, 20);
		
		
				
		IF_Circulo.add(plCirculo, BorderLayout.CENTER);
				
		desktopPane.add(IF_Circulo);
				
		add(desktopPane, BorderLayout.CENTER);
		
		
		
		
		JButton btnCalcularCirculo = new JButton("Calcular");
		agregarComponente(plCirculo, btnCalcularCirculo, 80, 230, 100, 20);
		
		btnRestablecer3 = new JButton("Restablecer");
		agregarComponente(plCirculo, btnRestablecer3, 185, 230, 110, 20);

		btnCalcularCirculo.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double radio = Double.parseDouble(cajaRadioCir.getText());

		            double perimetro = circulo1.perimetroCirculo(radio);
		            double area = circulo1.areaCirculo(radio);
		            
		            cajaAreaCirculo.setEnabled(false);
		             
		            cajaPerimetroCir.setEnabled(false);
		            
		            cajaPerimetroCir.setText(String.format("%.2f",perimetro));
		            cajaAreaCirculo.setText(String.format("%.2f",area));
		        } catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		        }
		    }
		});
		
		btnRestablecer3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        cajaRadioCir.setText("");
		        cajaAreaCirculo.setText("");
		        cajaPerimetroCir.setText("");
		        
		    }
		});
		// termina IF_Circulo
		
		// inicia IF_Elipse
		IF_Elipse = new JInternalFrame("IF_ELIPSE", true, true, true, true);
		IF_Elipse.setSize(400, 400);
		IF_Elipse.setDefaultCloseOperation(HIDE_ON_CLOSE);
						
		plElipse = new JPanel();
		plElipse.setLayout(null);
						
		txtFigSelec = new JLabel("Seleccionaste la Elipse!");
		agregarComponente(plElipse, txtFigSelec, 10, 10, 170, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de sus semiejes MAYOR y MENOR");
		agregarComponente(plElipse, txtEspecificaciones, 10, 45, 300, 20);
		
		txtSemiejeMay = new JLabel("Semieje Mayor:");
		agregarComponente(plElipse, txtSemiejeMay, 10, 65, 100, 20);
		
		cajaSemiejeMay = new JTextField(5);
		agregarComponente(plElipse, cajaSemiejeMay, 110, 68, 100, 20);
		
		txtSemiejeMen = new JLabel("Semieje Menor:");
		agregarComponente(plElipse, txtSemiejeMen, 10, 90, 100, 20);
		
		cajaSemiejeMen = new JTextField(5);
		agregarComponente(plElipse, cajaSemiejeMen, 110, 91, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plElipse, txtResultados, 10, 150, 100, 20);
		
		txtArea = new JLabel("Area:");
		agregarComponente(plElipse, txtArea, 10, 170, 100, 20);
		
		cajaAreaElipse = new JTextField(5);
		agregarComponente(plElipse, cajaAreaElipse, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plElipse, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroElip = new JTextField(5);
		agregarComponente(plElipse, cajaPerimetroElip, 85, 196, 100, 20);
		
		
		
		IF_Elipse.add(plElipse, BorderLayout.CENTER);
						
		desktopPane.add(IF_Elipse);
						
		add(desktopPane, BorderLayout.CENTER);
		

		// Luego el botón
		JButton btnCalcularElipse = new JButton("Calcular");
		agregarComponente(plElipse, btnCalcularElipse, 80, 230, 100, 20);
		
		btnRestablecer4 = new JButton("Restablecer");
		agregarComponente(plElipse, btnRestablecer4, 185, 230, 110, 20);

		btnCalcularElipse.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double semiejeMayor = Double.parseDouble(cajaSemiejeMay.getText());
		            double semiejeMenor = Double.parseDouble(cajaSemiejeMen.getText());

		            double perimetro = elipse1.perimetroElipse(semiejeMayor, semiejeMenor);
		            double area = elipse1.areaElipse(semiejeMayor, semiejeMenor);

		            cajaAreaElipse.setEnabled(false);
		             
		            cajaPerimetroElip.setEnabled(false);
		            
		            cajaPerimetroElip.setText(String.format("%.2f",perimetro));
		            cajaAreaElipse.setText(String.format("%.2f",area));
		        } catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		        }
		    }
		});
		
		btnRestablecer4.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        cajaSemiejeMay.setText("");
		        cajaSemiejeMen.setText("");
		        cajaAreaElipse.setText("");
		        cajaPerimetroElip.setText("");
		        
		    }
		});
		// termina IF_Elipse
		
		// inicia IF_Rombo
		IF_Rombo = new JInternalFrame("IF_ROMBO", true, true, true, true);
		IF_Rombo.setSize(400, 400);
		IF_Rombo.setDefaultCloseOperation(HIDE_ON_CLOSE);
						
		plRombo = new JPanel();
		plRombo.setLayout(null);
						
		txtFigSelec = new JLabel("Seleccionaste el Rombo!");
		agregarComponente(plRombo, txtFigSelec, 10, 10, 170, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de sus diagonales MAYOR y MENOR");
		agregarComponente(plRombo, txtEspecificaciones, 10, 45, 300, 20);
		
		txtDiagMayor = new JLabel("Diagonal Mayor:");
		agregarComponente(plRombo, txtDiagMayor, 10, 65, 100, 20);
		
		cajaDiagMayor = new JTextField(5);
		agregarComponente(plRombo, cajaDiagMayor, 110, 68, 100, 20);
		
		txtDiagMenor = new JLabel("Diagonal Menor:");
		agregarComponente(plRombo, txtDiagMenor, 10, 90, 100, 20);
		
		cajaDiagMenor = new JTextField(5);
		agregarComponente(plRombo, cajaDiagMenor, 110, 91, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plRombo, txtResultados, 10, 150, 100, 20);
		
		txtArea = new JLabel("Area:");
		agregarComponente(plRombo, txtArea, 10, 170, 100, 20);
		
		cajaAreaRombo = new JTextField(5);
		agregarComponente(plRombo, cajaAreaRombo, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plRombo, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroRom = new JTextField(5);
		agregarComponente(plRombo, cajaPerimetroRom, 85, 196, 100, 20);
		
		
						
		IF_Rombo.add(plRombo, BorderLayout.CENTER);
						
		desktopPane.add(IF_Rombo);
						
		add(desktopPane, BorderLayout.CENTER);
		
		
		
		JButton btnCalcularRombo = new JButton("Calcular");
		agregarComponente(plRombo, btnCalcularRombo, 80, 230, 100, 20);
		
		btnRestablecer5 = new JButton("Restablecer");
		agregarComponente(plRombo, btnRestablecer5, 185, 230, 110, 20);

		btnCalcularRombo.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double diagonalMayor = Double.parseDouble(cajaDiagMayor.getText());
		            double diagonalMenor = Double.parseDouble(cajaDiagMenor.getText());

		            double perimetro = rombo1.perimetroRombo(diagonalMayor, diagonalMenor);
		            double area = rombo1.areaRombo(diagonalMayor, diagonalMenor);

		            cajaAreaRombo.setEnabled(false);
		             
		            cajaPerimetroRom.setEnabled(false);
		            
		            cajaPerimetroRom.setText(String.format("%.2f",perimetro));
		            cajaAreaRombo.setText(String.format("%.2f",area));
		        } catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		        }
		    }
		});
		
		btnRestablecer5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        cajaDiagMayor.setText("");
		        cajaDiagMenor.setText("");
		        cajaAreaRombo.setText("");
		        cajaPerimetroRom.setText("");
		        
		    }
		});
		// termina IF_Rombo
		
		// inicia IF_Cono
		IF_Cono = new JInternalFrame("IF_CONO", true, true, true, true);
		IF_Cono.setSize(400, 400);
		IF_Cono.setDefaultCloseOperation(HIDE_ON_CLOSE);
						
		plCono = new JPanel();
		plCono.setLayout(null);
						
		txtFigSelec = new JLabel("Seleccionaste el Cono!");
		agregarComponente(plCono, txtFigSelec, 10, 10, 170, 20);
		
		txtEspecificaciones = new JLabel("Ingresa el valor de su RADIO y ALTURA");
		agregarComponente(plCono, txtEspecificaciones, 10, 45, 230, 20);
		
		txtRadio = new JLabel("Radio:");
		agregarComponente(plCono, txtRadio, 10, 65, 100, 20);
		
		cajaRadioCono = new JTextField(5);
		agregarComponente(plCono, cajaRadioCono, 80, 68, 100, 20);
		
		txtAltura = new JLabel("Altura:");
		agregarComponente(plCono, txtAltura, 10, 90, 100, 20);
		
		cajaAlturaCono = new JTextField(5);
		agregarComponente(plCono, cajaAlturaCono, 80, 91, 100, 20);
		
		txtResultados = new JLabel("Resultados");
		agregarComponente(plCono, txtResultados, 10, 150, 100, 20);
		
		txtArea = new JLabel("Area:");
		agregarComponente(plCono, txtArea, 10, 170, 100, 20);
		
		cajaAreaCono = new JTextField(5);
		agregarComponente(plCono, cajaAreaCono, 85, 173, 100, 20);
		
		txtPerimetro = new JLabel("Perimetro:");
		agregarComponente(plCono, txtPerimetro, 10, 195, 100, 20);
		
		cajaPerimetroCono = new JTextField(5);
		agregarComponente(plCono, cajaPerimetroCono, 85, 196, 100, 20);
		
		txtVolumen = new JLabel("Volumen:");
		agregarComponente(plCono, txtVolumen, 10, 220, 100, 20);

		cajaVolumenCono = new JTextField(5);
		agregarComponente(plCono, cajaVolumenCono, 85, 221, 100, 20);
		
		
						
		IF_Cono.add(plCono, BorderLayout.CENTER);
						
		desktopPane.add(IF_Cono);
						
		add(desktopPane, BorderLayout.CENTER);
		
		
		
		txtVolumen = new JLabel("Volumen:");
		agregarComponente(plCono, txtVolumen, 10, 220, 100, 20);

		cajaVolumenCono = new JTextField(5);
		agregarComponente(plCono, cajaVolumenCono, 85, 221, 100, 20);

		JButton btnCalcularCono = new JButton("Calcular");
		agregarComponente(plCono, btnCalcularCono, 80, 250, 100, 20);
		
		btnRestablecer6 = new JButton("Restablecer");
		agregarComponente(plCono, btnRestablecer6, 185, 230, 110, 20);

		btnCalcularCono.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double radio = Double.parseDouble(cajaRadioCono.getText());
		            double altura = Double.parseDouble(cajaAlturaCono.getText());

		            double perimetro = cono1.perimetroCono(radio);
		            double areaTotal = cono1.areaTotalCono(radio, altura);
		            double volumen = cono1.volumenCono(radio, altura);

		            cajaAreaCono.setEnabled(false);
		             
		            cajaPerimetroCono.setEnabled(false);
		            
		            cajaVolumenCono.setEnabled(false);
		            
		            cajaPerimetroCono.setText(String.format("%.2f",perimetro));
		            cajaAreaCono.setText(String.format("%.2f",areaTotal));
		            cajaVolumenCono.setText(String.format("%.2f",volumen));
		        } catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, "Error en los datos: " + ex.getMessage());
		        }
		    }
		});
		
		btnRestablecer6.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        cajaRadioCono.setText("");
		        cajaAlturaCono.setText("");
		        cajaAreaCono.setText("");
		        cajaPerimetroCono.setText("");
		        
		    }
		});
		// termina IF_Cono
		
		// inicia IF_Piramide
		IF_Piramide = new JInternalFrame("IF_PIRAMIDE", true, true, true, true);
		IF_Piramide.setSize(400, 400);
		IF_Piramide.setDefaultCloseOperation(HIDE_ON_CLOSE);
						
		plPiramide = new JPanel();
		plPiramide.setLayout(null);
						
		txtFigSelec = new JLabel("Seleccionaste la Piramide!");
		agregarComponente(plPiramide, txtFigSelec, 10, 10, 170, 20);

		cbPiramides = new JComboBox<String>();
		cbPiramides.addItem("Elije tipo de base...");
		cbPiramides.addItem("Cuadrada");
		cbPiramides.addItem("Rectangular");
		cbPiramides.addItem("Triangular");
		agregarComponente(plPiramide, cbPiramides, 10, 35, 150, 20);
						
		IF_Piramide.add(plPiramide, BorderLayout.CENTER);
						
		desktopPane.add(IF_Piramide);
						
		add(desktopPane, BorderLayout.CENTER);
		// termina IF_Piramide

		// Evento para agregar los componentes dinámicamente
		cbPiramides.addItemListener(e -> {
		    if (e.getStateChange() == ItemEvent.SELECTED) {
		        String seleccion = (String) cbPiramides.getSelectedItem();

		        if (!"Elije tipo de base...".equals(seleccion)) {
		            // Limpia componentes previos
		            plPiramide.removeAll();
		            agregarComponente(plPiramide, txtFigSelec, 10, 10, 170, 20);
		            agregarComponente(plPiramide, cbPiramides, 10, 35, 150, 20);

		          
		            

		            if ("Cuadrada".equals(seleccion)) {
		                txtLado = new JLabel("Lado:");
		                agregarComponente(plPiramide, txtLado, 10, 60, 100, 20);
		                
		                cajaLadoPirCuadrada = new JTextField();
		                agregarComponente(plPiramide, cajaLadoPirCuadrada, 120, 60, 100, 20);
		                
		                txtAltura = new JLabel("Altura:");
		                agregarComponente(plPiramide, txtAltura, 10, 85, 100, 20);
		                
		                cajaAltura3 = new JTextField();
		                agregarComponente(plPiramide, cajaAltura3, 120, 85, 100, 20);
		                
		                txtArea = new JLabel("Área: ");
			            agregarComponente(plPiramide, txtArea, 10, 160, 150, 20);
			            
			            txtPerimetro = new JLabel("Perímetro: ");
			            agregarComponente(plPiramide, txtPerimetro, 10, 185, 150, 20);
			            
			            txtVolumen = new JLabel("Volumen: ");
			            agregarComponente(plPiramide, txtVolumen, 10, 210, 150, 20);

			            
			            cajaAreaPirCuadrada = new JTextField();
			            agregarComponente(plPiramide, cajaAreaPirCuadrada, 120, 160, 100, 20);
			            cajaAreaPirCuadrada.setEditable(false);
			            
			            cajaPerimetroPirCuadrada = new JTextField();
			            agregarComponente(plPiramide, cajaPerimetroPirCuadrada, 120, 185, 100, 20);
			            cajaPerimetroPirCuadrada.setEditable(false);
			            
			            cajaVolumenPirCuadrada = new JTextField();
			            agregarComponente(plPiramide, cajaVolumenPirCuadrada, 120, 210, 100, 20);
			            cajaVolumenPirCuadrada.setEditable(false);
		                
		                btnCalcular7 = new JButton("Calcular");
		                agregarComponente(plPiramide, btnCalcular7, 80, 230, 100, 20);
		                
		                btnRestablecer7 = new JButton("Restablecer");
		        		agregarComponente(plPiramide, btnRestablecer7, 185, 230, 110, 20);
		                
		                btnCalcular7.addActionListener(new ActionListener() {
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                        try {
		                            double lado = Double.parseDouble(cajaLadoPirCuadrada.getText());
		                            double altura = Double.parseDouble(cajaAltura3.getText());
		                            
		                            double perimetro = piramide1.perimetroCuadradaPiramide(lado);
		                            double area = piramide1.areaCuadradaPiramide(lado);
		                            double volumen = piramide1.volumenPiramide(lado * lado, altura);
		                            
		                            cajaAreaPirCuadrada.setEnabled(false);
		       		             
		        		            cajaPerimetroPirCuadrada.setEnabled(false);
		        		            
		        		            cajaVolumenPirCuadrada.setEnabled(false);
		                            
		                            cajaPerimetroPirCuadrada.setText(String.format("%.2f",perimetro));
		                            cajaAreaPirCuadrada.setText(String.format("%.2f",area));
		                            cajaVolumenPirCuadrada.setText(String.format("%.2f",volumen));
		                        } catch (NumberFormatException ex) {
		                            JOptionPane.showMessageDialog(IF_Piramide, "Por favor ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
		                        }
		                    }
		                });
		                
		                btnRestablecer7.addActionListener(new ActionListener() {
		        		    @Override
		        		    public void actionPerformed(ActionEvent e) {
		        		        
		        		        cajaLadoPirCuadrada.setText("");
		        		        cajaAltura3.setText("");
		        		        cajaAreaPirCuadrada.setText("");
		        		        cajaPerimetroPirCuadrada.setText("");
		        		        
		        		    }
		        		});
		            } 
		            else if ("Rectangular".equals(seleccion)) {
		                txtBase = new JLabel("Base:");
		                agregarComponente(plPiramide, txtBase, 10, 60, 100, 20);
		                
		                cajaBasePirRectangular = new JTextField();
		                agregarComponente(plPiramide, cajaBasePirRectangular, 120, 60, 100, 20);
		               
		                txtAltura = new JLabel("Altura:");
		                agregarComponente(plPiramide, txtAltura, 10, 85, 100, 20);
		                
		                txtArea = new JLabel("Área: ");
			            agregarComponente(plPiramide, txtArea, 10, 160, 150, 20);
			            
			            txtPerimetro = new JLabel("Perímetro: ");
			            agregarComponente(plPiramide, txtPerimetro, 10, 185, 150, 20);
			            
			            txtVolumen = new JLabel("Volumen: ");
			            agregarComponente(plPiramide, txtVolumen, 10, 210, 150, 20);
		                
		                cajaAlturaPirRectangular = new JTextField();
		                agregarComponente(plPiramide, cajaAlturaPirRectangular, 120, 85, 100, 20);
		                
		                cajaAreaPirRectangular = new JTextField();
			            agregarComponente(plPiramide, cajaAreaPirRectangular, 120, 160, 100, 20);
			            cajaAreaPirRectangular.setEditable(false);
			            
			            cajaPerimetroPirRectangular = new JTextField();
			            agregarComponente(plPiramide, cajaPerimetroPirRectangular, 120, 185, 100, 20);
			            cajaPerimetroPirRectangular.setEditable(false);
			            
			            cajaVolumenPirRectangular = new JTextField();
			            agregarComponente(plPiramide, cajaVolumenPirRectangular, 120, 210, 100, 20);
			            cajaVolumenPirRectangular.setEditable(false);
		               
		                btnCalcular8 = new JButton("Calcular");
		                agregarComponente(plPiramide, btnCalcular8, 80, 230, 100, 20);
		                
		                btnRestablecer8 = new JButton("Restablecer");
		        		agregarComponente(plPiramide, btnRestablecer8, 185, 230, 110, 20);
		                
		                btnCalcular8.addActionListener(new ActionListener() {
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                        try {
		                            double base = Double.parseDouble(cajaBasePirRectangular.getText());
		                            double altura = Double.parseDouble(cajaAlturaPirRectangular.getText());
		                            //double ancho = Double.parseDouble(cajaAncho.getText());
		                            
		                            double perimetro = piramide1.perimetroRectangularPiramide(base, altura);
		                            double area = piramide1.areaRectangularPiramide(base, altura);
		                            double volumen = piramide1.volumenPiramide(base, altura);
		                            
		                            cajaAreaPirRectangular.setEnabled(false);
			       		             
		        		            cajaPerimetroPirRectangular.setEnabled(false);
		        		            
		        		            cajaVolumenPirRectangular.setEnabled(false);
		        		            
		                            cajaPerimetroPirRectangular.setText(String.format("%.2f",perimetro));
		                            cajaAreaPirRectangular.setText(String.format("%.2f",area));
		                            cajaVolumenPirRectangular.setText(String.format("%.2f",volumen));
		                        } catch (NumberFormatException ex) {
		                            JOptionPane.showMessageDialog(IF_Piramide, "Por favor ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
		                        }
		                    }
		                });
		                
		                btnRestablecer8.addActionListener(new ActionListener() {
		        		    @Override
		        		    public void actionPerformed(ActionEvent e) {
		        		        
		        		        cajaBasePirRectangular.setText("");
		        		        cajaAlturaPirRectangular.setText("");
		        		        cajaAreaPirRectangular.setText("");
		        		        cajaPerimetroPirRectangular.setText("");
		        		        
		        		    }
		        		});
		            } 
		            else if ("Triangular".equals(seleccion)) {
		                txtBase = new JLabel("Base:");
		                agregarComponente(plPiramide, txtBase, 10, 60, 100, 20);
		                
		                cajaBasePirTriangular = new JTextField();
		                agregarComponente(plPiramide, cajaBasePirTriangular, 120, 60, 100, 20);
		                
		                txtAltura = new JLabel("Altura:");
		                agregarComponente(plPiramide, txtAltura, 10, 85, 100, 20);
		                
		                cajaAltura5 = new JTextField();
		                agregarComponente(plPiramide, cajaAltura5, 120, 85, 100, 20);
		                
		                txtLado = new JLabel("Lado:");
		                agregarComponente(plPiramide, txtLado, 10, 110, 100, 20);
		                
		                cajaLadoPirTriangular = new JTextField();
		                agregarComponente(plPiramide, cajaLadoPirTriangular, 120, 110, 100, 20);
		                
		                cajaAreaPirTriangular = new JTextField();
			            agregarComponente(plPiramide, cajaAreaPirTriangular, 120, 160, 100, 20);
			            cajaAreaPirTriangular.setEditable(false);
			            
			            txtArea = new JLabel("Área: ");
			            agregarComponente(plPiramide, txtArea, 10, 160, 150, 20);
			            
			            txtPerimetro = new JLabel("Perímetro: ");
			            agregarComponente(plPiramide, txtPerimetro, 10, 185, 150, 20);
			            
			            txtVolumen = new JLabel("Volumen: ");
			            agregarComponente(plPiramide, txtVolumen, 10, 210, 150, 20);
			            
			            cajaPerimetroPirTriangular = new JTextField();
			            agregarComponente(plPiramide, cajaPerimetroPirTriangular, 120, 185, 100, 20);
			            cajaPerimetroPirTriangular.setEditable(false);
			            
			            cajaVolumenPirTriangular = new JTextField();
			            agregarComponente(plPiramide, cajaVolumenPirTriangular, 120, 210, 100, 20);
			            cajaVolumenPirTriangular.setEditable(false);
		                
		                btnCalcular9 = new JButton("Calcular");
		                agregarComponente(plPiramide, btnCalcular9, 80, 230, 100, 20);
		                
		                btnRestablecer9 = new JButton("Restablecer");
		        		agregarComponente(plPiramide, btnRestablecer9, 185, 230, 110, 20);
		                
		                btnCalcular9.addActionListener(new ActionListener() {
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                        try {
		                            double base = Double.parseDouble(cajaBasePirTriangular.getText());
		                            double altura = Double.parseDouble(cajaAltura5.getText());
		                            double lado = Double.parseDouble(cajaLadoPirTriangular.getText());
		                            
		                            double perimetro = piramide1.perimetroTriangularPiramide(lado, lado, lado);
		                            double area = piramide1.areaTriangularPiramide(base, altura);
		                            double volumen = piramide1.volumenPiramide((base * altura) / 2, altura);
		                            
		                            cajaAreaPirTriangular.setEnabled(false);
			       		             
		        		            cajaPerimetroPirTriangular.setEnabled(false);
		        		            
		        		            cajaVolumenPirTriangular.setEnabled(false);
		                            
		                            cajaPerimetroPirTriangular.setText(String.format("%.2f",perimetro));
		                            cajaAreaPirTriangular.setText(String.format("%.2f",area));
		                            cajaVolumenPirTriangular.setText(String.format("%.2f",volumen));
		                        } catch (NumberFormatException ex) {
		                            JOptionPane.showMessageDialog(IF_Piramide, "Por favor ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
		                        }
		                    }
		                });
		                
		                btnRestablecer9.addActionListener(new ActionListener() {
		        		    @Override
		        		    public void actionPerformed(ActionEvent e) {
		        		        
		        		        cajaBasePirTriangular.setText("");
		        		       
		        		        cajaAreaPirTriangular.setText("");
		        		        cajaPerimetroPirTriangular.setText("");
		        		        cajaVolumenPirTriangular.setText("");
		        		        
		        		    }
		        		});
		            }

		            // Actualiza la UI
		            plPiramide.revalidate();
		            plPiramide.repaint();
		        }
		    }
		});
		
	}
	public void agregarComponente(JPanel panel, JComponent componente, int x, int y, int w, int h) {
        componente.setBounds(x, y, w, h);
        panel.add(componente);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == itemTriangulo) {
			IF_Triangulo.setVisible(true);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(false);
			
		}else if(e.getSource() == itemRectangulo) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(true);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(false);
		}
		else if(e.getSource() == itemCirculo) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(true);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(false);
		}
		else if(e.getSource() == itemElipse) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(true);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(false);
		}
		else if(e.getSource() == itemRombo) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(true);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(false);
		}
		else if(e.getSource() == itemCono) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(true);
			IF_Piramide.setVisible(false);
		}
		else if(e.getSource() == itemPiramide) {
			IF_Triangulo.setVisible(false);
			IF_Rectangulo.setVisible(false);
			IF_Circulo.setVisible(false);
			IF_Elipse.setVisible(false);
			IF_Rombo.setVisible(false);
			IF_Cono.setVisible(false);
			IF_Piramide.setVisible(true);
		}
		
		
		
	}
	
}
