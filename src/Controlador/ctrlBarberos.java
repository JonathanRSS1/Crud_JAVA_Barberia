/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Barberos;
import Vista.frmBarberos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Estudiante
 */
public class ctrlBarberos  implements MouseListener, KeyListener {
    
    
    
     //1- Mandar a llamar a las otras capas (modelo y vista)
    private Barberos Modelo;
    private frmBarberos Vista;
    
    
    
    
    
     //2- Crear el constructor
    public ctrlBarberos(Barberos Modelo, frmBarberos Vista){
        this.Modelo = Modelo;
        this.Vista = Vista;

        Vista.btnAgregar.addMouseListener(this);   
        Modelo.Mostrar(Vista.jtbBarbero);
        Vista.btnEliminar.addMouseListener(this);
        Vista.jtbBarbero.addMouseListener(this);
        Vista.btnActualizar.addMouseListener(this);
        Vista.btnLimpiar.addMouseListener(this);
    
    } 

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == Vista.btnAgregar){
            Modelo.setNombre_barbero(Vista.txtNombre.getText());
            Modelo.setEdad_barbero(Integer.parseInt(Vista.txtEdad.getText()));
            Modelo.setPeso_barbero(Float.parseFloat(Vista.txtPeso.getText()));
            Modelo.setCorreo_barbero(Vista.txtCorreo.getText());
            
            Modelo.Guardar();
            Modelo.Mostrar(Vista.jtbBarbero);
        }
        
        if(e.getSource() == Vista.btnEliminar){
            Modelo.Eliminar(Vista.jtbBarbero);
            Modelo.Mostrar(Vista.jtbBarbero);
        }
        
        if(e.getSource() == Vista.jtbBarbero){
            Modelo.cargarDatosTabla(Vista);
        }
        
        if(e.getSource() == Vista.btnActualizar){
            Modelo.setNombre_barbero(Vista.txtNombre.getText());
            Modelo.setEdad_barbero(Integer.parseInt(Vista.txtEdad.getText()));
            Modelo.setPeso_barbero(Float.parseFloat(Vista.txtPeso.getText()));
            Modelo.setCorreo_barbero(Vista.txtCorreo.getText());
            
            
            
            Modelo.Actualizar(Vista.jtbBarbero);
            Modelo.Mostrar(Vista.jtbBarbero);
        }
        
        if(e.getSource() == Vista.btnLimpiar){
            Modelo.limpiar(Vista);
        }
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
}
