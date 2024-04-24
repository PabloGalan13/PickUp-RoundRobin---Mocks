package org.itson.disenosw.guis;

import BOs.ConsultarProductoBO;
import DAOs.CarritoDAO;
import DAOs.DetalleCarritoDAO;
import DAOs.UsuarioDAO;
import dominio.Carrito;
import dominio.DetalleCarrito;
import excepciones.ExcepcionAT;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelCarrito extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;
    Carrito usuario;
    CarritoDAO carritoDAO = new CarritoDAO();
    DetalleCarritoDAO detalleCarritoDAO = new DetalleCarritoDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     */
    public PanelCarrito(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        try {
            ayuda();
            crearMenu();
        } catch (ExcepcionAT ex) {
            Logger.getLogger(PanelCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPagar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        panelTop = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagar.setBorder(null);
        btnPagar.setContentAreaFilled(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 680, 171, 64));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 692, 40, 40));

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("jLabel2");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 634, 150, 31));

        panelTop.setOpaque(false);
        add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 178, 370, 416));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelCarrito.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        framePrincipal.cambiarVistaMetodoPago();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.cambiarVistaMenu();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void ayuda() throws ExcepcionAT {
        try {
            usuario = carritoDAO.buscarCarritoPorUsuarioId(5L);
        } catch (ExcepcionAT ex) {
            Logger.getLogger(PanelCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
//        DetalleCarritoDAO d = new DetalleCarritoDAO();
    }

    public void crearMenu() throws ExcepcionAT {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        mainPanel.setMaximumSize(new Dimension(370, 550));// Elimina esta línea
        mainPanel.setSize(new Dimension(370, 550));

        ConsultarProductoBO consultarProductoBO = new ConsultarProductoBO();

        List<DetalleCarrito> detallesCarrito = detalleCarritoDAO.buscarListaDetalleCarrito(usuario);

//        List<String[]> productos = new ArrayList<>();
//        productos.add(new String[]{"Hamburguesa clásica", "$120", "/productos/120x100/hamburguesa-clasica.jpg"});
//        productos.add(new String[]{"Jamaica", "$25", "/productos/120x100/jamaica.jpg"});
//        productos.add(new String[]{"Hamburguesa de pollo", "$150", "/productos/120x100/hamburguesa-pollo.jpg"});
//        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
//        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
//        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
//        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
//        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
        GridBagConstraints c = new GridBagConstraints();

        //TODO no jala el insertar elemento de arriba a abajo, empiezan del centro
        c.anchor = GridBagConstraints.NORTH;

//        ActionListener productoListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Obtener el ID del producto clickeado
//                String idProducto = e.getActionCommand();
//                // Realizar la acción deseada con el ID del producto
//                // Por ejemplo, abrir una nueva ventana con más detalles del producto
//                System.out.println("Producto clickeado: " + idProducto);
//            }
//        };
        // Iterar sobre la lista de productos y crear los paneles correspondientes
        for (int i = 0; i < detallesCarrito.size(); i++) {
//            String[] producto = detallesCarrito.get(i);
            JPanel productoPanel = createProductoPanel(detallesCarrito.get(i).getProducto().getNombre(), detallesCarrito.get(i).getProducto().getPrecio(), detallesCarrito.get(i).getProducto().getDireccionImagen());

//            String identificador = "producto_" + i;
//            Long identificador = detallesCarrito.get(i).getIdProductoCafeteria();
//            productoPanel.putClientProperty(identificador, productoPanel);
//            String identificadorString = String.valueOf(identificador);
//            productoPanel.putClientProperty(i, idProducto);
            // Añade un ActionListener al panel de producto
//            productoPanel.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    // Acción a realizar al hacer clic en el panel de producto
//                    // Aquí puedes acceder al identificador del panel haciendo uso de la variable 'identificador'
//                    System.out.println("Clic en el panel de producto: " + identificador);
//                    framePrincipal.setIdProducto(identificador);
//                    framePrincipal.cambiarVistaProducto();
//
//                }
//            });
//            idProducto++;
            // Añade el panel del producto en la posición i * 2 (para dejar espacio para los separadores)
            c.gridx = 0;
            c.gridy = i * 2;
            mainPanel.add(productoPanel, c);

            // Añade un separador después de cada producto, excepto el último
            if (i < detallesCarrito.size() - 1) {
                JPanel separatorPanel = createSeparatorPanel();
                c.gridx = 0;
                c.gridy = i * 2 + 1;
                mainPanel.add(separatorPanel, c);
            }

            productoPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        }

        //TODO hacer el scrollPane un ScrollPaneWin11
        // Configurar el JScrollPane para desplazamiento vertical
        JScrollPane scrollPane = new JScrollPane(mainPanel);

        scrollPane.setPreferredSize(new Dimension(370, 550)); // Establece un tamaño predeterminado
        scrollPane.setMaximumSize(new Dimension(370, 550)); // Establece un tamaño máximo
        scrollPane.getViewport().setPreferredSize(new Dimension(370, 550)); // Establece un tamaño predeterminado para el viewport
        scrollPane.getViewport().setMaximumSize(new Dimension(370, 550)); // Establece un tamaño mínimo para el viewport
        scrollPane.getViewport().setSize(370, 550);

        scrollPane.setOpaque(false); // Hacer el JScrollPane transparente
        scrollPane.getViewport().setOpaque(false); // Hacer transparente el viewport del JScrollPane
        scrollPane.setBorder(null); // Eliminar el borde del JScrollPane
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Ajustar la velocidad del scroll vertical
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // Ocultar la barra de desplazamiento horizontal

        JPanel cont = new JPanel();
        cont.add(scrollPane);
        cont.setOpaque(false);

        panelTop.add(cont);
        
    }

    /**
     * Crea un panel que muestra la información de un producto, incluyendo
     * nombre, precio e imagen.
     *
     * @param nombre El nombre del producto a mostrar.
     * @param precio El precio del producto a mostrar.
     * @param rutaImagen La ruta de la imagen del producto.
     * @return El panel del producto creado.
     */
    private JPanel createProductoPanel(String nombre, Float precio, String rutaImagen) {
        // Crear un nuevo panel para el producto con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false); // Hacer que el fondo del panel sea transparente

        // Configuración de GridBagConstraints para organizar los componentes dentro del panel
        GridBagConstraints c = new GridBagConstraints();

        String rutaFolder = "/productos/120x100/";
        StringBuilder rutaRelativa = new StringBuilder();
        rutaRelativa.append(rutaFolder);
        rutaRelativa.append(rutaImagen);

        // Cargar la imagen del producto
        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource(String.valueOf(rutaRelativa)));
        JLabel imagenLabel = new JLabel(icon);

        Font sizedFontMedium = cargarFuente("/fonts/futura/FuturaPTMedium.otf", 24F);
        Font sizedFontBook = cargarFuente("/fonts/futura/FuturaPTBook.otf", 24F);

        // Configurar la etiqueta del nombre del producto
        JLabel nombreLabel = new JLabel(nombre);
        nombreLabel.setFont(sizedFontMedium);
        nombreLabel.setForeground(Color.BLACK);
        nombreLabel.setPreferredSize(new Dimension(240, 31));
        nombreLabel.setVerticalAlignment(SwingConstants.CENTER);

        String precioString = String.valueOf(precio);
        // Configurar la etiqueta del precio
        JLabel precioLabel = new JLabel(precioString);
        precioLabel.setFont((sizedFontBook));
        precioLabel.setForeground(Color.BLACK);
        precioLabel.setPreferredSize(new Dimension(110, 31));
        precioLabel.setVerticalAlignment(SwingConstants.TOP);

        // Añadir la imagen a la parte derecha del panel
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        panel.add(imagenLabel, c);

        // Añadir la etiqueta del nombre del producto en la primera fila y primera columna
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        panel.add(nombreLabel, c);

        // Añadir la etiqueta del precio en la segunda fila y primera columna
        c.gridx = 0;
        c.gridy = 1;
        panel.add(precioLabel, c);

        // Agregar un ActionListener al panel del producto
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // Llamar a un método cuando se haga clic en el panel del producto
//                // Puedes pasar el idProducto como parámetro
////                productoClicked(idProducto);
////                listener.actionPerformed(new ActionEvent(panel, ActionEvent.ACTION_PERFORMED));
//                framePrincipal.cambiarVistaProducto();
//                productoClicked(idProducto);
//                idProducto++;
//            }
//        });
        return panel; // Devuelve el panel del producto creado
    }

    /**
     * Crea un panel separador con una imagen personalizada. El panel separador
     * consiste en una imagen centrada verticalmente dentro de un panel que
     * actúa como un separador visual entre componentes.
     *
     * @return El panel separador creado.
     */
    private static JPanel createSeparatorPanel() {
        // Crear un nuevo panel para el separador
        JPanel panel = new JPanel();
        panel.setOpaque(false); // Hace que el panel sea transparente
        panel.setPreferredSize(new Dimension(350, 11)); // Establece el tamaño preferido del panel

        // Cargar la imagen del separador
        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource("/separador.png"));

        // Crear una etiqueta para mostrar la imagen del separador
        JLabel imagen = new JLabel(icon);

        // Configurar el layout del panel como BoxLayout vertical
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Añadir pegamento vertical para centrar la imagen verticalmente
        panel.add(Box.createVerticalGlue());

        // Añadir la imagen al panel
        panel.add(imagen);

        // Añadir más pegamento vertical para centrar la imagen verticalmente
        panel.add(Box.createVerticalGlue());

        return panel; // Devuelve el panel separador creado
    }

    /**
     * Carga una fuente desde un archivo de fuente TrueType (TTF) y la devuelve
     * con el tamaño especificado.
     *
     * @param rutaFuente La ruta del archivo de fuente TrueType (TTF).
     * @param size El tamaño de la fuente a cargar.
     * @return La fuente cargada con el tamaño especificado.
     * @throws IllegalArgumentException Si el archivo de fuente no se encuentra
     * en la ruta especificada.
     */
    private static Font cargarFuente(String rutaFuente, float size) {
        InputStream is = PanelMenu.class.getResourceAsStream(rutaFuente);
        if (is == null) {
            throw new IllegalArgumentException("Archivo no encontrado: " + rutaFuente);
        }

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(size);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, "Error al cargar la fuente: " + rutaFuente, ex);
            return null;
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, "Error al cerrar InputStream", ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
}
