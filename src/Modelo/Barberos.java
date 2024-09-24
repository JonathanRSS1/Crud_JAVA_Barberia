/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.frmBarberos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class Barberos {
    
    //parametros
    
    private String uuid_barbero;
    private String nombre_barbero;
    private int edad_barbero;
    private Float peso_barbero;
    private String correo_barbero;

    public String getUuid_barbero() {
        return uuid_barbero;
    }

    public void setUuid_barbero(String uuid_barbero) {
        this.uuid_barbero = uuid_barbero;
    }

    public String getNombre_barbero() {
        return nombre_barbero;
    }

    public void setNombre_barbero(String nombre_barbero) {
        this.nombre_barbero = nombre_barbero;
    }

    public int getEdad_barbero() {
        return edad_barbero;
    }

    public void setEdad_barbero(int edad_barbero) {
        this.edad_barbero = edad_barbero;
    }

    public Float getPeso_barbero() {
        return peso_barbero;
    }

    public void setPeso_barbero(Float peso_barbero) {
        this.peso_barbero = peso_barbero;
    }

    public String getCorreo_barbero() {
        return correo_barbero;
    }

    //parametros
    public void setCorreo_barbero(String correo_barbero) {
        this.correo_barbero = correo_barbero;
    }
    
    
    
    
    public void Guardar() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addBarbero = conexion.prepareStatement("INSERT INTO tbBarbero(uuid_barbero, nombre_barbero, edad_barbero, peso_barbero,correo_barbero) VALUES (?, ?, ?, ?,?)");
            //Establecer valores de la consulta SQL
            addBarbero.setString(1, UUID.randomUUID().toString());
            addBarbero.setString(2, getNombre_barbero());
            addBarbero.setInt(3, getEdad_barbero());
            addBarbero.setFloat(4, getPeso_barbero());
            addBarbero.setString(5, getCorreo_barbero());
 
            //Ejecutar la consulta
            addBarbero.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
    
    
    
    
    
    
    
    
    
    
    public void Mostrar(JTable tabla) {
        //Creamos una variable de la clase de conexion
        Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modeloDeDatos = new DefaultTableModel();
        
        modeloDeDatos.setColumnIdentifiers(new Object[]{uuid_barbero, nombre_barbero, edad_barbero, peso_barbero,correo_barbero});
        try {
            //Creamos un Statement
            Statement statement = conexion.createStatement();
            //Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM tbBarbero");
            //Recorremos el ResultSet
            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modeloDeDatos.addRow(new Object[]{rs.getString("uuid_barbero"), 
                    rs.getString("nombre_barbero"), 
                    rs.getInt("edad_barbero"), 
                    rs.getFloat("peso_barbero"),
                    rs.getString("correo_barbero")
                    
                });
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modeloDeDatos);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    
      public void Eliminar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();

        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        //Obtenemos el id de la fila seleccionada
        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();
        
        //borramos 
        try {
            PreparedStatement deleteEstudiante = conexion.prepareStatement("delete from tbBarbero where uuid_barbero = ?");
            deleteEstudiante.setString(1, miId);
            deleteEstudiante.executeUpdate();
        } catch (Exception e) {
            System.out.println("este es el error metodo de eliminar" + e);
        }
    }
      
      
      public void cargarDatosTabla(frmBarberos vista) {
        // Obtén la fila seleccionada 
        int filaSeleccionada = vista.jtbBarbero.getSelectedRow();

        // Debemos asegurarnos que haya una fila seleccionada antes de acceder a sus valores
        if (filaSeleccionada != -1) {
            String UUIDDeTb = vista.jtbBarbero.getValueAt(filaSeleccionada, 0).toString();
            String NombreDeTB = vista.jtbBarbero.getValueAt(filaSeleccionada, 1).toString();
            String EdadDeTb = vista.jtbBarbero.getValueAt(filaSeleccionada, 2).toString();
            String PesoDeTb = vista.jtbBarbero.getValueAt(filaSeleccionada, 3).toString();
            String CorreoDeTb = vista.jtbBarbero.getValueAt(filaSeleccionada, 4).toString();
            

            // Establece los valores en los campos de texto
           
            vista.txtNombre.setText(NombreDeTB);
            vista.txtEdad.setText(EdadDeTb);
            vista.txtPeso.setText(PesoDeTb);
            vista.txtCorreo.setText(CorreoDeTb);
          

        } 
        
      }
      
       public void Actualizar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();

        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            //Obtenemos el id de la fila seleccionada
            String miUUId = tabla.getValueAt(filaSeleccionada, 0).toString();
            try { 
                //Ejecutamos la Query
                PreparedStatement updateUser = conexion.prepareStatement("update tbBarbero set nombre_barbero = ?, edad_barbero = ?, peso_barbero = ? correo_barbero = ?  where uuid_barbero = ?");

                updateUser.setString(1, getNombre_barbero());
                updateUser.setInt(2, getEdad_barbero());
                updateUser.setFloat(3, getPeso_barbero());
                updateUser.setString(4, getCorreo_barbero());
                updateUser.setString(5,miUUId);
                updateUser.executeUpdate();
            } catch (Exception e) {
                System.out.println("este es el error en el metodo de actualizar" + e);
            }
        } else {
            System.out.println("no");
        }
        
    }
       
        public void limpiar(frmBarberos vista) {
        vista.txtNombre.setText("");
        vista.txtEdad.setText("");
        vista.txtPeso.setText("");
        vista.txtCorreo.setText("");
    }
        
        
        
         public void Buscar(JTable tabla, JTextField txtBuscar) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"uuid_barbero", "nombre_barbero", "edad_barbero", "peso_barbero", "correo_barbero"});
        try {
            PreparedStatement deleteEstudiante = conexion.prepareStatement("SELECT * FROM tbBarbero WHERE Nombre LIKE ? || '%'");
            deleteEstudiante.setString(1, txtBuscar.getText());
            ResultSet rs = deleteEstudiante.executeQuery();
 
             while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modelo.addRow(new Object[]{rs.getString("UUID_Paciente"), 
                    rs.getString("Nombre"), 
                    rs.getInt("Edad"), 
                    rs.getString("Especialidad")});
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modelo);
 
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo de buscar " + e);
        }
    }
        
        

      
 }


      
      
      
   


