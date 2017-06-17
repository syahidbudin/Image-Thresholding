package gmsfinalproject;

import JImage.JIResizeImage;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import java.util.logging.Logger;
import javax.imageio.IIOException;
/*
import javax.media.Buffer;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;*/
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//1027
public class GMS extends javax.swing.JFrame {
  
     JFileChooser jfc = new JFileChooser();
       
     java.io.File f ;
        
     int k = 0; 
      
     private static final int BINS = 256;
     JScrollPane jSP = new JScrollPane();
     Image image;
     BufferedImage grayscaleImageCamera;    
   //  Player player;
     BufferedImage bi;
     BufferedImage grayscaleImage;
     BufferedImage img; //crop Image
     String nfile;
     BufferedImage grayC;
     final JLabel lbl_image = new JLabel(); 
     //new draw on jSP   18/4
      int white = 0 ;
      int black = 0;
     JInternalFrame inFrm = new JInternalFrame("Image", true, true, true, true);
   
     JInternalFrame frame2 = new JInternalFrame();
     final JLabel final_jlab = new JLabel(); // to put Image in the
    
   //  FrameGrabbingControl fgc;
   //   Buffer buffer ;
   //   BufferToImage bti;
      BufferedImage CamImage ;
      
      public static Image toImage(BufferedImage bufferedImage) {
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());
    }
      static JFrame frame;
     //end
        
        
     public GMS() {
        super("Image Filteration");
        
  //      try {
       initComponents();
  //     initCamera();
    
//    }
//    catch (NoPlayerException | CannotRealizeException | IOException ex) {
//        Logger.getLogger(Lastry.class.getName()).log(Level.SEVERE, null, ex);
//    }
    
    }
    
     /*
     private void initCamera() throws IIOException, NoPlayerException, CannotRealizeException, IOException{
     
     MediaLocator ml = new MediaLocator("vfw://0");
     player = Manager.createRealizedPlayer(ml);
     this.panel_camera.add(player.getVisualComponent());
     
     CamereStart.addActionListener((ActionEvent e) -> {
     if(CamereStart.isSelected()){
     player.start();
     }
     else{
     player.stop();
     
     }
     
     });
     
     
     
     }*/

     /*                                  //thge belowImage
     private void setImageButton(JToggleButton panel_camera, Image image){
     panel_camera.setIcon(new ImageIcon(image)); // to image image on next screen toggle button
     }*/
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSP_Converted = new javax.swing.JScrollPane();
        value_1 = new javax.swing.JTextField();
        new1 = new javax.swing.JTextField();
        value_2 = new javax.swing.JTextField();
        new2 = new javax.swing.JTextField();
        new3 = new javax.swing.JTextField();
        value_3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        change_button = new javax.swing.JButton();
        Image_new_frame = new javax.swing.JButton();
        change_cam = new javax.swing.JButton();
        panel_camera = new javax.swing.JToggleButton();
        btn_capture = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        btn_crop = new javax.swing.JButton();
        CamereStart = new javax.swing.JCheckBox();
        panel_graph = new javax.swing.JPanel();
        btn_filter = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wCrop = new javax.swing.JTextField();
        totalCrop = new javax.swing.JTextField();
        hCrop = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        filter = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        w_percentage = new javax.swing.JTextField();
        b_percentage = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMI_Open = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        web_cam = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("between");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("between");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("to");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("to");

        change_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        change_button.setText("Change");
        change_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_buttonActionPerformed(evt);
            }
        });

        Image_new_frame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Image_new_frame.setText("Properties Image");
        Image_new_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Image_new_frameActionPerformed(evt);
            }
        });

        change_cam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        change_cam.setText("Change Cam");
        change_cam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_camActionPerformed(evt);
            }
        });

        btn_capture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_capture.setText("Capture");
        btn_capture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_captureActionPerformed(evt);
            }
        });

        btn_Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_crop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_crop.setText("Crop");
        btn_crop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cropActionPerformed(evt);
            }
        });

        CamereStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CamereStart.setText("On/Off Camera");
        CamereStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamereStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_graphLayout = new javax.swing.GroupLayout(panel_graph);
        panel_graph.setLayout(panel_graphLayout);
        panel_graphLayout.setHorizontalGroup(
            panel_graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_graphLayout.setVerticalGroup(
            panel_graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_filter.setText("Invert Filter ");

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cropped Image");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Height");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Width");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total Size");

        totalCrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCropActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Reset");

        filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        filter.setText("Filter");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("White Region  :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Black Region   :");

        jMenu1.setText("File");

        jMI_Open.setText("Image");
        jMI_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Open);

        jMenuItem2.setText("Clear");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        web_cam.setText("WebCam");
        web_cam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                web_camActionPerformed(evt);
            }
        });
        jMenu1.add(web_cam);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CamereStart)
                    .addComponent(panel_camera, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(value_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(value_2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(value_3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(new2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Image_new_frame)
                    .addComponent(btn_crop)
                    .addComponent(change_button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(filter)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hCrop, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(wCrop)
                            .addComponent(totalCrop)))
                    .addComponent(btn_capture)
                    .addComponent(btn_filter)
                    .addComponent(change_cam)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b_percentage, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(w_percentage))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSP_Converted, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(panel_graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_camera, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CamereStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(value_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(value_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(new1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addComponent(new2)
                    .addComponent(new3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(w_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(b_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hCrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wCrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalCrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_crop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_filter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Image_new_frame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_capture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change_cam)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(JSP_Converted, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void change_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_buttonActionPerformed
      
        
        /*   if(f==null || jfc.getSelectedFiles()==null){
        
        JOptionPane.showMessageDialog(null, "Please insert Image to Continue","Correction to done",JOptionPane.QUESTION_MESSAGE);
        }    
        
        else{
        
        int value1 = Integer.parseInt(value_1.getText());
        int value2 = Integer.parseInt(value_2.getText());
        int value3 = Integer.parseInt(value_3.getText());
        
        //new value
        int nextvalue1 = Integer.parseInt(nxt_value1.getText());
        int nextvalue2 = Integer.parseInt(nxt_value2.getText());
        int nextvalue3 = Integer.parseInt(nxt_value3.getText());
        
        int new_1 = Integer.parseInt(new1.getText());
        int new_2 = Integer.parseInt(new2.getText());
        int new_3 = Integer.parseInt(new3.getText());
        
        File originalImage = new File(jlab.getIcon().toString()); //get Image
        BufferedImage newImage = null;
        
        try {
        
        newImage = ImageIO.read(originalImage);
        JLabel newLabel = new JLabel();
        
        //Image for grayscaling                                                  // asal bawah height
        grayscaleImage = new BufferedImage(newImage.getWidth(), newImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        
        for (int i = 0; i < newImage.getWidth() && i < newImage.getHeight(); i++){// y axis
        for (int j = 0; j < newImage.getHeight() || j < newImage.getWidth(); j++){ // x axis
        
        //getRGB colour for each pixel
        Color c = new Color(newImage.getRGB(j, i));
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        int a = c.getAlpha();
        
        int grNew = (r + g + b) / 3 ;  // value image in grayscale
        
        //condition for change the colour
        
        if((grNew > value1)&&(grNew <= value2)){
        
        grNew = value3;
        
        }
        
        if((grNew > nextvalue1)&&(grNew <= nextvalue2)){
        
        grNew = nextvalue3;
        
        }
        
        if((grNew > new_1)&&(grNew <= new_2)){
        
        grNew = new_3;
        
        }
        
        Color gcolor = new Color(grNew,grNew,grNew,a=0);
        grayscaleImage.setRGB(j,i,gcolor.getRGB());
        
        } //2nd loop
        }// 1st loop
        //to save the file
        //    ImageIO.write(grayscaleImage,"png", new File("C:\\Users\\USER PC\\Desktop\\Job GMS\\Colour Test\\PCBtestImage2.png"));
        newLabel.setIcon(new ImageIcon(grayscaleImage)); // the grayscale Image
        
        // alightment
        newLabel.setHorizontalAlignment(JLabel.CENTER); //
        
        // add jLabel to scroll pane
        JSP_Converted.getViewport().add(newLabel);
        
        
        } catch (IOException fx) {
        System.out.println(fx);
        }
        }              */
        
        
    }//GEN-LAST:event_change_buttonActionPerformed

    final JLabel jlab = new JLabel();
    private void Image_new_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Image_new_frameActionPerformed
     
        if(f==null || jlab.getIcon()==null||jfc.getSelectedFiles()==null)
               JOptionPane.showMessageDialog(null, "Please insert Image to Continue","Correction to done",JOptionPane.ERROR_MESSAGE);
           
           else{
        
         File originalImage = new File(jlab.getIcon().toString()); //get Image
      
         BufferedImage newImage = null;
         
         try{
             
              newImage = ImageIO.read(originalImage);
              HistogramDataset dataset;
              XYBarRenderer renderer;
              dataset = new HistogramDataset();
              Raster raster = newImage.getRaster();
              int w = newImage.getWidth();
              int h = newImage.getHeight();
            
              double[] r = new double[w * h];

              r = raster.getSamples(0,0, w, h, 0, r);
              dataset.addSeries("Red", r, BINS);
              r = raster.getSamples(0, 0, w, h, 0, r);
              dataset.addSeries("Green", r, BINS);
              r = raster.getSamples(0, 0, w, h, 0, r);
              dataset.addSeries("Blue",r,BINS);
              
        
        JFreeChart chart = ChartFactory.createHistogram("Pixel against Brightness", "Brightness",
            "Pixel", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = (XYPlot) chart.getPlot();
        renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setBarPainter(new StandardXYBarPainter());
        
         Paint[] paintArray = {
            new Color(0x80000000, true),
            new Color(0x80000000, true),
            new Color(0x80000000, true)
        };
         
         plot.setDrawingSupplier(new DefaultDrawingSupplier(
            paintArray,
            DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE,
            DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE,
            DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE,
            DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE,
            DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE));
            ChartPanel panel = new ChartPanel(chart);
             panel.setDomainZoomable(true);
           
               
        JFrame fz = new JFrame("Pixel against Brightness");
        fz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fz.add(panel);
   //     fz.add(createControlPanel(), BorderLayout.SOUTH); // border
        fz.add(new JLabel(new ImageIcon(newImage)), BorderLayout.WEST); // to display the image
        fz.pack();
        
        fz.setLocationRelativeTo(null);
        fz.setVisible(true);
                   
    }     
         catch (IOException ex) {
                Logger.getLogger(GMS.class.getName()).log(Level.SEVERE, null, ex);
            }
       }  
        
    }//GEN-LAST:event_Image_new_frameActionPerformed
    
    private void btn_captureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_captureActionPerformed
        /*
        fgc = (FrameGrabbingControl) player.getControl("javax.media.control.FrameGrabbingControl");
        buffer = fgc.grabFrame();
        
        bti = new BufferToImage((VideoFormat)buffer.getFormat());
        image = bti.createImage(buffer);
        
        JIResizeImage resize = new JIResizeImage();
        // bi = (BufferedImage)bi;
        
        
        lbl_image.setIcon(new ImageIcon(image));
        
        lbl_image.setHorizontalAlignment(JLabel.CENTER);
        
        JInternalFrame inFrm = new JInternalFrame("Image", true, true, true, true);
        
        inFrm.add(lbl_image);
        inFrm.pack();
        inFrm.setVisible(true);
        dp.add(inFrm);*/
        
    }//GEN-LAST:event_btn_captureActionPerformed

    private void change_camActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_camActionPerformed

        /*
        int value1 = Integer.parseInt(Lastry.value_1.getText());
        int value2 = Integer.parseInt(Lastry.value_2.getText());
        int value3 = Integer.parseInt(Lastry.value_3.getText());
        
        //new value
        
        int new_1 = Integer.parseInt(Lastry.new1.getText());
        int new_2 = Integer.parseInt(Lastry.new2.getText());
        int new_3 = Integer.parseInt(Lastry.new3.getText());
        
        
        JLabel newLabel = new JLabel();
        //    File originalImage = new File;
        CamImage = (BufferedImage)image; // get the image
        grayscaleImageCamera = new BufferedImage(CamImage.getWidth(), CamImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i < CamImage.getWidth() && i < CamImage.getHeight(); i++){// y axis
        for (int j = 0; j < CamImage.getHeight() || j < CamImage.getWidth(); j++){ //
        
        Color c = new Color(CamImage.getRGB(j, i));
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        int a = c.getAlpha();
        
        int grNew = (r  + g  + b ) / 3 ;  // value image in grayscale
        
        //condition for change the colour
        
        if((grNew > value1)&&( grNew<= value2)){
        
        grNew = value3;
        
        }
        
        if((grNew > new_1)&&(grNew <= new_2)){
        
        grNew = new_3;
        
        }
        
        Color gcolor = new Color(grNew,grNew,grNew,a); // condition of colour set
        grayscaleImageCamera.setRGB(j,i,gcolor.getRGB());
        
        
        } // 2nd loop
        }//1st loop
        
        
        newLabel.setIcon(new ImageIcon(grayscaleImageCamera)); // the grayscale Image
        // alightment
        newLabel.setHorizontalAlignment(JLabel.CENTER); //
        // add jLabel to scroll pane
        
        Lastry.JSP_Converted.getViewport().add(newLabel);
        player.start();
        
        */
        
    }//GEN-LAST:event_change_camActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        jlab.setIcon(null);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMI_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_OpenActionPerformed
     //this part of the cod is to use in btn_region
  
        if(jfc.showOpenDialog(jMenu1)== JFileChooser.APPROVE_OPTION){
            // get selected file name
            f = jfc.getSelectedFile();

            //set Icon
            jlab.setIcon(new ImageIcon(f.toString()));

            // alightment
            jlab.setHorizontalAlignment(JLabel.CENTER);
           
         //  jSP.getViewport().add(jlab);
         
     
                inFrm.add(final_jlab.add(jlab));
                inFrm.pack();
                inFrm.setVisible(true);
                dp.add(inFrm);
            
  
        
        }

    }//GEN-LAST:event_jMI_OpenActionPerformed

    private void web_camActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_web_camActionPerformed

        /*
        MediaLocator ml = new MediaLocator("vfw://0");

        try {

            JFrame cam = new JFrame();
            cam.setTitle("Camera Capture");
            cam.setSize(700,700);
            cam.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            cam.setVisible(true);

            JPanel campanel = new JPanel();
            campanel.setLayout(null);
            cam.add(campanel);

            JButton snapbtn = new JButton("Capture");

            player = Manager.createRealizedPlayer(ml);
            //x  ,  y,  h,   w
            campanel.setBounds(400, 500, 100, 30);
            campanel.setLayout(null);
            campanel.add(snapbtn); //To put the button on the panel
            //x    y    width heighT
            snapbtn.setBounds(0, 0, 100, 30);
            cam.add(campanel.add(player.getVisualComponent()));

            player.start();

            snapbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

        }
        catch (IOException | NoPlayerException | CannotRealizeException ex) {
            Logger.getLogger(Lastry.class.getName()).log(Level.SEVERE, null, ex);
        }

        */
    }//GEN-LAST:event_web_camActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        
        FileDialog fd = new FileDialog(GMS.this,"Save Image", FileDialog.SAVE);
        fd.show();
        
        if(fd.getFile()!= null){
            nfile = fd.getDirectory() + fd.getFile() + ".png";
            
            try{
                File make = new File(nfile);
                try{
                    
                   ImageIO.write(grayC, "png", make);
               //     ImageIO.write(image, "png", make);
                }
                catch(IOException ex){
                    
                     Logger.getLogger(GMS.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }  catch(Exception ex){
                  
            }     
        }
         
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_cropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cropActionPerformed

        MainFrame window;
         try {
             
             window = new MainFrame();
              
         } catch (IOException ex) {
             Logger.getLogger(GMS.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }//GEN-LAST:event_btn_cropActionPerformed

    private void CamereStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamereStartActionPerformed
      
    }//GEN-LAST:event_CamereStartActionPerformed

    private void totalCropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCropActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
         
    }//GEN-LAST:event_filterActionPerformed

  
   public static void main(String args[]) {
        
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger(GMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new GMS().setVisible(true);
        });
        
 }
   

// for webcam purpose//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////draw image purpose///////////////////////////////////////////////////////////////////////////////////////////////////////

public class FilterExample extends JPanel{
    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    private Shape shape = null;
    Point startDrag, endDrag;
    JLabel lbl_Crop = new JLabel();
    
    public FilterExample(String inputImage, MainFrame mf1) throws IOException {
        final MainFrame mf = mf1;
          //Image img = (BufferedImage)inputImage;
       BufferedImage camImage = null;
       camImage = (BufferedImage)image;
       
    
       image = ImageIO.read(new File(inputImage));
     this.addMouseListener(new MouseAdapter() {
       @Override
        public void mousePressed(MouseEvent e) {
            startDrag = new Point(e.getX(), e.getY());
            endDrag = startDrag;
          
            repaint();
            
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
               
                if(endDrag!=null && startDrag!=null) {
                    try {
                        shape = makeRectangle(startDrag.x, startDrag.y, e.getX(),
                                e.getY());
                        //passing image to anther frame
                  
                        lbl_Crop.setIcon(new ImageIcon(image.getSubimage(startDrag.x, startDrag.y, e.getX()-startDrag.x, e.getY()-startDrag.y)));  
                        lbl_Crop.setHorizontalAlignment(JLabel.CENTER);
                        jlab.setIcon(null);
                        JSP_Converted.getViewport().add(lbl_Crop);
                      ///    jSP.getViewport().add(jlab);
                        img = (image.getSubimage(startDrag.x, startDrag.y, e.getX()-startDrag.x,  e.getY()-startDrag.y));
                          
                   GMS.hCrop.setText(img.getHeight() + " pix");
                   GMS.wCrop.setText(img.getWidth()+ " pix");
                   GMS.totalCrop.setText(img.getWidth() * img.getHeight() + " pix");
                   
                     //Histogram of converted Image of original crop     
                        HistogramDataset new_dataset;
                        XYBarRenderer new_renderer ;
                        new_dataset = new HistogramDataset();
                        Raster new_raster =img.getRaster();
                        final int new_w = img.getWidth();
                        final int new_h = img .getHeight();
                        double[] new_r = new double[new_w * new_h];
                        
                        new_r = new_raster.getSamples(0, 0, new_w, new_h, 0, new_r);
                        new_dataset.addSeries("syahid", new_r, BINS);
                       
                        new_r = new_raster.getSamples(0, 0, new_w, new_h, 0, new_r);
                        new_dataset.addSeries("Green", new_r, BINS);
                        new_r = new_raster.getSamples(0, 0, new_w, new_h, 0, new_r);
                        new_dataset.addSeries("Blue",new_r,BINS);
                     //  JOptionPane.showMessageDialog(null, "Value H "+ h, "Value W " + w, JOptionPane.INFORMATION_MESSAGE);
                       JFreeChart new_chart = ChartFactory.createHistogram("Pixel against Brightness", "Brightness",
                      "Pixel", new_dataset, PlotOrientation.VERTICAL, false, false, false);
                       XYPlot new_plot = (XYPlot) new_chart.getPlot();
                       new_renderer = (XYBarRenderer) new_plot.getRenderer();
                       new_renderer.setBarPainter(new StandardXYBarPainter());
        
                      Paint[] new_paintArray = {
                      new Color(0x80000000, true),
                      new Color(0x80000000, true),
                      new Color(0x80000000, true)
                     };
          
                     new_plot.setDrawingSupplier(new DefaultDrawingSupplier(
                     new_paintArray,
                     DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE,
                     DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE,
                     DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE,
                     DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE,
                     DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE));
                     ChartPanel new_panel = new ChartPanel(new_chart);
                     new_panel.setDomainZoomable(true);
                    
                     panel_graph.setLayout(new BorderLayout());
     
                     panel_graph.add(new_panel);
                     panel_graph.setVisible(true);
                     
                     startDrag = null;
                     endDrag = null;
                     repaint();
                    //Histogram of converted Image of original crop at up
               
GMS.change_button.addActionListener((ActionEvent ea) -> {     //1027
       //    lbl_Crop.setIcon(null);
           
           int value1 = Integer.parseInt(value_1.getText());
           int value2 = Integer.parseInt(value_2.getText());
           int value3 = Integer.parseInt(value_3.getText());
                
           int new_1 = Integer.parseInt(new1.getText());
           int new_2 = Integer.parseInt(new2.getText());
           int new_3 = Integer.parseInt(new3.getText());
                   
       JLabel newLabelC = new JLabel();
           grayC = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
      
         
         
             for (int i = 0; i < img.getHeight(); i++){// y axis
                  for (int j = 0; j < img.getWidth(); j++){ //
                     
                     Color c = new Color(img.getRGB(j, i));
                     int red = c.getRed();
                     int g = c.getGreen();
                     int b = c.getBlue();
                     int a = c.getAlpha();
              
                   int grNew = (red  + g  + b ) / 3 ;  // value image in grayscale
                 
                     //condition for change the colour
                     
                     if((grNew >= value1)&&(grNew <= value2)){
                     
                     grNew = value3;
                     
                     }
                                      
                     
                     if((grNew >= new_1)&&(grNew <= new_2)){
                     
                     grNew = new_3;
                     
                     }
                     
                  
                      Color gcolor = new Color(grNew,grNew,grNew,a); // condition of colour set
                     grayC.setRGB(j,i, gcolor.getRGB());
                                                                          
                 } // 2nd loop
               
                  
       }//1st loop
                    try {                            
                                // ImageIO.write(grayC, "jpg", new File("C:\\Users\\USER PC\\Desktop\\Desktop\\Ash.jpg"));
                      ImageIO.write(grayC,"png", new File("C:\\Users\\USER PC\\Desktop\\Desktop\\As2h.png"));
                     } catch (IOException ex) {
                          Logger.getLogger(GMS.class.getName()).log(Level.SEVERE, null, ex);
                     }
                          
              newLabelC.setHorizontalAlignment(JLabel.CENTER);
              newLabelC.setIcon(new ImageIcon(grayC)); // the grayscale Image
                
                                                            // alightment
                
                   // add jLabel to scroll pane
                  GMS.JSP_Converted.getViewport().add(newLabelC);
                 
                 //Histogram of converted Image                
                        HistogramDataset dataset;
                        XYBarRenderer renderer;
                        dataset = new HistogramDataset();
                        Raster raster =grayC.getRaster();
                        final int w = grayC.getWidth();
                        final int h = grayC .getHeight();
                        double[] r = new double[w * h];
                        
                        r = raster.getSamples(0, 0, w, h, 0, r);
                        dataset.addSeries("Red", r, BINS);
                       
                        r = raster.getSamples(0, 0, w, h, 0, r);
                       dataset.addSeries("Green", r, BINS);
                       r = raster.getSamples(0, 0, w, h, 0, r);
                       dataset.addSeries("Blue",r,BINS);
                     //  JOptionPane.showMessageDialog(null, "Value H "+ h, "Value W " + w, JOptionPane.INFORMATION_MESSAGE);
                      JFreeChart chart = ChartFactory.createHistogram("Pixel against Brightness", "Brightness",
                    "Pixel", dataset, PlotOrientation.VERTICAL, true, true, false);
                     XYPlot plot = (XYPlot) chart.getPlot();
                     renderer = (XYBarRenderer) plot.getRenderer();
                     renderer.setBarPainter(new StandardXYBarPainter());
        
                    Paint[] paintArray = {
                    new Color(0x80000000, true),
                    new Color(0x80000000, true),
                    new Color(0x80000000, true)
                     };
         
                    plot.setDrawingSupplier(new DefaultDrawingSupplier(
                    paintArray,
                    DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE,
                    DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE,
                    DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE,
                    DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE,
                    DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE));
                    ChartPanel panel = new ChartPanel(chart);
                    panel.setDomainZoomable(true);
                    
                     panel_graph.setLayout(new BorderLayout());
     
                     panel_graph.add(panel);
                     panel_graph.setVisible(true);
                     
                    startDrag = null;
                    endDrag = null;
                    repaint();    
               //    JOptionPane.showMessageDialog(null, "Value of 0 =  " + count + " Dimension pix " + total ," Black Pixel", JOptionPane.NO_OPTION);
                   
          
        
         
         
         });
     
     
    GMS.btn_filter.addActionListener((ActionEvent ea) -> {
        
          // The Converted Image in grayC, think of process the image
          
            JLabel newLabelinvert = new JLabel();
       
            BufferedImage invert = null;
            invert = processImageInvert(grayC);
            
             
            
            newLabelinvert.setIcon(new ImageIcon(invert)); // the grayscale Image
                   
                    // alightment
            newLabelinvert.setHorizontalAlignment(JLabel.CENTER); //
                  
                   // add jLabel to scroll pane
            GMS.JSP_Converted.getViewport().add(newLabelinvert);
                                                                                      
            });
          
         GMS.filter.addActionListener((ActionEvent ea) -> {
        
                 frame2 = new Enhancer();
                 frame2.setLayout(new FlowLayout());
                 frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                 frame2.setResizable(false);
                 Image frmic=(new ImageIcon("icon2.jpg")).getImage();
    //    frame2.setIconImage(frmic);
                frame2.setBounds(0,0,1024,700);
                frame2.setBackground(Color.black);
                frame2.pack();
     //   frame2.setLocationRelativeTo(null);
               frame2.setVisible(true);
               dp.add(frame2);
                                                                                
            });
                 
                               
                    } catch (Exception ea) {
                        
                    }   
                }
            }
                      
  });
           

 this.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
        endDrag = new Point(e.getX(), e.getY());
        
        repaint();
        }
        });
 
    }
    //minFILTER
    
    
    
 //invert filter
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public BufferedImage processImageInvert(BufferedImage image) {
     byte[] invertArray = new byte[256];
    
    for (int counter = 0; counter < 256; counter++)
    invertArray[counter] = (byte) (255 - counter);
    
    BufferedImageOp invertFilter = new LookupOp(new ByteLookupTable(0, invertArray), null);
    
    return invertFilter.filter(image,null);
}

    FilterExample(String imagePath) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    FilterExample() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, 0, 0, null);//draw image on the window 
          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setStroke(new BasicStroke(2));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                0.50f));

        if (shape != null) {
            g2.setPaint(Color.RED);
            g2.draw(shape);
            g2.fill(shape);
      //    g2.setPaint(Color.YELLOW);
       //   g2.fill();
      
        }
        
        if (startDrag != null && endDrag != null) {
            g2.setPaint(Color.RED);
            Shape r = makeRectangle(startDrag.x, startDrag.y, endDrag.x,
                    endDrag.y);
            g2.draw(r);
      
            
        }
        
    }

    private Rectangle2D.Float makeRectangle(int x1, int y1, int x2, int y2) {
        return new Rectangle2D.Float(Math.min(x1, x2), Math.min(y1, y2),
                Math.abs(x1 - x2), Math.abs(y1 - y2));
    }
            
}
///////////////////////NO NEED BUSINESS FOR CROPPING BECOUSE FRAME ////////////////////////////////////////////////////////////////////////////////////
public class MainFrame {
    
    private JPanel selectedAreaPanel;
    
    private String imagePath = (jlab.getIcon().toString());
    BufferedImage bufferedImage;
    public MainFrame() throws IOException {
        initialize();
    };
    
    /* public BufferedImage createImage(JPanel panel) {
    
    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = bi.createGraphics();
    panel.paint(g);
    return bi;
    
    }
    // function to update selected region of the image
    public void updateSelectedRegion(BufferedImage bufferedImage) {
    
    Graphics g = selectedAreaPanel.getGraphics();
    
    File originalImage = new File(jlab.getIcon().toString());
    
    BufferedImage newImage = null;
    
    try{ // looping to get the height and width of the Inputed Image
    newImage = ImageIO.read(originalImage);
    int w = newImage.getWidth();
    int h = newImage.getHeight();
    
    for(int y = 0; y < h; y++) {
    for(int x = 0; x < w; x++) {
    newImage.getWidth();
    newImage.getHeight();
    }
    }
    
    g.clearRect(0, 0, h, w);
    g.drawImage(bufferedImage,0, 0, null);
    
    
    
    
    }
    catch (IOException ex) {
    Logger.getLogger(Lastry.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    */
    
    private void initialize() throws IOException {
             
          File originalImage = new File(jlab.getIcon().toString());
       
            BufferedImage newImage = null;
          
          try{ // looping to get the height and width of the Inputed Image
            newImage = ImageIO.read(originalImage);
            int w = newImage.getWidth();
            int h = newImage.getHeight();
       
            for(int y = 0; y < h; y++) {
                  for(int x = 0; x < w; x++) {
                     newImage.getWidth();
                     newImage.getHeight();
              }
          }
            
 //       frmSelectAreaIn = new JFrame();
    //    inFrm.setTitle("Navigator");
    
        inFrm.setSize(newImage.getHeight(), newImage.getWidth());
        
        //frmSelectAreaIn.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       //inFrm.getContentPane().setLayout(null); //must set the layout 
    
        JPanel mainPanel = new FilterExample(imagePath, this); //pass the function
                      
        mainPanel.setSize(newImage.getHeight() ,newImage.getWidth());
        inFrm.getContentPane().add(mainPanel);
        inFrm.setBounds(0, 0, newImage.getHeight(), newImage.getWidth());
       
        
  
          } catch (IOException ex) {
            Logger.getLogger(GMS.class.getName()).log(Level.SEVERE, null, ex);
        }    
     }     
}
 /////////////////////////////////////////////////////////////CROP FILTER BUSINESS ////////////////////////////////////////////////////////////////////////////////
public class Enhancer extends JInternalFrame implements ActionListener , ItemListener , ChangeListener ,MouseMotionListener,MouseListener{
    JColorChooser tcc1,tcc2;
    JFileChooser fcc;
    String filename="";
    String password="";
    double screenw=800;
    double screenh=600;
    BufferedImage bufferimagedisplay = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
    BufferedImage bufferimagedisplay2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();
    //Image imagedisplay2;
    //Runtime runtimeforgarbagecollection = Runtime.getRuntime();
    
    int maximageframesize=((int)screenSize.getWidth()*2)/3; 
    int width=100;
    int height=100;
    int widthbuffer=0;
    int heightbuffer=0;
    int[][][] colouray;
    int rgbs[];
    int rgbsbuffer[];
    int rgbsundoarray[];
    int widthundo=0;
    int heightundo=0;
    int regions=5;
    int encryptationcycles=0;
    boolean imageopen=false;
    boolean dialogopen=false;
    boolean otherframeopen=false;
    Color colorsel1;
    Color colorsel2;
   
    int brightnessincrement=10;
    int brightnessvalue=0;
    
    int initmousex=0;
    int initmousey=0;
    int finamousex=0;
    int finamousey=0;
    int nowmousex=0;
    int nowmousey=0;
    int rectix=0;
    int rectiy=0;
    int rectfx=0;
    int rectfy=0;
    double  imagescaleratio=1.0;
    
    int limitingframewidth=0;
    
    boolean selrectformed=false;
    boolean selectedrectdragged=false;
    int dragstartcoordinatex=0;
    int dragstartcoordinatey=0;
    int dragendcoordinatex=0;
    int dragendcoordinatey=0;

    String action="";

   

    JLabel jlabel1,jlabel2,jlabel3,jlabel4;
   
   
    JInternalFrame imageframe; // the pop up frame
    

    
    
    // the dialog box for brightness adjustment
    JDialog brightnesset ;
    JButton submitbrightness;
    JSlider adjustbrightness;
    
    // the dialog box for region adjustment
    JDialog regionset;
    JButton submitregion;
    JSlider adjustregion;
    
    //the dialog box for size adjustment
    JDialog adjustsize;
    JTextField sizex;
    JTextField sizey;
    JButton submitsize;
    JLabel xsize;
    JLabel ysize;
    JCheckBox maintainaspect;
    
    //the dialog box for encryptation password
     JDialog givepassword;
     JPasswordField passwordf;
     JTextField numberofcycles;
     JButton submitpassword;
     
     // the dialog box for arbitrary rotation
     JDialog giveangle;
     JTextField rotationangle;
     JButton submitrotationangle;
     
     // the dialog box for colourcontrast adjustment
    JDialog colourcontrastset ;
    JButton submitcolourcontrast;
    JSlider adjustcolourcontrast;
    
    // the dialog box for contrast adjustment
    JDialog contrastset ;
    JButton submitcontrast;
    JSlider adjustcontrast;
    //the dialog box for contrast stretching
    JDialog stretchcontrast;
    JTextField rangecont;
    JButton submitrange;
    
    //the dialog box for color swapping
    JDialog entercolor;
    
    //the dialog box for gamma value
    JDialog gammabasis;
    JTextField basisgam;
    
     
         
    // Create buffered image that does not support transparency
    //BufferedImage bufferimage1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//    BufferedImage bufferimage2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
   
   
    
   // Graphics2D  gracrop= bufferimagedisplay.createGraphics(); 
    @SuppressWarnings("LeakingThisInConstructor")
    public Enhancer() {
 
     //main class super
    super("Image Filteration");
           
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        
        
        jlabel1 = new JLabel("",new ImageIcon(""),JLabel.LEFT);
        add(jlabel1);
                
        jlabel1.add(new JSeparator(SwingConstants.VERTICAL));
       
        jlabel3 = new JLabel("",new ImageIcon(""),JLabel.LEFT);
         jlabel3.addMouseMotionListener(this);
         jlabel3.addMouseListener(this);
        //add(jlabel3);
                
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem open = new JMenuItem("Open...");
      
        file.add(open);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
        open.addActionListener(this);
        file.addSeparator();
        JMenuItem save = new JMenuItem("Save...");
        file.add(save);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        file.addSeparator();
       // JMenuItem saveas = new JMenuItem("Save as...");
        //file.add(saveas);
        //saveas.addActionListener(this);
        //file.addSeparator();
        JMenuItem quit = new JMenuItem("Quit");
        file.add(quit);
        quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        quit.addActionListener(this);
        mbar.add(file);
                
        //creating edit menu
        JMenu edit = new JMenu("Edit");
        JMenuItem undo = new JMenuItem("Undo...");
        edit.add(undo);
        undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        undo.addActionListener(this);
        edit.addSeparator();
        JMenuItem cut = new JMenuItem("Cut...");
        edit.add(cut);
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cut.addActionListener(this);
        mbar.add(edit);
                
        //creating submenu of rotate 
        JMenu rotate = new JMenu("Rotate");
        JMenuItem fvertical = new JMenuItem("Flip vertical");
        rotate.add(fvertical);
        fvertical.addActionListener(this);
        rotate.addSeparator();
        JMenuItem fhorizontal = new JMenuItem("Flip horizontal");
        rotate.add(fhorizontal);
        fhorizontal.addActionListener(this);
        rotate.addSeparator();
        JMenuItem transpose = new JMenuItem("Transpose");
        rotate.add(transpose);
        transpose.addActionListener(this);
        rotate.addSeparator();
        JMenuItem farbitrary = new JMenuItem("Flip arbitrary");
        rotate.add(farbitrary);
        farbitrary.addActionListener(this);
                
        //creating submenu of adjust
        JMenu adjust = new JMenu("Adjust");
        JMenuItem brightness = new JMenuItem("Brightness");
        adjust.add(brightness);
        brightness.addActionListener(this);
        adjust.addSeparator();
        JMenuItem contrast = new JMenuItem("Contrast");
        adjust.add(contrast);
        contrast.addActionListener(this);
        contrast.setToolTipText("enhance the contrast of image by 20%");
        adjust.addSeparator();
        JMenuItem colourcontrast = new JMenuItem("Colour Contrast");
        adjust.add(colourcontrast);
        colourcontrast.addActionListener(this);
        adjust.addSeparator();
       // JMenuItem colorbalance = new JMenuItem("Color Balance");
       // adjust.add(colorbalance);
       // colorbalance.addActionListener(this);
       // adjust.addSeparator();
        JMenuItem size = new JMenuItem("Size");
        adjust.add(size);
        size.addActionListener(this);
       
       
         
        //creating submenu of swapcolor
        JMenu swapcolor = new JMenu("Swap color");
        JMenuItem redandgreen = new JMenuItem("Red and Green");
        swapcolor.add(redandgreen);
        redandgreen.addActionListener(this);
        swapcolor.addSeparator();
        JMenuItem redandblue = new JMenuItem("Red and Blue");
        swapcolor.add(redandblue);
        redandblue.addActionListener(this);
        swapcolor.addSeparator();
        JMenuItem greenandblue = new JMenuItem("Blue and Green");
        swapcolor.add(greenandblue);
        greenandblue.addActionListener(this);
        
        //creating submenu of turnrgb
        JMenu turnrgb = new JMenu("Turn RGB to..");
        JMenuItem m0=new JMenuItem("rgb to rrr..0");
        JMenuItem m1=new JMenuItem("rgb to rrg..1");
        JMenuItem m2=new JMenuItem("rgb to rrb..2");
        JMenuItem m3=new JMenuItem("rgb to rgr..3");
        JMenuItem m4=new JMenuItem("rgb to rgg..4");
        JMenuItem m5=new JMenuItem("rgb to rgb..5");
        JMenuItem m6=new JMenuItem("rgb to rbr..6");
        JMenuItem m7=new JMenuItem("rgb to rbg..7");
        JMenuItem m8=new JMenuItem("rgb to rbb..8");
        JMenuItem m9=new JMenuItem("rgb to grr..9");
        JMenuItem m10=new JMenuItem("rgb to grg..10");
        JMenuItem m11=new JMenuItem("rgb to grb..11");
        JMenuItem m12=new JMenuItem("rgb to ggr..12");
        JMenuItem m13=new JMenuItem("rgb to ggg..13");
        JMenuItem m14=new JMenuItem("rgb to ggb..14");
        JMenuItem m15=new JMenuItem("rgb to gbr..15");
        JMenuItem m16=new JMenuItem("rgb to gbg..16");
        JMenuItem m17=new JMenuItem("rgb to gbb..17");
        JMenuItem m18=new JMenuItem("rgb to brr..18");
        JMenuItem m19=new JMenuItem("rgb to brg..19");
        JMenuItem m20=new JMenuItem("rgb to brb..20");
        JMenuItem m21=new JMenuItem("rgb to bgr..21");
        JMenuItem m22=new JMenuItem("rgb to bgg..22");
        JMenuItem m23=new JMenuItem("rgb to bgb..23");
        JMenuItem m24=new JMenuItem("rgb to bbr..24");
        JMenuItem m25=new JMenuItem("rgb to bbg..25");
        JMenuItem m26=new JMenuItem("rgb to bbb..26");
         m0.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        m8.addActionListener(this);
        m9.addActionListener(this);
        m10.addActionListener(this);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m15.addActionListener(this);
        m16.addActionListener(this);
        m17.addActionListener(this);
        m18.addActionListener(this);
        m19.addActionListener(this);
        m20.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
        m24.addActionListener(this);
        m25.addActionListener(this);
        m26.addActionListener(this);
        turnrgb.add(m0);
        turnrgb.addSeparator();
        turnrgb.add(m1);
         turnrgb.addSeparator();
        turnrgb.add(m2);
         turnrgb.addSeparator();
        turnrgb.add(m3);
         turnrgb.addSeparator();
        turnrgb.add(m4);
         turnrgb.addSeparator();
        turnrgb.add(m5);
         turnrgb.addSeparator();
        turnrgb.add(m6);
         turnrgb.addSeparator();
        turnrgb.add(m7);
         turnrgb.addSeparator();
        turnrgb.add(m8);
         turnrgb.addSeparator();
        turnrgb.add(m9);
         turnrgb.addSeparator();
        turnrgb.add(m10);
         turnrgb.addSeparator();
        turnrgb.add(m11);
         turnrgb.addSeparator();
        turnrgb.add(m12);
         turnrgb.addSeparator();
        turnrgb.add(m13);
         turnrgb.addSeparator();
        turnrgb.add(m14);
         turnrgb.addSeparator();
        turnrgb.add(m15);
         turnrgb.addSeparator();
        turnrgb.add(m16);
         turnrgb.addSeparator();
        turnrgb.add(m17);
         turnrgb.addSeparator();
        turnrgb.add(m18);
         turnrgb.addSeparator();
        turnrgb.add(m19);
         turnrgb.addSeparator();
        turnrgb.add(m20);
         turnrgb.addSeparator();
        turnrgb.add(m21);
         turnrgb.addSeparator();
        turnrgb.add(m22);
         turnrgb.addSeparator();
        turnrgb.add(m23);
         turnrgb.addSeparator();
        turnrgb.add(m24);
         turnrgb.addSeparator();
        turnrgb.add(m25);
         turnrgb.addSeparator();
        turnrgb.add(m26);
       
        /*
        //creating image menu
        JMenu image = new JMenu("Image");
        image.add(adjust);
        image.addSeparator();
        JMenuItem show = new JMenuItem("Show Info");
        image.add(show);
        show.addActionListener(this);
        image.addSeparator();
        JMenuItem invert = new JMenuItem("Invert");
        image.add(invert);
        invert.addActionListener(this);
        image.addSeparator();
        JMenuItem black = new JMenuItem("Black & White");
        image.add(black);
        black.addActionListener(this);
        image.addSeparator();
        image.add(rotate);
        image.addSeparator();
        image.add(swapcolor);
        image.addSeparator();
        JMenuItem swapanycolor=new JMenuItem("Swap Any Color");
        image.add(swapanycolor);
        swapanycolor.addActionListener(this);
        image.addSeparator();
        image.add(turnrgb);
        turnrgb.addActionListener(this);
        image.addSeparator();
        JMenuItem crop = new JMenuItem("Crop");
        image.add(crop);
        crop.addActionListener(this);
        image.addSeparator();
        JMenuItem colour = new JMenuItem("Colour");
        image.add(colour);
        colour.addActionListener(this);
        image.addSeparator();
        JMenuItem distribute = new JMenuItem("Distribute");
        image.add(distribute);
        distribute.addActionListener(this);
        
        
        
        
        mbar.add(image);*/
        /*
        //creating menu of math
        JMenu math = new JMenu("Math");
        
        JMenuItem boolnot = new JMenuItem("NOT");
        math.add(boolnot);
        boolnot.addActionListener(this);
        math.addSeparator();
        JMenuItem  gamma = new JMenuItem("Gamma");
        math.add(gamma);
        gamma.addActionListener(this);
        math.addSeparator();
        JMenuItem log = new JMenuItem("Log");
        math.add(log);
        log.addActionListener(this);
        math.addSeparator();
        JMenuItem square = new JMenuItem("Square");
        math.add(square);
        square.addActionListener(this);
        math.addSeparator();
        JMenuItem squareroot = new JMenuItem("SquareRoot");
        math.add(squareroot);
        squareroot.addActionListener(this);
        math.addSeparator();
        JMenuItem reciprocal = new JMenuItem("Reciprocal");
        math.add(reciprocal);
        reciprocal.addActionListener(this);
        mbar.add(math);
        */
/////////////////////////creating menu of filters function of filter ////////////////////////////////////////////////////////////////////
        JMenu filters = new JMenu("Filters");
       JMenuItem gaussianblur = new JMenuItem("Gaussian Blur");
        filters.add(gaussianblur);
        gaussianblur.addActionListener(this);
     //   gaussianblur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        filters.addSeparator();
    
       JMenuItem  median = new JMenuItem("Median");
        filters.add(median);
        median.addActionListener(this);
        filters.addSeparator();
       JMenuItem mean = new JMenuItem("Mean");
        filters.add(mean);
        mean.addActionListener(this);
        filters.addSeparator();
        //focus in this
       JMenuItem minimum = new JMenuItem("Minimum");
        filters.add(minimum);
        minimum.addActionListener(this);       //this function to enable the filter functionn
        filters.addSeparator();
       JMenuItem maximum = new JMenuItem("Maximum");
        filters.add(maximum);
        maximum.addActionListener(this);       //this function to enable the filter functionn
        filters.addSeparator();
      
        mbar.add(filters);
               
        //creating submenu for smooth
        /*
        JMenu smooth=new JMenu("Smooth");
        JMenuItem smoothnine = new JMenuItem("Smooth 9x9");
        smooth.add(smoothnine);
        smoothnine.addActionListener(this);
        smooth.addSeparator();
        JMenuItem weightedsmoothnine = new JMenuItem("Weighted Smooth 9x9");
        smooth.add(weightedsmoothnine);
        weightedsmoothnine.addActionListener(this);
        smooth.addSeparator();
        JMenuItem threshholdaveraging = new JMenuItem("Threshhold Average");
        smooth.add(threshholdaveraging);
        threshholdaveraging.addActionListener(this);
        smooth.addSeparator();
        JMenuItem conservative = new JMenuItem("Conservative");
        smooth.add(conservative = new JMenuItem("Conservative"));
        conservative.addActionListener(this);
        */
        //creating process menu
        JMenu process = new JMenu("Process");
       JMenuItem sharpen = new JMenuItem("Sharpen");
        process.add(sharpen);
        sharpen.addActionListener(this);
        process.addSeparator();
       JMenuItem enhancecontrast=new JMenuItem("Contrast Stretch");
        enhancecontrast.addActionListener(this);
        process.add(enhancecontrast);
        process.addSeparator();
       JMenuItem equalizehistogram=new JMenuItem("Equalize Histogram");
        equalizehistogram.addActionListener(this);
        process.add(equalizehistogram);
        process.addSeparator();
       JMenuItem binary = new JMenuItem("Binary");
        process.add(binary);
        binary.addActionListener(this);
        process.addSeparator();
       JMenuItem findedges = new JMenuItem("Find Edges");
        process.add(findedges);
        findedges.addActionListener(this);
        process.addSeparator();
       JMenuItem emboss = new JMenuItem("Emboss");
        process.add(emboss);
        emboss.addActionListener(this);
        process.addSeparator();
       JMenuItem pencilsketch = new JMenuItem("Pencil Sketch");
        process.add(pencilsketch);
        pencilsketch.addActionListener(this);
        process.addSeparator();
   //    JMenuItem encrypt = new JMenuItem("Encrypt");
  //      process.add(encrypt);
  //      encrypt.addActionListener(this);
  //      process.addSeparator();
  //     JMenuItem decrypt = new JMenuItem("Decrypt");
  //      process.add(decrypt);
  //      decrypt.addActionListener(this);
        
        mbar.add(process);
                
        //creating analyze menu
        JMenu analyze = new JMenu("Analyze");
        JMenuItem histogram = new JMenuItem("Histogram");
        analyze.add(histogram);
        histogram.addActionListener(this);
        //analyze.addSeparator();
        //JMenuItem surfaceplot = new JMenuItem("Surface Plot");
        //analyze.add(surfaceplot);
        //surfaceplot.addActionListener(this);
        mbar.add(analyze);
                

      
        jlabel2 = new JLabel("",new ImageIcon(""),JLabel.LEFT);
        
        ImageIcon i4 = new ImageIcon("slim3d.jpg");
        jlabel4 = new JLabel("",i4,JLabel.LEFT);
        
               
               
        imageframe = new JInternalFrame("Image");
        imageframe.setSize(500,500);
        imageframe.add(jlabel3);
        imageframe.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        dp.add(imageframe);
   
        brightnesset = new JDialog(frame,"Adjust Brightness");
        brightnesset.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        brightnesset.setLayout(new FlowLayout());
        brightnesset.setSize(300,100);
        brightnesset.setVisible(false);
        submitbrightness=new JButton("Submit");
        submitbrightness.addActionListener(this);
        submitbrightness.setActionCommand("Submit Brightness");
        adjustbrightness=new JSlider(-50,50,0);
        adjustbrightness.setMinorTickSpacing(5);
        adjustbrightness.setMajorTickSpacing(20);
        adjustbrightness.setPaintTicks(true);
        adjustbrightness.setPaintLabels(true);
        brightnesset.add(adjustbrightness);
        brightnesset.add(submitbrightness);
        
        
        colourcontrastset = new JDialog(frame,"Adjust Colour Contrast");
        colourcontrastset.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        colourcontrastset.setLayout(new FlowLayout());
        colourcontrastset.setSize(300,100);
        colourcontrastset.setVisible(false);
        submitcolourcontrast=new JButton("Submit");
        submitcolourcontrast.addActionListener(this);
        submitcolourcontrast.setActionCommand("Submit Colour Contrast");
        adjustcolourcontrast=new JSlider(-50,50,0);
        adjustcolourcontrast.setMinorTickSpacing(5);
        adjustcolourcontrast.setMajorTickSpacing(20);
        adjustcolourcontrast.setPaintTicks(true);
        adjustcolourcontrast.setPaintLabels(true);
        colourcontrastset.add(adjustcolourcontrast);
        colourcontrastset.add(submitcolourcontrast);
        
        contrastset = new JDialog(frame,"Adjust Contrast");
        contrastset.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        contrastset.setLayout(new FlowLayout());
        contrastset.setSize(300,100);
          contrastset.setVisible(false);
          submitcontrast=new JButton("Submit");
          submitcontrast.addActionListener(this);
          submitcontrast.setActionCommand("Submit Contrast");
          adjustcontrast=new JSlider(-50,50,0);
          adjustcontrast.setMinorTickSpacing(5);
          adjustcontrast.setMajorTickSpacing(20);
          adjustcontrast.setPaintTicks(true);
          adjustcontrast.setPaintLabels(true);
          contrastset.add(adjustcontrast);
          contrastset.add(submitcontrast);
        
        regionset = new JDialog(frame,"Adjust Region");
        regionset.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        regionset.setLayout(new FlowLayout());
        regionset.setSize(300,100);
        regionset.setVisible(false);
        submitregion=new JButton("Submit");
        submitregion.addActionListener(this);
        submitregion.setActionCommand("Submit Region");
        adjustregion=new JSlider(0,25,1);
        adjustregion.setMinorTickSpacing(1);
        adjustregion.setMajorTickSpacing(5);
        adjustregion.setPaintTicks(true);
        adjustregion.setPaintLabels(true);
        regionset.add(adjustregion);
        regionset.add(submitregion);
        
        adjustsize = new JDialog(frame,"Adjust Size");
        adjustsize.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        adjustsize.setLayout(new FlowLayout());
        adjustsize.setSize(200,150);
        adjustsize.setVisible(false);
        submitsize=new JButton("Submit");
        submitsize.addActionListener(this);
        submitsize.setActionCommand("Submit Size");
        sizex=new JTextField("",4);
        sizey=new JTextField("",4);
        xsize=new JLabel("Width");
        xsize.setSize(80,10);
        ysize=new JLabel("Height");
        ysize.setSize(80,10);
        maintainaspect=new JCheckBox("Keep Aspect Ratio",false);
        maintainaspect.setSize(40,10);
        adjustsize.add(xsize);
        adjustsize.add(sizex);
        adjustsize.add(ysize);
        adjustsize.add(sizey);
        adjustsize.add(maintainaspect);
        adjustsize.add(submitsize);
        
        givepassword=new JDialog(frame,"Enter Password");
        givepassword.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        givepassword.setLayout(new FlowLayout());
        givepassword.setSize(270,100);
        givepassword.setVisible(false);
        passwordf=new JPasswordField(10);
        numberofcycles=new JTextField("",5);
        submitpassword=new JButton("Submit");
        submitpassword.addActionListener(this);
        submitpassword.setActionCommand("Submit Password");
        JLabel jlpass=new JLabel("Password");
        jlpass.setLabelFor(passwordf);
        JLabel jlcyc=new JLabel("cycles");
        jlcyc.setLabelFor(numberofcycles);
        givepassword.add(jlpass);
        givepassword.add(passwordf);
        givepassword.add(jlcyc);
        givepassword.add(numberofcycles);
        givepassword.add(submitpassword);
        
        giveangle=new JDialog(frame,"Rotation Angle");
        givepassword.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        giveangle.setLayout(new FlowLayout());
        giveangle.setSize(270,100);
        giveangle.setVisible(false);
        rotationangle=new JTextField("",5);
        submitrotationangle=new JButton("Submit");
        submitrotationangle.setActionCommand("Submit rotation angle");
        submitrotationangle.addActionListener(this);
        giveangle.add(new JLabel("Angle in radians"));
        giveangle.add(rotationangle);
        giveangle.add(submitrotationangle);
        
        entercolor=new JDialog(frame,"Enter Colors");
        entercolor.setLayout(new FlowLayout());
        entercolor.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton submitbothcolor=new JButton("Done");
        submitbothcolor.setActionCommand("both colors submitted");
        entercolor.setSize(500,700);
        submitbothcolor.addActionListener(this);
        entercolor.add(submitbothcolor);
        tcc1 = new JColorChooser();
        tcc1.getSelectionModel().addChangeListener(this);
        tcc2 = new JColorChooser();
        tcc2.getSelectionModel().addChangeListener(this);
        tcc1.setBorder(BorderFactory.createTitledBorder("Choose Color one "));
        tcc2.setBorder(BorderFactory.createTitledBorder("Choose Color two "));
         AbstractColorChooserPanel[] oldPanels = tcc1.getChooserPanels();
        // Remove panels
        for (int i=0; i<oldPanels.length; i++) {
        String clsName = oldPanels[i].getClass().getName();
        if (clsName.equals("javax.swing.colorchooser.DefaultSwatchChooserPanel")) {tcc1.removeChooserPanel(oldPanels[i]);}
        else if (clsName.equals("javax.swing.colorchooser.DefaultHSBChooserPanel")) {tcc1.removeChooserPanel(oldPanels[i]);}}
         oldPanels = tcc2.getChooserPanels();
        // Remove panels
        for (int i=0; i<oldPanels.length; i++) {
        String clsName = oldPanels[i].getClass().getName();
        if (clsName.equals("javax.swing.colorchooser.DefaultSwatchChooserPanel")){tcc2.removeChooserPanel(oldPanels[i]);}
        else if (clsName.equals("javax.swing.colorchooser.DefaultHSBChooserPanel")){tcc2.removeChooserPanel(oldPanels[i]);}}
        entercolor.add(tcc1);
        entercolor.add(tcc2);
        entercolor.add(submitbothcolor);
        
        
        stretchcontrast=new JDialog(frame,"Enter non-outliers");
        stretchcontrast.setLayout(new FlowLayout());
        stretchcontrast.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        stretchcontrast.setSize(270,100);
        JButton submitrange=new JButton("Submit");
        submitrange.addActionListener(this);
        submitrange.setActionCommand("stretchcontrast submitted");
        rangecont=new JTextField("1",5);
        stretchcontrast.add(new JLabel("Non-Outlier % "));
        stretchcontrast.add(rangecont);
        stretchcontrast.add(submitrange);
        
        gammabasis=new JDialog(frame,"Enter Basis");
        gammabasis.setLayout(new FlowLayout());
        gammabasis.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        gammabasis.setSize(270,100);
        JButton submitbasis=new JButton("Submit");
        submitbasis.addActionListener(this);
        submitbasis.setActionCommand("gamma basis submitted");
        basisgam=new JTextField("1",5);
        gammabasis.add(new JLabel("Enter power basis"));
        gammabasis.add(basisgam);
        gammabasis.add(submitbasis);
        
        
        fcc=new JFileChooser();
                
        jlabel1.setBounds(10,10,500,500);
        setVisible(true);
        
   }
     
   public void actionPerformed(ActionEvent ae){
      
        action=ae.getActionCommand();
            
        if(action!="Undo..."&&imageopen&&action!="Open..."&&action!="Crop"){
            rgbsundoarray=new int[width*height];
            for(int a=0;a<width*height;a++){
            rgbsundoarray[a]=rgbs[a];}
            widthundo=width;
            heightundo=height;
        }
        
        
        
        if(selrectformed&&action!="Crop"&&action!="Open..."&&action!="Save..."&&action!="Quit"){
            
    
        rgbsbuffer=new int[width*height];
        widthbuffer=width;
        heightbuffer=height; 
        for(int a=0;a<width*height;a++)
            {
            rgbsbuffer[a]=rgbs[a];
            }
        int initialx=(int)(rectix/imagescaleratio);
        int initialy=(int)(rectiy/imagescaleratio);
        int finalx=(int)(rectfx/imagescaleratio);
        int finaly=(int)(rectfy/imagescaleratio);
        int w=finalx-initialx+1;
        int h=finaly-initialy+1;
        BufferedImage buffer1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BufferedImage buffer2 = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        buffer1.setRGB(0, 0, width, height, rgbs, 0, width);
        buffer2 = buffer1.getSubimage(initialx, initialy, w, h);
        width=w;
        height=h;
        rgbs=new int[w*h];
        buffer2.getRGB(0, 0, width, height, rgbs, 0, width);
           
        }
       
    if(action=="Histogram"){
        BufferedImage bufferimage3 = new BufferedImage(532,500, BufferedImage.TYPE_INT_RGB);
        Graphics grahist= bufferimage3.createGraphics();
        drawhist(grahist);
        Image hist=toImage(bufferimage3);
        jlabel2.setIcon(new ImageIcon(hist));
        
        JFrame histogramframe=new JFrame("Histogram");
        histogramframe.setSize(650,550);
        histogramframe.add(jlabel2);
        histogramframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        histogramframe.setVisible(true);
        histogramframe.pack();
        dialogopen=true;
       }
       
   if(action=="Show Info"){
        BufferedImage bufferimage3 = new BufferedImage(532,500, BufferedImage.TYPE_INT_RGB);
        Graphics grahist= bufferimage3.createGraphics();
        String file="";
        
        for(int a=filename.length()-1;a>=0;a--){
            char x='b';
            x=filename.charAt(a);
            if((x+x)!=184){file=x+file;}
            else break;
        }
        filename=file;
        showinfo(grahist);
        Image info=toImage(bufferimage3);
        jlabel4.setIcon(new ImageIcon(info));
        JFrame infoframe=new JFrame("Information");
        infoframe.setSize(650,550);
        infoframe.add(jlabel4);
        infoframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        infoframe.setVisible(true);
        infoframe.pack();
        
       }    
       
       if (action=="Open...") {
   //     fcc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
     //       int returnVal = fcc.showDialog(Enhancer.this,"Open");
       //     if (returnVal == JFileChooser.APPROVE_OPTION) {
           //  inFrm.setVisible(false);
             inFrm.setVisible(false);
             BufferedImage filex = (BufferedImage)(grayC);
             BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);       
             buffer=(BufferedImage)loadimage(filex);
             
            filename=""+filex     ;
                   
            width=buffer.getWidth();
            height=buffer.getHeight();
            rgbs=new int[width*height];
            buffer.getRGB(0, 0, width, height, rgbs, 0, width);
           
            //imagedisplay = toImage(compressImage(bufferimage1 , 400.0 , 400.0));
            //i1=new ImageIcon(imagedisplay);
            //jlabel1.setIcon(i1);
            
            
            //jlabel1.setBounds(10,10,500,500);
            int brightnessincrement=10;
            int brightnessvalue=0;
            imageopen=true;
      //  }
//        if (returnVal == JFileChooser.CANCEL_OPTION) {}
        }
         
         
    if(action=="Save...") {
         fcc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = fcc.showDialog(Enhancer.this,"Save");
            if (returnVal == JFileChooser.APPROVE_OPTION) {
             BufferedImage  bufferimagesave = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
             bufferimagesave.setRGB(0, 0, width, height, rgbs, 0, width);
             File filex = fcc.getSelectedFile();
             saveimage(bufferimagesave,filex);
             
              //This is where a real application would save the file.
            }
    }
    if( "Quit".equals(action)){System.exit(0);}
    if( "Invert".equals(action)){invert();}//1
    if( "Black & White".equals(action)){blackandwhite();}//2
    if( "Smooth 9x9".equals(action)){smoothing();}//3
    if( "Weighted Smooth 9x9".equals(action)){weightedsmoothing();}//4
    if( "Median".equals(action)){filtermedian();}//5
    if( "Threshhold Average".equals(action)){threshholdaveraging();}//6
    if("Conservative".equals(action)){conservative();}//7
    if("Find Edges".equals(action)){findedgessuperb();}//8
    if("Sharpen".equals(action)){sharpen2();}//9
    if("SquareRoot".equals(action)){squareroot();}//10
    if("Log".equals(action)){log();}//11
    if("Square".equals(action)){square();}//12
    if("Reciprocal".equals(action)){reciprocal();}//13
    if("Flip vertical".equals(action)){flipvertical();}//14
    if("Flip horizontal".equals(action)){fliphorizontal();}//15
    if("Contrast".equals(action)){contrastset.setVisible(true);dialogopen=true;}//16
    if("Colour Contrast".equals(action)){colourcontrastset.setVisible(true);dialogopen=true;}//17
    if("Colour".equals(action)){colour();}//18
    if("Distribute".equals(action)){regionset.setVisible(true);dialogopen=true;}//19
    if("Fun".equals(action)){fun();}
    if("Binary".equals(action)){binary();}
    if("Pencil Sketch".equals(action)){pencilsketch();}
    if("Mean".equals(action)){}
    if("Swap Any Color".equals(action)){entercolor.setVisible(true);dialogopen=true;}
    if("Minimum".equals(action)){minimumfilter();} //focus this
    if("Maximum".equals(action)){maximumfilter();} //focus this
    if("Encrypt".equals(action)){givepassword.setVisible(true);password="encrypt";dialogopen=true;}
    if("Decrypt".equals(action)){givepassword.setVisible(true);password="decrypt";dialogopen=true;}
    if("Brightness".equals(action)){brightnesset.setVisible(true);dialogopen=true;}
    if("Size".equals(action)){adjustsize.setVisible(true);dialogopen=true;}
    if("Red and Green".equals(action)){swapcolor(1,1,0);}
    if("Red and Blue".equals(action)){swapcolor(1,0,1);}
    if("Blue and Green".equals(action)){swapcolor(0,1,1);}
    if("NOT".equals(action)){booleannot();}
    if("Flip arbitrary".equals(action)){giveangle.setVisible(true);dialogopen=true;}
    if("Crop".equals(action)){crop();}
    if("Transpose".equals(action)){transpose();}
    if("Emboss".equals(action)){emboss();}
    if("Cut...".equals(action)){cutimagepart();}
    if("Equalize Histogram".equals(action)){histogramequalisation();}
    if("Contrast Stretch".equals(action)){stretchcontrast.setVisible(true);dialogopen=true;}
    if("Gamma".equals(action)){gammabasis.setVisible(true);dialogopen=true;}
    if("Save as...".equals(action)){function();}
    
    if(action.length()>11&&action.charAt(11)=='.'){String turns=action.substring(12,action.length());makecolor((int)Double.parseDouble(turns));}
    //{String turns=action.substring(12,action.length());makecolor((int)Double.parseDouble(turns));}
     
   
    if(action=="Undo..."){ 
        width=widthundo;
        height=heightundo;
        rgbs=new int[width*height];
        for(int a=0;a<width*height;a++){
        rgbs[a]=rgbsundoarray[a];
        
        
        }
      
    }
    
        
    if(action=="Submit Brightness"){
    brightnessincrement=adjustbrightness.getValue();
    brightnesset.setVisible(false);
    adjustbrightness.setValue(0);
    brightnesset.dispose();
    bright(brightnessincrement);
    dialogopen=false;
    
    }
    
    if(action=="Submit Region"){
    regions=adjustregion.getValue();
    regionset.dispose();
    distribute();
    dialogopen=false;
    }
    
    if(action=="Submit Size"){
    
    int widt=(int)Double.parseDouble(sizex.getText());
    int hieg=(int)Double.parseDouble(sizey.getText());
    if(maintainaspect.isSelected()){hieg=(int)((height*widt*1.0)/(width*1.0));}    
    adjustsize.dispose(); 
    adjustsize(widt,hieg);
    dialogopen=false;
    }
    if(action=="Submit Password"){
    boolean enc=(password=="encrypt")?true:false;
    password="";
    char[] input = passwordf.getPassword();
    for(int xa=0;xa<input.length;xa++){
    password=password+input[xa];
 
    }
    
    //password=passwordf.getText();
    encryptationcycles=(int)Double.parseDouble(numberofcycles.getText());
    givepassword.dispose(); 
    if(enc){
        for(int a=0;a<2*encryptationcycles;a++){
        encrypt2();}
        encrypt();
        
    }
    else{
          decrypt();
          for(int a=0;a<2*encryptationcycles;a++){
          decrypt2();}
        
    }
    dialogopen=false;
    }
    
    if( "Submit rotation angle".equals(action)){
        double angle=Double.parseDouble(rotationangle.getText());
        giveangle.dispose();
        fliparbitrary(angle);   
        
    dialogopen=false;
    
    }
    
    if( "Submit Colour Contrast".equals(action)){
        
       int co=adjustcolourcontrast.getValue();
       colourcontrast(co);
       colourcontrastset.setVisible(false);
       adjustcolourcontrast.setValue(0);
       colourcontrastset.dispose();
       dialogopen=false;
        
    }
    
    if( "Submit Contrast".equals(action)){
        
       int co=adjustcontrast.getValue();
       contrast(co);
       contrastset.setVisible(false);
       adjustcontrast.setValue(0);
       contrastset.dispose();
       dialogopen=false;
        
    }
    
    if( "both colors submitted".equals(action)){
       Color colorsel1=tcc1.getColor();
       Color colorsel2=tcc2.getColor();
       entercolor.dispose();
       double red1=colorsel1.getRed();
       double green1=colorsel1.getGreen();
       double blue1=colorsel1.getBlue();
       double red2=colorsel2.getRed();
       double green2=colorsel2.getGreen();
       double blue2=colorsel2.getBlue();
       
       anycolorswap(red1,green1,blue1,red2,green2,blue2);
       dialogopen=false;
        
    }
    
    if(action=="stretchcontrast submitted"){
         double x=Double.parseDouble(rangecont.getText());
         stretchcontrast.dispose();
         contraststretching(x);
         dialogopen=false;
    
    
    }
    
     if(action=="gamma basis submitted"){
         double x=Double.parseDouble(basisgam.getText());
         gammabasis.dispose();
         gammacorrection(x);
         dialogopen=false;    
    
    
    
    }
    
    
    
    if(selrectformed&&action!="Crop"&&action!="Open..."&&action!="Save..."&&action!="Quit"){
        int initialx=(int)(rectix/imagescaleratio);
        int initialy=(int)(rectiy/imagescaleratio);
        int finalx=(int)(rectfx/imagescaleratio);
        int finaly=(int)(rectfy/imagescaleratio);
        int w=finalx-initialx+1;
        int h=finaly-initialy+1;
        width=widthbuffer;
        height=heightbuffer;
        
        BufferedImage buffer1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BufferedImage buffer2 = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        buffer1.setRGB(0, 0, width, height, rgbsbuffer, 0, width);
        buffer2.setRGB(0, 0, w, h, rgbs, 0, w);
        Graphics2D graregion=buffer1.createGraphics();
        graregion.drawImage(buffer2,initialx,initialy,this);
        rgbs=new int[width*height];
        buffer1.getRGB(0, 0, width, height, rgbs, 0, width);
        
        
    }

        selrectformed=false;
             rectix=0;
             rectiy=0;
             rectfx=0;
             rectfy=0;
             initmousex=0;
             initmousey=0;
             finamousex=0;
             finamousey=0;
             nowmousex=0;
             nowmousey=0;
           
                    
            
       
       
    BufferedImage buffer = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    
    buffer.setRGB(0, 0, width, height, rgbs, 0, width);
   
    //jlabel1.setIcon((jlabel3.getIcon()));  // uncomment this line to show just previous image instead of loaded image
    limitingframewidth=0;
    if(height<=maximageframesize&&width<=maximageframesize){limitingframewidth=(height>width)?height:width;}
    else{limitingframewidth=maximageframesize;}
    
   
    jlabel1.setText(""+width+"x"+height+" Number of pixels : "+width*height);
    bufferimagedisplay= (compressImage(buffer,limitingframewidth*1.0 , limitingframewidth*1.0)); //originalImage
    bufferimagedisplay2= (compressImage(buffer,limitingframewidth*1.0 , limitingframewidth*1.0));
   
    jlabel3.setIcon( new ImageIcon(toImage(bufferimagedisplay))); //setImage
    jlabel3.setSize(width,height);
    imageframe.setResizable(true); // the size of the frame put the image into the frame, originalImage
    imageframe.pack();
    if(!dialogopen&&!otherframeopen)imageframe.setVisible(true);
 //   frame.pack();
 //   frame.setVisible(true);

               
    }
 ////////////////////////////////////////////////mouse   
    @Override
    public void mousePressed(MouseEvent me){
    jlabel3.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    initmousex=me.getX();
    initmousey=me.getY();
    if((me.getX()<rectfx&&me.getX()>rectix)&&(me.getY()<rectfy&&me.getY()>rectiy))
    {
    selectedrectdragged=true;
    dragstartcoordinatex=me.getX();
    dragstartcoordinatey=me.getY();
    }
    else {selectedrectdragged=false;}
    
    if(selrectformed&&(!selectedrectdragged)){
        
        bufferimagedisplay=copybuffimage(bufferimagedisplay2);
        
     
        jlabel3.setIcon( new ImageIcon(toImage(bufferimagedisplay)));
        imageframe.pack();
        imageframe.setVisible(true);
        selrectformed=false;
    }
}

public void mouseReleased(MouseEvent me){
    jlabel3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    finamousex=me.getX();
    finamousey=me.getY();
 //  if(initmousex==finamousex&&initmousey==finamousey&&selrectformed){selectedrectdragged=false;}

}


public void mouseDragged(MouseEvent me){
    
    if(!selectedrectdragged){
    nowmousex=me.getX();
    nowmousey=me.getY();
   bufferimagedisplay=copybuffimage(bufferimagedisplay2);
    Graphics gracrop = bufferimagedisplay.createGraphics();
    paintcrop(initmousex,initmousey,nowmousex,nowmousey,gracrop);
    selrectformed=true;
   
      
        jlabel3.setIcon(new ImageIcon(toImage(bufferimagedisplay)));
    }
    if(selectedrectdragged){
    nowmousex=me.getX();
    nowmousey=me.getY();
   
    bufferimagedisplay=copybuffimage(bufferimagedisplay2);
    Graphics gracrop= bufferimagedisplay.createGraphics();
    int x1=rectix;
    int x2=rectfx;
    int y1=rectiy;
    int y2=rectfy;
    
    paintcrop(x1+me.getX()-dragstartcoordinatex,y1+me.getY()-dragstartcoordinatey,x2+me.getX()-dragstartcoordinatex,y2+me.getY()-dragstartcoordinatey,gracrop);
    dragstartcoordinatex=me.getX();
    dragstartcoordinatey=me.getY();
    selrectformed=true;
    
     
        jlabel3.setIcon( new ImageIcon(toImage(bufferimagedisplay)));
    }
    
    
    selrectformed=true;
}
       

public void mouseClicked(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}

public void mouseMoved(MouseEvent me){
    
    int mouseex=(int)(me.getX()/imagescaleratio);
    int mouseey=(int)(me.getY()/imagescaleratio);
       Color col=new Color(bufferimagedisplay.getRGB(me.getX(),me.getY()));
    
       //jlabel1.setText(""+width+"x"+height+" pixels : "+width*height+" X :"+me.getX()+" Y :"+me.getY()+" "+col.getRed()+","+col.getGreen()+","+col.getBlue());
    jlabel1.setText(""+width+"x"+height+" pixels : "+width*height+" X :"+mouseex+" Y :"+mouseey+" "+col.getRed()+","+col.getGreen()+","+col.getBlue());
}

/////// end mouse function///////////////////////////////////////////////////////////////\\

    public void itemStateChanged(ItemEvent ie){}

    public void stateChanged(ChangeEvent e) {}

  


    public BufferedImage compressImage(BufferedImage bufferimage,double wid,double hiet){

        AffineTransform tx = new AffineTransform();
        double ratio = (width>height)?(wid/width):(hiet/height);
        tx.scale(ratio,ratio);
        tx.shear(0,0);
        tx.translate(0,0);
        tx.rotate(0);
        imagescaleratio=ratio;
        //System.out.println(""+tx.getDeterminant());
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        bufferimage = op.filter(bufferimage, null);
        return bufferimage;
        
    }
 
    public Image loadimage(BufferedImage file){
        Image image=null;
    
        image = grayC;
         return image;
    }
    
    public void saveimage(BufferedImage imagesave , File file){
    
            try
        {
       ImageIO.write(imagesave, "png", file);
        }
        catch(Exception e){}
}
    
    public void invert()
        {
        int a=0;
        for(a=0;a<rgbs.length;a++){
            Color col = new Color(rgbs[a]);
            int red = 255-col.getRed();
            int blue = 255-col.getBlue();
            int green = 255-col.getGreen();
            int alpha = 255-col.getAlpha();
    
            col = new Color(red,green,blue,alpha);
            rgbs[a]=col.getRGB();
        }
    }


    public void blackandwhite()
    {
        int a=0;
        for(a=0;a<rgbs.length;a++){
            Color col = new Color(rgbs[a]);
            int component = (int)(.299*col.getRed()+.114*col.getBlue()+.587*col.getGreen());
    
            col = new Color(component,component,component);
            rgbs[a]=col.getRGB();
    
        }
    }

    public void smoothing(){

    int a=0;
    int w=width;
    int h=height;
    int rgbsx[] = new int[w*h];
    for(a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){

        Color col1 = new Color(rgbs[a-w-1]);
        Color col2 = new Color(rgbs[a-w]);
        Color col3 = new Color(rgbs[a-w+1]);
        Color col4 = new Color(rgbs[a-1]);
        Color col5 = new Color(rgbs[a]);
        Color col6 = new Color(rgbs[a+1]);
        Color col7 = new Color(rgbs[a+w-1]);
        Color col8 = new Color(rgbs[a+w]);
        Color col9 = new Color(rgbs[a+w+1]);

        int red1=col1.getRed();
        int red2=col2.getRed();
        int red3=col3.getRed();
        int red4=col4.getRed();
        int red5=col5.getRed();
        int red6=col6.getRed();
        int red7=col7.getRed();
        int red8=col8.getRed();
        int red9=col9.getRed();

        int blue1=col1.getBlue();
        int blue2=col2.getBlue();
        int blue3=col3.getBlue();
        int blue4=col4.getBlue();
        int blue5=col5.getBlue();
        int blue6=col6.getBlue();
        int blue7=col7.getBlue();
        int blue8=col8.getBlue();
        int blue9=col9.getBlue();

        int green1=col1.getGreen();
        int green2=col2.getGreen();
        int green3=col3.getGreen();
        int green4=col4.getGreen();
        int green5=col5.getGreen();
        int green6=col6.getGreen();
        int green7=col7.getGreen();
        int green8=col8.getGreen();
        int green9=col9.getGreen();

        red5=(red5+red1+red2+red3+red4+red6+red7+red8+red9)/9;
        blue5=(blue5+blue1+blue2+blue3+blue4+blue6+blue7+blue8+blue9)/9;
        green5=(green5+green1+green2+green3+green4+green6+green7+green8+green9)/9;

        Color col = new Color(red5,green5,blue5);
        rgbsx[a]=col.getRGB();



        }
    }
    for(int qw=0;qw<width*height;qw++){
        rgbs[qw]=rgbsx[qw];}


    }

    public void weightedsmoothing(){
    
        int a=0;
        int w=width;
        int h=height;
        for(a=0;a<rgbs.length;a++){
            if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){
    
            Color col1 = new Color(rgbs[a-w-1]);
            Color col2 = new Color(rgbs[a-w]);
            Color col3 = new Color(rgbs[a-w+1]);
            Color col4 = new Color(rgbs[a-1]);
            Color col5 = new Color(rgbs[a]);
            Color col6 = new Color(rgbs[a+1]);
            Color col7 = new Color(rgbs[a+w-1]);
            Color col8 = new Color(rgbs[a+w]);
            Color col9 = new Color(rgbs[a+w+1]);
    
            int red1=col1.getRed();
            int red2=col2.getRed();
            int red3=col3.getRed();
            int red4=col4.getRed();
            int red5=col5.getRed();
            int red6=col6.getRed();
            int red7=col7.getRed();
            int red8=col8.getRed();
            int red9=col9.getRed();
    
            int blue1=col1.getBlue();
            int blue2=col2.getBlue();
            int blue3=col3.getBlue();
            int blue4=col4.getBlue();
            int blue5=col5.getBlue();
            int blue6=col6.getBlue();
            int blue7=col7.getBlue();
            int blue8=col8.getBlue();
            int blue9=col9.getBlue();
    
            int green1=col1.getGreen();
            int green2=col2.getGreen();
            int green3=col3.getGreen();
            int green4=col4.getGreen();
            int green5=col5.getGreen();
            int green6=col6.getGreen();
            int green7=col7.getGreen();
            int green8=col8.getGreen();
            int green9=col9.getGreen();
    
            red5=(4*red5+red1+2*red2+red3+2*red4+2*red6+red7+2*red8+red9)/16;
            blue5=(4*blue5+blue1+2*blue2+blue3+2*blue4+2*blue6+blue7+2*blue8+blue9)/16;
            green5=(4*green5+green1+2*green2+green3+2*green4+2*green6+green7+2*green8+green9)/16;
    
            Color col = new Color(red5,green5,blue5);
            rgbs[a]=col.getRGB();
         }
        }
    }

    
   

    public void filtermedian(){

    int a=0;
    int w=width;
    int h=height;
    Color col[]=new Color[9];
    int intense[]=new int[9];
    int intensecopy[]=new int[9];
    int rgbsx[]=new int[w*h];
    for(a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){

        col[0] = new Color(rgbs[a-w-1]);
        col[1] = new Color(rgbs[a-w]);
        col[2] = new Color(rgbs[a-w+1]);
        col[3] = new Color(rgbs[a-1]);
        col[4] = new Color(rgbs[a]);
        col[5] = new Color(rgbs[a+1]);
        col[6] = new Color(rgbs[a+w-1]);
        col[7] = new Color(rgbs[a+w]);
        col[8] = new Color(rgbs[a+w+1]);

        for(int b=0;b<9;b++){
            intense[b]=(col[b].getRed()+col[b].getGreen()+col[b].getBlue())/3;
            intensecopy[b]=intense[b];
        }
        Arrays.sort(intense);
        int element = intense[4];
        int index=4;
        for(int c=0;c<9;c++)
            {
            if(element==intensecopy[c]){index=c;}
            }
        rgbsx[a]=col[index].getRGB();
        }}
        for(a=0;a<width*height;a++){
        rgbs[a]=rgbsx[a];
    }}
    
     public void filtermedian2(){

    int a=0;
    int w=width;
    int h=height;
    Color col[]=new Color[9];
    int intense[]=new int[9];
    int intensecopy[]=new int[9];
    for(a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){

        col[0] = new Color(rgbs[a-w-1]);
        col[1] = new Color(rgbs[a-w]);
        col[2] = new Color(rgbs[a-w+1]);
        col[3] = new Color(rgbs[a-1]);
        col[4] = new Color(rgbs[a]);
        col[5] = new Color(rgbs[a+1]);
        col[6] = new Color(rgbs[a+w-1]);
        col[7] = new Color(rgbs[a+w]);
        col[8] = new Color(rgbs[a+w+1]);

        for(int b=0;b<9;b++){
            intense[b]=(col[b].getRed()+col[b].getGreen()+col[b].getBlue())/3;
            intensecopy[b]=intense[b];
        }
        Arrays.sort(intense);
        int element = intense[4];
        int index=4;
        for(int c=0;c<9;c++)
            {
            if(element==intensecopy[c]){index=c;}
            }
        rgbs[a]=col[index].getRGB();
        }}
        
    }


    public void threshholdaveraging(){
    int a=0;
    int w=width;
    int h=height;
    for(a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){

        Color col1 = new Color(rgbs[a-w-1]);
        Color col2 = new Color(rgbs[a-w]);
        Color col3 = new Color(rgbs[a-w+1]);
        Color col4 = new Color(rgbs[a-1]);
        Color col5 = new Color(rgbs[a]);
        Color col6 = new Color(rgbs[a+1]);
        Color col7 = new Color(rgbs[a+w-1]);
        Color col8 = new Color(rgbs[a+w]);
        Color col9 = new Color(rgbs[a+w+1]);

        int red1=col1.getRed();
        int red2=col2.getRed();
        int red3=col3.getRed();
        int red4=col4.getRed();
        int red5=col5.getRed();
        int red6=col6.getRed();
        int red7=col7.getRed();
        int red8=col8.getRed();
        int red9=col9.getRed();

        int blue1=col1.getBlue();
        int blue2=col2.getBlue();
        int blue3=col3.getBlue();
        int blue4=col4.getBlue();
        int blue5=col5.getBlue();
        int blue6=col6.getBlue();
        int blue7=col7.getBlue();
        int blue8=col8.getBlue();
        int blue9=col9.getBlue();

        int green1=col1.getGreen();
        int green2=col2.getGreen();
        int green3=col3.getGreen();
        int green4=col4.getGreen();
        int green5=col5.getGreen();
        int green6=col6.getGreen();
        int green7=col7.getGreen();
        int green8=col8.getGreen();
        int green9=col9.getGreen();

        int redx=(red5+red1+red2+red3+red4+red6+red7+red8+red9)/9;
        int bluex=(blue5+blue1+blue2+blue3+blue4+blue6+blue7+blue8+blue9)/9;
        int greenx=(green5+green1+green2+green3+green4+green6+green7+green8+green9)/9;

        if((redx-red5)*(redx-red5)>5){red5=redx;}
        if((bluex-blue5)*(bluex-blue5)>5){blue5=bluex;}
        if((greenx-green5)*(greenx-green5)>5){green5=greenx;}
        Color col = new Color(red5,green5,blue5);
        rgbs[a]=col.getRGB();
        }
    }
    }


    public void conservative2(){

    int a=0;
    int w=width;
    int h=height;
    Color col[]=new Color[25];
    int intense[]=new int[25];
    for(a=0;a<rgbs.length;a++){
        if(!((a<2*w)||(a>(w*(h-2)-1))||(a%w==0)||((a+1)%(w))==0||((a-1)%w==0)||((a+2)%w==0))){

        for(int x=0;x<25;x++){
          //System.out.println(""+a+((x/5)-2)*w+(x-2));
         // System.out.println(""+w+h);
          col[x]=new Color(rgbs[a+((x/5)-2)*w+(x%5-2)]);
          
          
          
          
          }
            
        int max=-1;
        int min=10000;

        for(int b=0;b<25;b++){
            intense[b]=col[b].getRed()+col[b].getGreen()+col[b].getBlue();
            if(b!=12){
            max=(intense[b]>max)?intense[b]:max;
            min=(intense[b]<min)?intense[b]:min;}
        }

        int index;
        if(max<intense[12]){index=24;}
        else if(min>intense[12]){index=0;}
        else{index=12;}
        rgbs[a]=col[index].getRGB();
        }
    }
    }
    
    public void conservative(){

    int a=0;
    int w=width;
    int h=height;
    Color col[]=new Color[9];
    int intense[]=new int[9];
    for(a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){

        for(int x=0;x<9;x++){
          //System.out.println(""+a+((x/5)-2)*w+(x-2));
         // System.out.println(""+w+h);
          col[x]=new Color(rgbs[a+((x/3)-1)*w+(x%3-1)]);
          
          
          
          
          }
            
        int max=-1;
        int min=10000;

        for(int b=0;b<9;b++){
            intense[b]=col[b].getRed()+col[b].getGreen()+col[b].getBlue();
            if(b!=4){
            max=(intense[b]>max)?intense[b]:max;
            min=(intense[b]<min)?intense[b]:min;}
        }

        int index;
        if(max<intense[4]){index=8;}
        else if(min>intense[4]){index=0;}
        else{index=4;}
        rgbs[a]=col[index].getRGB();
        }
    }
    }
    
    
    public void findedges(){
        
 
   
    int w=width;
    int h=height;
   
    
    int rgbs2[]=new  int[w*h];
     
      for(int b=0;b<1;b++){
          for(int a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){


        Color col2 = new Color(rgbs[a-w]);
        Color col4 = new Color(rgbs[a-1]);
        Color col5 = new Color(rgbs[a]);
        Color col6 = new Color(rgbs[a+1]);
        Color col8 = new Color(rgbs[a+w]);



        int red2=col2.getRed();
        int red4=col4.getRed();
        int red5=col5.getRed();
        int red6=col6.getRed();
        int red8=col8.getRed();


        int blue2=col2.getBlue();
        int blue4=col4.getBlue();
        int blue5=col5.getBlue();
        int blue6=col6.getBlue();
        int blue8=col8.getBlue();

        int green2=col2.getGreen();
        int green4=col4.getGreen();
        int green5=col5.getGreen();
        int green6=col6.getGreen();
        int green8=col8.getGreen();


        red5=(red5+red2+red4+red6+red8)/5;
        blue5=(blue5+blue2+blue4+blue6+blue8)/5;
        green5=(green5+green2+green4+green6+green8)/5;

        Color col = new Color(red5,green5,blue5);
        rgbs2[a]=col.getRGB();
       
        }}
        
}
      
    
        //System.out.println("part 1 completed");
        
        for(int a=0;a<w*h;a++){
            
           int red=(new Color(rgbs[a])).getRed();
           int blue=(new Color(rgbs[a])).getBlue();
           int green=(new Color(rgbs[a])).getGreen();
           
           int red1=(new Color(rgbs2[a])).getRed();
           int blue1=(new Color(rgbs2[a])).getBlue();
           int green1=(new Color(rgbs2[a])).getGreen();
           
           red1=Math.abs(red1-red);
           green1=Math.abs(green1-green);
           blue1=Math.abs(blue1-blue);
           
           red1=(red1*10>255)?255:red1*10;
           green1=(green1*10>255)?255:green1*10;
           blue1=(blue1*10>255)?255:blue1*10;
           
          
           
           
           
           
          Color col=new Color((int)(red1),(int)(green1),(int)(blue1)); 
          rgbs[a]=col.getRGB();
          
          }
        
              
           }
          
          
    public void drawhist2(Graphics grahist){
    
    int w=width;
    int h=height; 
    
    int intense[]=new int[256];
    int reda[]=new int[256];
    int greena[]=new int[256];
    int bluea[]=new int[256];
    
    int max=0;
    int maxred=0;
    int maxblue=0;
    int maxgreen=0;
    int maxintensity=0;
    int minintensity=10000;
    double meanintensity=0;
    for(int a=0;a<w*h;a++){
                
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
               int intensity=Math.abs((red+blue+green)/3);
               maxintensity=(intensity>maxintensity)?intensity:maxintensity;
               minintensity=(intensity<minintensity)?intensity:minintensity;
               intense[intensity]++;
               reda[red]++;
               greena[green]++;
               bluea[blue]++;
         
            }
    for(int b=0;b<256;b++){
    max=(intense[b]>max)?intense[b]:max;
    maxred=(reda[b]>maxred)?reda[b]:maxred;
    maxgreen=(greena[b]>maxgreen)?greena[b]:maxgreen;
    maxblue=(bluea[b]>maxblue)?bluea[b]:maxblue;
    meanintensity=meanintensity+intense[b]*b;
    }
    meanintensity=meanintensity/(w*h);
    
    max=(max>maxred)?max:maxred;
    max=(max>maxgreen)?max:maxgreen;
    max=(max>maxblue)?max:maxblue;
    
    double scale = 256.0/max;
    int xpace=10;
    for(int a=0;a<256;a++){
    grahist.setColor(Color.white);
    //grahist.drawOval(xpace+a*2,300-(int)(intense[a]*scale),1,1);
    
    if(a!=0){
    grahist.drawLine(xpace+a*2,300-(int)(intense[a]*scale),xpace+(a-1)*2,300-(int)(intense[a-1]*scale));
    grahist.setColor(Color.red);
    grahist.drawLine(xpace+a*2,300-(int)(reda[a]*scale),xpace+(a-1)*2,300-(int)(reda[a-1]*scale));
    grahist.setColor(Color.green);
    grahist.drawLine(xpace+a*2,300-(int)(greena[a]*scale),xpace+(a-1)*2,300-(int)(greena[a-1]*scale));
    grahist.setColor(Color.blue);
    grahist.drawLine(xpace+a*2,300-(int)(bluea[a]*scale),xpace+(a-1)*2,300-(int)(bluea[a-1]*scale));
    }
    grahist.setColor(Color.red);
    grahist.drawLine(10,300,512,300);
    
    //uncomment following lines to give a blue look to hist
    //grahist.setColor(Color.blue);
    //grahist.drawLine(xpace+a*2,300,xpace+a*2,302-(int)(intense[a]*scale));
    }
    
    
    grahist.setColor(new Color(100,100,100));
    grahist.drawRect(8,40,514,260);
    
    grahist.setColor(new Color(200,200,200));
    grahist.setFont(new Font("Dialog",Font.BOLD,12));
    grahist.drawString("Pixel Count : "+w*h,100,320);
    grahist.drawString("Minimum : "+minintensity,100,335);
    grahist.drawString("Maximum : "+maxintensity,100,350);
    grahist.drawString("Mean : "+meanintensity,100,365);
            
            
            
            }
            
public void drawhist(Graphics grahist){
    
    int w=width;
    int h=height; 
    
    int intense[]=new int[256];
    int max=0;
    int maxintensity=0;
    int minintensity=10000;
    double meanintensity=0;
    for(int a=0;a<w*h;a++){
                
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
               int intensity=Math.abs((red+blue+green)/3);
               maxintensity=(intensity>maxintensity)?intensity:maxintensity;
               minintensity=(intensity<minintensity)?intensity:minintensity;
               intense[intensity]++;
         
            }
    for(int b=0;b<256;b++){
    max=(intense[b]>max)?intense[b]:max;
    meanintensity=meanintensity+intense[b]*b;
    }
    meanintensity=meanintensity/(w*h);
    
    
    double scale = 256.0/max;
    int xpace=10;
    for(int a=0;a<256;a++){
    grahist.setColor(Color.green);
    grahist.drawOval(xpace+a*2,300-(int)(intense[a]*scale),1,1);
    
    if(a!=0){
    grahist.drawLine(xpace+a*2,300-(int)(intense[a]*scale),xpace+(a-1)*2,300-(int)(intense[a-1]*scale));}
    grahist.setColor(Color.red);
    grahist.drawLine(10,300,512,300);
    
    //uncomment following lines to give a blue look to hist
    //grahist.setColor(Color.blue);
    //grahist.drawLine(xpace+a*2,300,xpace+a*2,302-(int)(intense[a]*scale));
    }
    
    
    grahist.setColor(Color.white);
    grahist.drawRect(8,40,514,260);
    
    grahist.setFont(new Font("Dialog",Font.BOLD,12));
    grahist.drawString("Pixel Count : "+w*h,100,320);
    grahist.drawString("Minimum : "+minintensity,100,335);
    grahist.drawString("Maximum : "+maxintensity,100,350);
    grahist.drawString("Mean : "+meanintensity,100,365);
            
            
            
            }
       
    public void squareroot(){
    
    for(int a=0;a<width*height;a++){
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
    
               Color col = new Color((int)Math.pow(red,0.5),(int)Math.pow(green,0.5),(int)Math.pow(blue,0.5));
               rgbs[a]=col.getRGB();
    
    }
    
    }
    
    public void log(){
    
    for(int a=0;a<width*height;a++){
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
                 
               if(red!=0)red=(int)Math.log(red);
               if(green!=0)green=(int)Math.log(green);
               if(blue!=0)blue=(int)Math.log(blue);
                
               Color col = new Color(red,green,blue);
               rgbs[a]=col.getRGB();
    
    }
    
    }
    
    public void square(){
    
    for(int a=0;a<width*height;a++){
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
                 
               red=(red*red>255)?255:red*red;
               green=(green*green>255)?255:green*green;
               blue=(blue*blue>255)?255:blue*blue;
               
               Color col = new Color(red,green,blue);
               rgbs[a]=col.getRGB();
    
    }
    
    }
    
    public void reciprocal(){
    
    for(int a=0;a<width*height;a++){
               int red=(new Color(rgbs[a])).getRed();
               int blue=(new Color(rgbs[a])).getBlue();
               int green=(new Color(rgbs[a])).getGreen();
                 
               double byred=(255.0)/(red*1.0+1.0);
               double bygreen=(255.0)/(green*1.0+1.0);
               double byblue = (255.0)/(blue*1.0+1.0);
                
               Color col = new Color((int)byred,(int)bygreen,(int)byblue);
               rgbs[a]=col.getRGB();
    
    }
    
    }
    
    public void flipvertical(){
    
    int rgbsx[] = new int[width*height];
    int index=0;
    for(int a=0;a<height;a++){
    for(int b=0;b<width;b++){
    rgbsx[index] = rgbs[(height-a-1)*width+b];
    index++;
    }
    }
    for(int a=0;a<width*height;a++){
        rgbs[a]=rgbsx[a];
    }
}
    public void fliphorizontal(){
    
    int rgbsx[] = new int[width*height];
    int index=0;
    for(int a=0;a<height;a++){
    for(int b=0;b<width;b++){
    rgbsx[index] = rgbs[(a+1)*width-1-b];
    index++;
    }
    }
    for(int a=0;a<width*height;a++){
        rgbs[a]=rgbsx[a];
    }}
    
    public void fliparbitrary(double anglerot){
    
       BufferedImage bufferimagethis = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       bufferimagethis.setRGB(0, 0, width, height, rgbs, 0, width);
       
       
       AffineTransform tx = new AffineTransform();
              
        tx.scale(1.0,1.0);
        tx.shear(0,0);
        tx.translate(0,0);
        tx.rotate(anglerot,bufferimagethis.getWidth()/2, bufferimagethis.getHeight()/2);
        //System.out.println(""+tx.getDeterminant());
        
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        bufferimagethis = op.filter(bufferimagethis, null);
       
        rgbs=new int[width*height];
        bufferimagethis.getRGB(0, 0, width, height, rgbs, 0, width);
    
    
    
    }
    
    public void findedges2(){
  
    int rgbsx[] = new int[width*height];
    int colour[][] = new int[width*height][4];
    int w=width;
    int h=height;
    
    for(int a=0;a<width*height;a++){
    
    Color col=new Color(rgbs[a]);
    colour[a][0]=col.getRed();
    colour[a][1]=col.getGreen();
    colour[a][2]=col.getBlue();
    colour[a][3]=col.getRed()+col.getGreen()+col.getBlue();
    }
    
    for(int a=0;a<width*height;a++){
    int checker=0;
    if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){
    if(colour[a][3]==colour[a-w-1][3]){checker++;}
    if(colour[a][3]==colour[a-w][3]){checker++;}
    if(colour[a][3]==colour[a-w+1][3]){checker++;}
    if(colour[a][3]==colour[a-1][3]){checker++;}
    if(colour[a][3]==colour[a+1][3]){checker++;}
    if(colour[a][3]==colour[a+w-1][3]){checker++;}
    if(colour[a][3]==colour[a+w][3]){checker++;}
    if(colour[a][3]==colour[a+w+1][3]){checker++;}
    if(checker!=5){rgbs[a]=(Color.black).getRGB();}
    if(checker==5){rgbs[a]=(Color.white).getRGB();}
    }}
    }
    
        
    public void contrast1(){
       
    for(int a=0 ;a < width*height;a++){
    Color col=new Color(rgbs[a]);
    int red=col.getRed();
    int green=col.getGreen();
    int blue=col.getBlue();
    
    if(red>128){red=(red*1.2>255)?255:(int)(red*1.2);}
    if(red<128){red=(int)(red/1.2);}
    
    if(green>128){green=(green*1.2>255)?255:(int)(green*1.2);}
    if(green<128){green=(int)(green/1.2);}
    
    if(blue>128){blue=(blue*1.2>255)?255:(int)(blue*1.2);}
    if(blue<128){blue=(int)(blue/1.2);}
    
    rgbs[a]=(new Color(red,green,blue)).getRGB();
    }
}
    
public void contrast(int percentage){
    
    
    double mean=0;
    double adder=(1.0+(percentage/100.0));
    
    for(int a=0;a<width*height;a++){
         Color col=new Color(rgbs[a]);
         mean=mean+col.getRed()+col.getGreen()+col.getBlue();
     }
     mean=mean/(width*height);
     for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        double red=col.getRed();
        double green=col.getGreen();
        double blue=col.getBlue();
        if(percentage>0){
        if(red+green+blue>mean){red=(red*adder<255)?red*adder:255;green=(green*adder<255)?green*adder:255;blue=(blue*adder<255)?blue*adder:255;}
        if(red+green+blue<mean){red=red/adder;green=green/adder;blue=blue/adder;}
        }
        if(percentage<0){
        if(red+green+blue>mean){red=red*adder;green=green*adder;blue=blue*adder;}
        if(red+green+blue<mean){red=(red/adder>255)?255:red/adder;green=(green/adder>255)?255:green/adder;blue=(blue/adder>255)?255:blue/adder;}
        }
        
        rgbs[a]=(new Color((int)red,(int)green,(int)blue)).getRGB();
        }   
    
  }
    
    public void sharpen2(){
    int rgbsx[] = new int[width*height];
    int w=width;
    int h=height;
    
    for(int a=0 ; a<width*height;a++){
    if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){
        
    Color col1 = new Color(rgbs[a-w-1]);
    Color col2 = new Color(rgbs[a-w]);
    Color col3 = new Color(rgbs[a-w+1]);
    Color col4 = new Color(rgbs[a-1]);
    Color col5 = new Color(rgbs[a]);
    Color col6 = new Color(rgbs[a+1]);
    Color col7 = new Color(rgbs[a+w-1]);
    Color col8 = new Color(rgbs[a+w]);
    Color col9 = new Color(rgbs[a+w+1]);
    
    int redaver=(col1.getRed()+col2.getRed()+col3.getRed()+col4.getRed()+col6.getRed()+col7.getRed()+col8.getRed()+col9.getRed())/8;
    int greenaver=(col1.getGreen()+col2.getGreen()+col3.getGreen()+col4.getGreen()+col6.getGreen()+col7.getGreen()+col8.getGreen()+col9.getGreen())/8;
    int blueaver=(col1.getBlue()+col2.getBlue()+col3.getBlue()+col4.getBlue()+col6.getBlue()+col7.getBlue()+col8.getBlue()+col9.getBlue())/8;
    
    int red=col5.getRed()-redaver+col5.getRed();
    if(red>255){red=255;}
    if(red<0){red=0;}
    
    int blue=col5.getBlue()-blueaver+col5.getBlue();
    if(blue>255){blue=255;}
    if(blue<0){blue=0;}
    
    int green=col5.getGreen()-greenaver+col5.getGreen();
    if(green>255){green=255;}
    if(green<0){green=0;}
    
    rgbsx[a]=(new Color(red,green,blue)).getRGB();
    }}
    for(int a=0;a<width*height;a++){
        rgbs[a]=rgbsx[a];
    }}
    
    public void distribute(){
        
        
        int colour=(255)/regions;
        int maxin=0;
        int minin=1000;
        
        for(int a=0;a<width*height;a++){
        int intense=((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3;
        maxin=(maxin>intense)?maxin:intense;
        minin=(minin<intense)?minin:intense;
        Color col=new Color(intense,intense,intense);
        rgbs[a]=col.getRGB();
        }
        
        int diff=(maxin-minin)/regions;
        for(int a=0;a<width*height;a++){
        int intense=((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3;
        int ireg=(intense-minin)/diff;
        
        Color col=new Color(ireg*colour,ireg*colour,ireg*colour);
        //System.out.println(""+maxin+" "+minin+" "+colour+" "+diff+" "+ireg);
        rgbs[a]=col.getRGB();
        
        
        }
        
    }
    
     public void colour(){
        
         
        int colour=(255)/regions;
        int maxin=0;
        int minin=1000;
        int colarr[][]=new int[regions+100][3];
        
        for(int a=0;a<regions+5;a++){
        colarr[a][0]=(int)(Math.random()*255);
        colarr[a][1]=(int)(Math.random()*255);
        colarr[a][2]=(int)(Math.random()*255);
        }
        
        for(int a=0;a<width*height;a++){
        int intense=((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3;
        maxin=(maxin>intense)?maxin:intense;
        minin=(minin<intense)?minin:intense;
        Color col=new Color(intense,intense,intense);
        rgbs[a]=col.getRGB();
        }
        
        int diff=(maxin-minin)/regions;
        for(int a=0;a<width*height;a++){
        int intense=((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3;
        int ireg=(intense-minin)/diff;
        
        Color col=new Color(colarr[ireg][0],colarr[ireg][1],colarr[ireg][2]);
        //System.out.println(""+maxin+" "+minin+" "+colour+" "+diff+" "+ireg);
        rgbs[a]=col.getRGB();
        
        
        }
        
    }
    
    public void fun(){
        for(int a=0;a<width*height;a++){
            Color col=new Color(rgbs[a]);
            int red=col.getRed();
            int green=col.getGreen();
            int blue=col.getBlue(); 
            
            red=(int)(red/1.2);
            green=(int)(green/1.2);
            blue=(int)(blue/1.2);
            col=new Color(red,green,blue);
            rgbs[a]=col.getRGB();
        }
               
    }
    
    public void showinfo(Graphics grahist){
        grahist.setColor(Color.black);
        grahist.fillRect(0,0,532,532);
        grahist.setColor(new Color(220,220,220));  
        grahist.setFont(new Font("Dialog",Font.BOLD,12));
        grahist.drawLine(0,35,500,35);
        grahist.drawString("File name : "+filename,4,50);
        grahist.drawLine(0,55,500,55);
        grahist.drawString("Width : "+width,4,70);
        grahist.drawLine(0,75,500,75);
        grahist.drawString("Height : "+height,4,90);
        grahist.drawLine(0,95,500,95);
        grahist.drawString("Number of pixels : "+width*height,4,110);
        grahist.drawLine(0,115,500,115);
        
   
    }
    public void binary(){
        double intensityaver=0;
        for(int a=0;a<width*height;a++){
        intensityaver= intensityaver+((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3;
        }
        intensityaver=intensityaver/(width*height);
        for(int a=0;a<width*height;a++){
        if(((new Color(rgbs[a])).getRed()+(new Color(rgbs[a])).getGreen()+(new Color(rgbs[a])).getBlue())/3>intensityaver){rgbs[a]=(Color.white).getRGB();}
        else{rgbs[a]=(Color.black).getRGB();}
        
        }
    
    }
    
    public void colourcontrast(int percentage){
    
    int redmin=0;
    int greenmin=0;
    int bluemin=0;
    double adder=1.0+(percentage/100.0);
    
    
    for(int a=0;a<width*height;a++){
    Color col=new Color(rgbs[a]);
    int red=col.getRed();
    int green=col.getGreen();
    int blue=col.getBlue();
    
    redmin=redmin+red;
    greenmin=greenmin+green;
    bluemin=bluemin+blue;
    
    }
    redmin=redmin/(width*height);
    greenmin=greenmin/(width*height);
    bluemin=bluemin/(width*height);
   
    
    for(int a=0 ;a < width*height;a++){
    Color col=new Color(rgbs[a]);
    int red=col.getRed();
    int green=col.getGreen();
    int blue=col.getBlue();
    if(percentage>0){
    if(red>redmin){red=(red*adder>255)?255:(int)(red*adder);}
    if(red<redmin){red=(int)(red/adder);}
    
    if(green>greenmin){green=(green*adder>255)?255:(int)(green*adder);}
    if(green<greenmin){green=(int)(green/adder);}
    
    if(blue>bluemin){blue=(blue*adder>255)?255:(int)(blue*adder);}
    if(blue<bluemin){blue=(int)(blue/adder);}}
    
    if(percentage<0){
     if(red>redmin){red=(int)(red*adder);}
    if(red<redmin){red=(red/adder>255)?255:(int)(red/adder);}
    
    if(green>greenmin){green=(int)(green*adder);}
    if(green<greenmin){green=(green/adder>255)?255:(int)(green/adder);}
    
    if(blue>bluemin){blue=(int)(blue*adder);}
    if(blue<bluemin){blue=(blue/adder>255)?255:(int)(blue/adder);}
    }
    
    rgbs[a]=(new Color(red,green,blue)).getRGB();
    }
    }
    
    public  void bright(int percentage){
       
        
        
        brightnessincrement=(percentage*255)/100;
        for(int a=0;a<width*height;a++){
            Color col=new Color(rgbs[a]);
           int red=col.getRed();
           int green=col.getGreen();
           int blue=col.getBlue();
            
           red=(red+brightnessincrement<255)?red+brightnessincrement:255;
           green=(green+brightnessincrement<255)?green+brightnessincrement:255;
           blue=(blue+brightnessincrement<255)?blue+brightnessincrement:255;
           
           
           red=(red>0)?red:0;
           green=(green>0)?green:0;
           blue=(blue>0)?blue:0;
           
           //System.out.println(" "+red+" "+green+" "+blue);
           col=new Color(red,green,blue);
            rgbs[a]=col.getRGB();
            
        }                            
        
    }
  
    public void adjustsize(int newwidth,int newheight){
        
       double scalex=(newwidth*1.0)/(width*1.0);
       double scaley=(newheight*1.0)/(height*1.0);
       
       AffineTransform tx = new AffineTransform();
              
        tx.scale(scalex,scaley);
        tx.shear(0,0);
        tx.translate(0,0);
        tx.rotate(0);
        //System.out.println(""+tx.getDeterminant());
        
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        BufferedImage buffe = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        buffe.setRGB(0, 0, width, height, rgbs, 0, width);
        buffe = op.filter(buffe, null);
        width=newwidth;
        height=newheight;
        rgbs=new int[width*height];
        buffe.getRGB(0, 0, width, height, rgbs, 0, width);
          
    
    }
    
    public void paintcrop(int mex,int mey,int mex2,int mey2,Graphics gracrop){
        int x1=0,x2=0,y1=0,y2=0;
        x1=(mex<mex2)?mex:mex2;
        x2=(mex>mex2)?mex:mex2;     
        y1=(mey<mey2)?mey:mey2;
        y2=(mey>mey2)?mey:mey2;     
        
        rectix = x1;
        rectfx = x2;
        rectiy = y1;
        rectfy = y2;
        int d=4;
        //gracrop.setColor(Color.yellow);
        gracrop.setColor(new Color(200,0,200,50));
        
        //gracrop.drawRect(x1,y1,x2-x1,y2-y1);
        
        gracrop.fillRect(x1,y1,x2-x1,y2-y1);
        gracrop.setColor(Color.yellow);
        gracrop.drawRect(x1,y1,x2-x1,y2-y1);
        gracrop.setColor(Color.green);
        //gracrop.fillRect(x1-d/2,y1-d/2,d,d);
        //gracrop.fillRect(x1-d/2,y2-d/2,d,d);
        //gracrop.fillRect(x2-d/2,y1-d/2,d,d);
        //gracrop.fillRect(x2-d/2,y2-d/2,d,d);
    }
    
    public void pencilsketch(){
    findedgessuperb();
    blackandwhite();
    invert();
    }
    
    public void encrypt(){
    
    int hashlen=password.length();
    int hashkey[]=new int[hashlen];
    for(int a=0;a<hashlen;a++){
        hashkey[a]=(int)password.charAt(a);
    }
    for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        if(a%2==0){col=new Color(255-col.getRed(),255-col.getGreen(),255-col.getBlue());}
        rgbs[a]=col.getRGB(); 
        }
    
    for(int b=0;b<1;b++){
    for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        int red=col.getRed();
        int green=col.getGreen();
        int blue=col.getBlue();
        
        
        red=(red+hashkey[a%hashlen])/2;
        if(a%hashlen!=0)
        {green=(green+hashkey[a%hashlen-1])/2;}
        if(a%hashlen!=0&&a%hashlen!=1)
        {blue=(blue+hashkey[a%hashlen-2])/2;}
        if(a%hashlen==0){
            green=(green+hashkey[hashlen-1])/2;
            blue=(blue+hashkey[hashlen-2])/2;
        }
        if(a%hashlen==1){
            blue=(blue+hashkey[hashlen-1])/2;
        }
         //if(a%2==0){red=255-red;green=255-green;blue=255-blue;}
        
        col=new Color(red,green,blue);
        rgbs[a]=col.getRGB();
        
    }
}
      
      
}
    
    public void decrypt(){
    
    int hashlen=password.length();
    int hashkey[]=new int[hashlen];
    for(int a=0;a<hashlen;a++){
        hashkey[a]=(int)password.charAt(a);
     }
     
                
   for(int b=0;b<1;b++){
     for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        int red=col.getRed();
        int green=col.getGreen();
        int blue=col.getBlue();
        
        red=(red*2-hashkey[a%hashlen]);
        if(a%hashlen!=0)
        {green=(green*2-hashkey[a%hashlen-1]);}
        if(a%hashlen!=0&&a%hashlen!=1)
        {blue=(blue*2-hashkey[a%hashlen-2]);}
        if(a%hashlen==0){
            green=(green*2-hashkey[hashlen-1]);
            blue=(blue*2-hashkey[hashlen-2]);
        }
        if(a%hashlen==1){
            blue=(blue*2-hashkey[hashlen-1]);
        }
        
       
    
        red=(red<0)?0:red;
        green=(green<0)?0:green;
        blue=(blue<0)?0:blue;
        
        
        red=(red>255)?255:red;
        green=(green>255)?255:green;
        blue=(blue>255)?255:blue;
        
        //if(a%2==0){red=255-red;green=255-green;blue=255-blue;}
        
        //System.out.println(""+red+" "+red1+" "+green+" "+green1+" "+blue+" "+blue1+" "+hashkey[a%hashlen]);
        col=new Color(red,green,blue);
        rgbs[a]=col.getRGB();
        
           
        }
    }
    
    for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        if(a%2==0){col=new Color(255-col.getRed(),255-col.getGreen(),255-col.getBlue());}
        rgbs[a]=col.getRGB(); 
        }
    
    //smoothing();
    //smoothing();
}

public void encrypt2(){
    String pass="";
    for(int a=0;a<password.length();a++){
    pass=pass+password.charAt(a);
    }
    int cycle=(width*height/200<2000)?2000:width*height/200;
    cycle=(width*height/2>2000)?2000:width*height/2;
    for(int a=0;a<cycle;a++){
    password=password+(char)((int)(1000*Math.tan(a)));
    }
    
    int hashlen=password.length();
    int hash[]=new int[hashlen];
    int mapbuffer[]=new int[hashlen];
    for(int a=0;a<hashlen;a++){
    hash[a]=(int)(password.charAt(a));
    mapbuffer[a]=(int)(password.charAt(a));
    }
    Arrays.sort(mapbuffer);
    int elements=1;
    for(int a=1;a<hashlen;a++){
    if(mapbuffer[a]!=mapbuffer[a-1]){elements++;}
    }
    
    int map[]=new int[elements];
    map[elements-1]=mapbuffer[hashlen-1];
    int index=0;
    for(int a=1;a<hashlen;a++){
    if(mapbuffer[a]!=mapbuffer[a-1]){map[index]=mapbuffer[a-1];index++;}
    }
    for(int a=0;a<hashlen;a++){
        int nowel=hash[a];
    for(int b=a+1;b<hashlen;b++){    
        if(nowel==hash[b]){hash[a]=0;}
    }
    }
    int hashmap[]=new int[elements];
    index=0;
    for(int a=0;a<hashlen;a++){
    if(hash[a]!=0){hashmap[index]=hash[a];index++;}
    }
    int hashfinale[]=new int[elements];
    for(int a=0;a<elements;a++){
    int nowel=hashmap[a];
    for(int b=0;b<elements;b++){
    if(nowel==map[b]){hashfinale[a]=b;}
    }
    }
    int rgbs2[]=new int[width*height];
    
    for(int a=0;a<width*height-elements;a=a+elements){
        
        for(int b=a;b<a+elements;b++){
            rgbs2[b]=rgbs[a+hashfinale[b-a]];
        }
        for(int b=a;b<a+elements;b++){
            rgbs[b]=rgbs2[b];
           }     
    }
    
    for(int a=0;a<width*height;a++){
            rgbs[a]=rgbs2[a];
        }
    password=pass;
}

public void decrypt2(){
    String pass="";
    for(int a=0;a<password.length();a++){
    pass=pass+password.charAt(a);
    }
    int cycle=(width*height/200<2000)?2000:width*height/200;
    cycle=(width*height/2>2000)?2000:width*height/2;
    for(int a=0;a<cycle;a++){
    password=password+(char)((int)(1000*Math.tan(a)));
    }
  
    int hashlen=password.length();
    int hash[]=new int[hashlen];
    int mapbuffer[]=new int[hashlen];
    for(int a=0;a<hashlen;a++){
    hash[a]=(int)(password.charAt(a));
    mapbuffer[a]=(int)(password.charAt(a));
    }
    Arrays.sort(mapbuffer);
    int elements=1;
    for(int a=1;a<hashlen;a++){
    if(mapbuffer[a]!=mapbuffer[a-1]){elements++;}
    }
    
    int map[]=new int[elements];
    map[elements-1]=mapbuffer[hashlen-1];
    int index=0;
    for(int a=1;a<hashlen;a++){
    if(mapbuffer[a]!=mapbuffer[a-1]){map[index]=mapbuffer[a-1];index++;}
    }
    for(int a=0;a<hashlen;a++){
        int nowel=hash[a];
    for(int b=a+1;b<hashlen;b++){    
        if(nowel==hash[b]){hash[a]=0;}
    }
    }
    int hashmap[]=new int[elements];
    index=0;
    for(int a=0;a<hashlen;a++){
    if(hash[a]!=0){hashmap[index]=hash[a];index++;}
    }
    int hashfinale[]=new int[elements];
    for(int a=0;a<elements;a++){
    int nowel=hashmap[a];
    for(int b=0;b<elements;b++){
    if(nowel==map[b]){hashfinale[a]=b;}
    }
    }
    int hashfinalere[]=new int[elements];
    for(int a=0;a<elements;a++){
    hashfinalere[hashfinale[a]]=a;
    
    }
    
    int rgbs2[]=new int[width*height];
    for(int a=0;a<width*height-elements;a=a+elements){
        
        for(int b=a;b<a+elements;b++){
            rgbs2[b]=rgbs[a+hashfinalere[b-a]];
        }
        for(int b=a;b<a+elements;b++){
            rgbs[b]=rgbs2[b];
           }     
        }
    for(int a=0;a<width*height;a++){
            rgbs[a]=rgbs2[a];}
    password=pass;
    
    
}

public void swapcolor(int r,int g,int b){
    
    for(int a=0;a<width*height;a++){
    Color col=new Color(rgbs[a]);
    if(r==0){rgbs[a]=(new Color(col.getRed(),col.getBlue(),col.getGreen())).getRGB();}
    if(g==0){rgbs[a]=(new Color(col.getBlue(),col.getGreen(),col.getRed())).getRGB();}
    if(b==0){rgbs[a]=(new Color(col.getGreen(),col.getRed(),col.getBlue())).getRGB();}
    
    }
}
/////////////////////////////////MAX FILTER ////////////////////////////////////////////////////////////////////////////////////////////
public void maximumfilter(){

    int a=0;
    int w=width;
    int h=height;
    //int rgbsx[]=new int[w*h];
    for(a=0;a<rgbs.length;a=a+3){
        if((!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||(((a+1)%(w))==0)))&&((a/w)%3==0)){

        Color col1 = new Color(rgbs[a-w-1]);
        Color col2 = new Color(rgbs[a-w]);
        Color col3 = new Color(rgbs[a-w+1]);
        Color col4 = new Color(rgbs[a-1]);
        Color col5 = new Color(rgbs[a]);
        Color col6 = new Color(rgbs[a+1]);
        Color col7 = new Color(rgbs[a+w-1]);
        Color col8 = new Color(rgbs[a+w]);
        Color col9 = new Color(rgbs[a+w+1]);
        int redmin=0;
        int greenmin=0;
        int bluemin=0;
        redmin=col1.getRed();
        redmin=(col2.getRed()>redmin)?col2.getRed():redmin;
        redmin=(col3.getRed()>redmin)?col3.getRed():redmin;
        redmin=(col4.getRed()>redmin)?col4.getRed():redmin;
        redmin=(col5.getRed()>redmin)?col5.getRed():redmin;
        redmin=(col6.getRed()>redmin)?col6.getRed():redmin;
        redmin=(col7.getRed()>redmin)?col7.getRed():redmin;        
        redmin=(col8.getRed()>redmin)?col8.getRed():redmin;
        redmin=(col9.getRed()>redmin)?col9.getRed():redmin;
        
        greenmin=col1.getGreen();
        greenmin=(col2.getGreen()>greenmin)?col2.getGreen():greenmin;
        greenmin=(col3.getGreen()>greenmin)?col3.getGreen():greenmin;
        greenmin=(col4.getGreen()>greenmin)?col4.getGreen():greenmin;
        greenmin=(col5.getGreen()>greenmin)?col5.getGreen():greenmin;
        greenmin=(col6.getGreen()>greenmin)?col6.getGreen():greenmin;
        greenmin=(col7.getGreen()>greenmin)?col7.getGreen():greenmin;        
        greenmin=(col8.getGreen()>greenmin)?col8.getGreen():greenmin;
        greenmin=(col9.getGreen()>greenmin)?col9.getGreen():greenmin;
        
        bluemin=col1.getBlue();
        bluemin=(col2.getBlue()>bluemin)?col2.getBlue():bluemin;
        bluemin=(col3.getBlue()>bluemin)?col3.getBlue():bluemin;
        bluemin=(col4.getBlue()>bluemin)?col4.getBlue():bluemin;
        bluemin=(col5.getBlue()>bluemin)?col5.getBlue():bluemin;
        bluemin=(col6.getBlue()>bluemin)?col6.getBlue():bluemin;
        bluemin=(col7.getBlue()>bluemin)?col7.getBlue():bluemin;        
        bluemin=(col8.getBlue()>bluemin)?col8.getBlue():bluemin;
        bluemin=(col9.getBlue()>bluemin)?col9.getBlue():bluemin;
          
        Color col = new Color(redmin,greenmin,bluemin);
        rgbs[a]=col.getRGB();
        rgbs[a-w-1]=col.getRGB();
        rgbs[a-w]=col.getRGB();
        rgbs[a-w+1]=col.getRGB();
        rgbs[a-1]=col.getRGB();
        rgbs[a+1]=col.getRGB();
        rgbs[a+w-1]=col.getRGB();
        rgbs[a+w]=col.getRGB();
        rgbs[a+w+1]=col.getRGB();
        }
    }
   }
   /////////////////////////////////MAX FILTER ////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////MIN FILTER ////////////////////////////////////////////////////////////////////////////////////////////
public void minimumfilter(){

    int a=0;
    int w=width;
    int h=height;
    //int rgbsx[]=new int[w*h];
    for(a=0;a<rgbs.length;a=a+3){
        if((!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||(((a+1)%(w))==0)))&&((a/w)%3==0)){

        Color col1 = new Color(rgbs[a-w-1]);
        Color col2 = new Color(rgbs[a-w]);
        Color col3 = new Color(rgbs[a-w+1]);
        Color col4 = new Color(rgbs[a-1]);
        Color col5 = new Color(rgbs[a]);
        Color col6 = new Color(rgbs[a+1]);
        Color col7 = new Color(rgbs[a+w-1]);
        Color col8 = new Color(rgbs[a+w]);
        Color col9 = new Color(rgbs[a+w+1]);
        int redmin=0;
        int greenmin=0;
        int bluemin=0;
        redmin=col1.getRed();
        redmin=(col2.getRed()<redmin)?col2.getRed():redmin;
        redmin=(col3.getRed()<redmin)?col3.getRed():redmin;
        redmin=(col4.getRed()<redmin)?col4.getRed():redmin;
        redmin=(col5.getRed()<redmin)?col5.getRed():redmin;
        redmin=(col6.getRed()<redmin)?col6.getRed():redmin;
        redmin=(col7.getRed()<redmin)?col7.getRed():redmin;        
        redmin=(col8.getRed()<redmin)?col8.getRed():redmin;
        redmin=(col9.getRed()<redmin)?col9.getRed():redmin;
        
        greenmin=col1.getGreen();
        greenmin=(col2.getGreen()<greenmin)?col2.getGreen():greenmin;
        greenmin=(col3.getGreen()<greenmin)?col3.getGreen():greenmin;
        greenmin=(col4.getGreen()<greenmin)?col4.getGreen():greenmin;
        greenmin=(col5.getGreen()<greenmin)?col5.getGreen():greenmin;
        greenmin=(col6.getGreen()<greenmin)?col6.getGreen():greenmin;
        greenmin=(col7.getGreen()<greenmin)?col7.getGreen():greenmin;        
        greenmin=(col8.getGreen()<greenmin)?col8.getGreen():greenmin;
        greenmin=(col9.getGreen()<greenmin)?col9.getGreen():greenmin;
        
        bluemin=col1.getBlue();
        bluemin=(col2.getBlue()<bluemin)?col2.getBlue():bluemin;
        bluemin=(col3.getBlue()<bluemin)?col3.getBlue():bluemin;
        bluemin=(col4.getBlue()<bluemin)?col4.getBlue():bluemin;
        bluemin=(col5.getBlue()<bluemin)?col5.getBlue():bluemin;
        bluemin=(col6.getBlue()<bluemin)?col6.getBlue():bluemin;
        bluemin=(col7.getBlue()<bluemin)?col7.getBlue():bluemin;        
        bluemin=(col8.getBlue()<bluemin)?col8.getBlue():bluemin;
        bluemin=(col9.getBlue()<bluemin)?col9.getBlue():bluemin;
          
        Color col = new Color(redmin,greenmin,bluemin);
        rgbs[a]=col.getRGB();
        rgbs[a-w-1]=col.getRGB();
        rgbs[a-w]=col.getRGB();
        rgbs[a-w+1]=col.getRGB();
        rgbs[a-1]=col.getRGB();
        rgbs[a+1]=col.getRGB();
        rgbs[a+w-1]=col.getRGB();
        rgbs[a+w]=col.getRGB();
        rgbs[a+w+1]=col.getRGB();
        }
    }
   }
//////////////////////////////////MIN FILTER ////////////////////////////////////////////////////////////////////////////////////////////
   public void booleannot(){
    int w=width;
    int h=height;
    for(int a=0;a<w*h;a++){
        Color col=new Color(rgbs[a]);
        int red=col.getRed();
        int green=col.getGreen();
        int blue=col.getBlue();
        
        String redb="";
        String greenb="";
        String blueb="";
        int newred=0;
        int newgreen=0;
        int newblue=0;
        
        for(int x=0;x<8;x++){
            int power=(int)Math.pow(2,x);
            
            newred=newred+(1-red%2)*power;
            red=red/2;
            
            newgreen=newgreen+(1-green%2)*power;
            green=green/2;
            
            newblue=newblue+(1-blue%2)*power;
            blue=blue/2;
            
        }
        
        col=new Color(newred,newgreen,newblue);
        rgbs[a]=col.getRGB();
           
    }
     }
       
  public void findedgessuperb(){
     int w=width;
     int h=height;
     int rgbs2[]=new int[w*h];
     int redavg=0;
     int greenavg=0;
     int blueavg=0;
     double kernel[]={-1.0,-1.414,-1.0,0.0,0.0,0.0,1.0,1.414,1.0};
     double kernel2[]={1.0,0.0,-1.0,1.414,0.0,-1.414,1.0,0.0,-1.0};
    
    double sum1=0;
    double possum1=0;
    double negsum1=0;
    for(int x=0;x<9;x++){
        if(kernel[x]>0){possum1=possum1+kernel[x];}
        if(kernel[x]<0){negsum1=negsum1+kernel[x];}
    sum1=sum1+Math.abs(kernel[x]);
    }
    
    double sum2=0;
    double possum2=0;
    double negsum2=0;
    for(int x=0;x<9;x++){
        if(kernel[x]>0){possum2=possum2+kernel[x];}
        if(kernel[x]<0){negsum2=negsum2+kernel[x];}
    sum2=sum2+Math.abs(kernel[x]);
    }
    
    sum1=(possum1>Math.abs(negsum1))?possum1:Math.abs(negsum1);
    sum2=(possum2>Math.abs(negsum2))?possum2:Math.abs(negsum2);
    Color col[]=new Color[9];
      for(int a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){
         
         col[0] = new Color(rgbs[a-w-1]);
         col[1] = new Color(rgbs[a-w]);
         col[2] = new Color(rgbs[a-w+1]);
         col[3] = new Color(rgbs[a-1]);
         col[4] = new Color(rgbs[a]);
         col[5] = new Color(rgbs[a+1]);
         col[6] = new Color(rgbs[a+w-1]);
         col[7] = new Color(rgbs[a+w]);
         col[8] = new Color(rgbs[a+w+1]);
          
        double red1=0;
        double green1=0;
        double blue1=0;
        
        double red2=0;
        double green2=0;
        double blue2=0;
        
        
        for(int q=0;q<9;q++){
        red1=red1+col[q].getRed()*kernel[q];
        green1=green1+col[q].getGreen()*kernel[q];
        blue1=blue1+col[q].getBlue()*kernel[q];
        
        red2=red2+col[q].getRed()*kernel2[q];
        green2=green2+col[q].getGreen()*kernel2[q];
        blue2=blue2+col[q].getBlue()*kernel2[q];
        
        }
        red1=(int)(red1/sum1);
        green1=(int)(green1/sum1);
        blue1=(int)(blue1/sum1);
        
        red2=(int)(red2/sum2);
        green2=(int)(green2/sum2);
        blue2=(int)(blue2/sum2);
                
        red1=(red1<0)?Math.abs(red1):red1;
        green1=(green1<0)?Math.abs(green1):green1;
        blue1=(blue1<0)?Math.abs(blue1):blue1;
        
        
        red1=(red1>255)?255:red1;
        green1=(green1>255)?255:green1;
        blue1=(blue1>255)?255:blue1;
        
        red1=(red1<0)?Math.abs(red2):red1;
        green1=(green1<0)?Math.abs(green2):green1;
        blue1=(blue1<0)?Math.abs(blue2):blue1;
        
        
        red2=(red2>255)?255:red2;
        green2=(green2>255)?255:green2;
        blue2=(blue2>255)?255:blue2;
        
        double red=(red1>red2)?red1:red2;
        double green=(green1>green2)?green1:green2;
        double blue=(blue1>blue2)?blue1:blue2;
        
        redavg=redavg+(int)red;
        greenavg=greenavg+(int)green;
        blueavg=blueavg+(int)blue;
        
        
        Color colf=new Color((int)red,(int)green,(int)blue);

        rgbs2[a]=colf.getRGB();

        }}
        redavg=redavg/(w*h);
        greenavg=greenavg/(w*h);
        blueavg=blueavg/(w*h);
        double cfa=5;
      
       for(int a=0 ;a < width*height;a++){
            Color colex=new Color(rgbs2[a]);
            int red=colex.getRed();
            int green=colex.getGreen();
            int blue=colex.getBlue();
            
            if(red>redavg){red=(red*cfa>255)?255:(int)(red*cfa);}
            if(red<redavg){red=(int)(red/cfa);}
            
            if(green>greenavg){green=(green*cfa>255)?255:(int)(green*cfa);}
            if(green<greenavg){green=(int)(green/cfa);}
            
            if(blue>blueavg){blue=(blue*cfa>255)?255:(int)(blue*cfa);}
            if(blue<blueavg){blue=(int)(blue/cfa);}
            
            rgbs2[a]=(new Color(red,green,blue)).getRGB();
    }

        
 
        
        for(int a=0;a<width*height;a++){
        rgbs[a]=rgbs2[a];}
        }
        
     public void crop(){
        int initialx=(int)(rectix/imagescaleratio);
        int initialy=(int)(rectiy/imagescaleratio);
        int finalx=(int)(rectfx/imagescaleratio);
        int finaly=(int)(rectfy/imagescaleratio);
        int w=finalx-initialx+1;
        int h=finaly-initialy+1;
        BufferedImage buffer1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BufferedImage buffer2 = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        buffer1.setRGB(0, 0, width, height, rgbs, 0, width);
        buffer2 = buffer1.getSubimage(initialx, initialy, w, h);
        width=w;
        height=h;
        rgbs=new int[w*h];
        buffer2.getRGB(0, 0, width, height, rgbs, 0, width);
        
        }
        
        public void transpose(){
            int w=width;
            int h=height;
            int rgbsx[]=new int[w*h];
            for(int a=0;a<width;a++){
                for(int b=0;b<height;b++){
                    rgbsx[b+a*height]=rgbs[b*width+a];
                 }
            }
            for(int a=0;a<width*height;a++){
        rgbs[a]=rgbsx[a];}
            width=height;
            height=w;
            
        
        
        }
        
        public BufferedImage copybuffimage(BufferedImage x){
            AffineTransform tx = new AffineTransform();
              
            tx.scale(1.0,1.0);
            tx.shear(0,0);
            tx.translate(0,0);
            tx.rotate(0.0);
            
        
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        x = op.filter(x, null);
        return x;
        
        
        }
        
 
public void emboss(){
     int w=width;
     int h=height;
     int rgbs2[]=new int[w*h];
     int redavg=0;
     int greenavg=0;
     int blueavg=0;
     double kernel[]={-1.0,-1.414,-1.0,0.0,0.0,0.0,1.0,1.414,1.0};
     double kernel2[]={1.0,0.0,-1.0,1.414,0.0,-1.414,1.0,0.0,-1.0};
    
    double sum1=0;
    double possum1=0;
    double negsum1=0;
    for(int x=0;x<9;x++){
        if(kernel[x]>0){possum1=possum1+kernel[x];}
        if(kernel[x]<0){negsum1=negsum1+kernel[x];}
    sum1=sum1+Math.abs(kernel[x]);
    }
    
    double sum2=0;
    double possum2=0;
    double negsum2=0;
    for(int x=0;x<9;x++){
        if(kernel[x]>0){possum2=possum2+kernel[x];}
        if(kernel[x]<0){negsum2=negsum2+kernel[x];}
    sum2=sum2+Math.abs(kernel[x]);
    }
    
    sum1=(possum1>Math.abs(negsum1))?possum1:Math.abs(negsum1);
    sum2=(possum2>Math.abs(negsum2))?possum2:Math.abs(negsum2);
    Color col[]=new Color[9];
      for(int a=0;a<rgbs.length;a++){
        if(!((a<w)||(a>(w*(h-1)-1))||(a%w==0)||((a+1)%(w))==0)){
         
         col[0] = new Color(rgbs[a-w-1]);
         col[1] = new Color(rgbs[a-w]);
         col[2] = new Color(rgbs[a-w+1]);
         col[3] = new Color(rgbs[a-1]);
         col[4] = new Color(rgbs[a]);
         col[5] = new Color(rgbs[a+1]);
         col[6] = new Color(rgbs[a+w-1]);
         col[7] = new Color(rgbs[a+w]);
         col[8] = new Color(rgbs[a+w+1]);
          
        double red1=0;
        double green1=0;
        double blue1=0;
        
        double red2=0;
        double green2=0;
        double blue2=0;
        
        
        for(int q=0;q<9;q++){
        red1=red1+col[q].getRed()*kernel[q];
        green1=green1+col[q].getGreen()*kernel[q];
        blue1=blue1+col[q].getBlue()*kernel[q];
        
        red2=red2+col[q].getRed()*kernel2[q];
        green2=green2+col[q].getGreen()*kernel2[q];
        blue2=blue2+col[q].getBlue()*kernel2[q];
        
        }
        red1=(red1/sum1);
        green1=(green1/sum1);
        blue1=(blue1/sum1);
        
        red2=(red2/sum2);
        green2=(green2/sum2);
        blue2=(blue2/sum2);
                
        red1=(red1+255)/2;
        red2=(red2+255)/2;
        green1=(green1+255)/2;
        green2=(green2+255)/2;
        blue1=(blue1+255)/2;
        blue2=(blue2+255)/2;
        
        int red=(int)((red1+red2)/2);
        int green=(int)((green1+green2)/2);
        int blue=(int)((blue1+blue2)/2);
        
        
        redavg=redavg+(int)red;
        greenavg=greenavg+(int)green;
        blueavg=blueavg+(int)blue;
        
        
        Color colf=new Color((int)red,(int)green,(int)blue);

        rgbs2[a]=colf.getRGB();

        }}
        redavg=redavg/(w*h);
        greenavg=greenavg/(w*h);
        blueavg=blueavg/(w*h);
        double cfa=8;
      
       /*for(int a=0 ;a < width*height;a++){
            Color colex=new Color(rgbs2[a]);
            int red=colex.getRed();
            int green=colex.getGreen();
            int blue=colex.getBlue();
            
            if(red>redavg){red=(red*cfa>255)?255:(int)(red*cfa);}
            if(red<redavg){red=(int)(red/cfa);}
            
            if(green>greenavg){green=(green*cfa>255)?255:(int)(green*cfa);}
            if(green<greenavg){green=(int)(green/cfa);}
            
            if(blue>blueavg){blue=(blue*cfa>255)?255:(int)(blue*cfa);}
            if(blue<blueavg){blue=(int)(blue/cfa);}
            
            rgbs2[a]=(new Color(red,green,blue)).getRGB();
        }*/

        
 
        
        for(int a=0;a<width*height;a++){
        rgbs[a]=rgbs2[a];}
        }
        
        public void cutimagepart(){
        for(int a=0;a<width*height;a++){
        rgbs[a]=(Color.white).getRGB();
        
        
        }
        
        
        }
        
       /* public void anycolorswap(double r1,double g1,double b1,double r2,double g2,double b2){
                System.out.println(" "+r1+" "+g1+" "+b1+" "+r2+" "+g2+" "+b2) ;            
        double mag1=Math.sqrt(r1*r1+g1*g1+b1*b1);
        double mag2=Math.sqrt(r2*r2+g2*g2+b2*b2);
        
        for(int a=0;a<rgbs.length;a++){
            
        Color col=new Color(rgbs[a]);
        
        double r=col.getRed()*1.0;
        double g=col.getGreen()*1.0;
        double b=col.getBlue()*1.0;
        
        double rfinal=(r+(-((r*r1+g*g1+b*b1)/mag1)+((r*r2+g*g2+b*b2)/mag2))*(r1/mag1)+(-((r*r1+g*g1+b*b1)/mag2)+((r*r2+g*g2+b*b2)/mag1))*(r2/mag2));
        double gfinal=(g+(-((r*r1+g*g1+b*b1)/mag1)+((r*r2+g*g2+b*b2)/mag2))*(g1/mag1)+(-((r*r1+g*g1+b*b1)/mag2)+((r*r2+g*g2+b*b2)/mag1))*(g2/mag2));
        double bfinal=(b+(-((r*r1+g*g1+b*b1)/mag1)+((r*r2+g*g2+b*b2)/mag2))*(b1/mag1)+(-((r*r1+g*g1+b*b1)/mag2)+((r*r2+g*g2+b*b2)/mag1))*(b2/mag2));
        //System.out.println(" "+rfinal+" "+gfinal+" "+bfinal+"   "+r+" "+g+" "+b) ;
        rfinal=Math.abs(rfinal);
        gfinal=Math.abs(gfinal);
        bfinal=Math.abs(bfinal);
        
        rfinal=(rfinal<0)?0:rfinal;
        gfinal=(gfinal<0)?0:gfinal;
        bfinal=(bfinal<0)?0:bfinal;
        
        rfinal=(rfinal>255)?255:rfinal;
        gfinal=(gfinal>255)?255:gfinal;
        bfinal=(bfinal>255)?255:bfinal;
        
        col=new Color((int)rfinal,(int)gfinal,(int)bfinal);
        
        rgbs[a]=col.getRGB();
        }
    }*/
        
        public void anycolorswap(double r1,double g1,double b1,double r2,double g2,double b2){
                   
                double mag1=Math.sqrt(r1*r1+g1*g1+b1*b1);
                double mag2=Math.sqrt(r2*r2+g2*g2+b2*b2);
                double megamag=Math.sqrt((g1*b2-b1*g2)*(g1*b2-b1*g2)+(b1*r2-r1*b2)*(b1*r2-r1*b2)+(r1*g2-g1*r2)*(r1*g2-g1*r2));
                        
        for(int a=0;a<rgbs.length;a++){
            
            Color col=new Color(rgbs[a]);
            
            double r=col.getRed()*1.0;
            double g=col.getGreen()*1.0;
            double b=col.getBlue()*1.0;
            
            double megacomp=(r*g1*b2-r*b1*g2+g*b1*r2-g*r1*b2+b*r1*g2-b*g1*r2);
            double rfinal=(((r*r1+g*g1+b*b1)*r2+(r*r2+g*g2+b*b2)*r1)/(mag1*mag2))+(megacomp*(g1*b2-b1*g2))/(megamag*megamag);
            double gfinal=(((r*r1+g*g1+b*b1)*g2+(r*r2+g*g2+b*b2)*g1)/(mag1*mag2))+(megacomp*(b1*r2-r1*b2))/(megamag*megamag);
            double bfinal=(((r*r1+g*g1+b*b1)*b2+(r*r2+g*g2+b*b2)*b1)/(mag1*mag2))+(megacomp*(r1*g2-r2*g1))/(megamag*megamag);
            // double rfinal=(((r*r1+g*g1+b*b1)*r2+(r*r2+g*g2+b*b2)*r1)/(mag1*mag2));
            //double gfinal=(((r*r1+g*g1+b*b1)*g2+(r*r2+g*g2+b*b2)*g1)/(mag1*mag2));
            //double bfinal=(((r*r1+g*g1+b*b1)*b2+(r*r2+g*g2+b*b2)*b1)/(mag1*mag2));
        //System.out.println(""+(int)rfinal+","+(int)gfinal+","+(int)bfinal+" "+r+","+g+","+b);
        rfinal=(rfinal<0)?0:rfinal;
        gfinal=(gfinal<0)?0:gfinal;
        bfinal=(bfinal<0)?0:bfinal;
        
        rfinal=(rfinal>255)?255:rfinal;
        gfinal=(gfinal>255)?255:gfinal;
        bfinal=(bfinal>255)?255:bfinal;
        
        col=new Color((int)rfinal,(int)gfinal,(int)bfinal);
        
        rgbs[a]=col.getRGB();
                
         }
       }
       
       public void contraststretching(double cutoff){
           
            
           int a=0,b=255,c=0,d=0;
           int lowint=0;
           int upint=0;
           int num=width*height;
           int intense[]=new int[256];
           int pixelmax=0;
           int index=0;
           
           for(int x=0;x<rgbs.length;x++){
               Color col=new Color(rgbs[x]);
               int intensity = col.getRed()+col.getGreen()+col.getBlue();
               intense[intensity/3]++;
            }
           
           for(int x=0;x<256;x++){
               int old=pixelmax;
            pixelmax=(intense[x]>pixelmax)?intense[x]:pixelmax;
              if(pixelmax!=old){index=x;}
            }
           
            
            int cutoffmag=(int)((pixelmax*cutoff*1.0)/100.0);
          
           
           boolean breaker=true;
           upint=index;
           lowint=index;
           for(int x=0;x<index&&breaker;x++){
               if(intense[x]>=cutoffmag){lowint=x;breaker=false;}
            
            }
             
           breaker=true;
           for(int x=255;x>index&&breaker;x--){
               if(intense[x]>=cutoffmag){upint=x;breaker=false;}
            
            }
           
           
           c=lowint;
           d=upint;
         
           for(int x=0;x<rgbs.length;x++){
            Color col=new Color(rgbs[x]);
            int intensity = (col.getRed()+col.getGreen()+col.getBlue())/3;
            int red=col.getRed();
            int green=col.getGreen();
            int blue=col.getBlue();
            
             red=(red-c)*((b-a)/(d-c))+a;
             green=(green-c)*((b-a)/(d-c))+a;
             blue=(blue-c)*((b-a)/(d-c))+a;
             
             
              red=(red<0)?0:red;
              green=(green<0)?0:green;
              blue=(blue<0)?0:blue;
        
                red=(red>255)?255:red;
                green=(green>255)?255:green;
                blue=(blue>255)?255:blue;
           
             col=new Color(red,green,blue);
             rgbs[x]=col.getRGB();
            
            
            } 
        }
        
        public void histogramequalisation(){
          int w=width;
          int h=height;
          int numpix[]=new int[256];
          for(int a=0;a<w*h;a++){
             Color col=new Color(rgbs[a]);
             int intense=(col.getRed()+col.getGreen()+col.getBlue())/3;
             numpix[intense]++;
          }
          int numk[]=new int[256];
          for(int a=0;a<256;a++){
            for(int b=0;b<=a;b++){
            numk[a]=numk[a]+numpix[b];
            }
            
          }
          double newd[]=new double[256];
          for(int a=0;a<256;a++){
            double x=(numk[a]*1.0*255)/(w*h*1.0);
            
            //System.out.println(x+" "+numk[a]+" "+numpix[a]); 
            x=(x<0)?0:x;
            
            newd[a]=x;
            }
            
            for(int a=0;a<w*h;a++){
            Color col=new Color(rgbs[a]);
            int red=col.getRed();
            int green=col.getGreen();
            int blue=col.getBlue();
            int intensity=(red+green+blue)/3;
            
            double ratio=newd[intensity]/intensity;
            red=(int)(red*ratio);
            green=(int)(green*ratio);
            blue=(int)(blue*ratio);
                 
              red=(red<0)?0:red;
              green=(green<0)?0:green;
              blue=(blue<0)?0:blue;
        
                red=(red>255)?255:red;
                green=(green>255)?255:green;
                blue=(blue>255)?255:blue;
                
            col=new Color(red,green,blue);
            rgbs[a]=col.getRGB();
            }
          //http://homepages.inf.ed.ac.uk/rbf/HIPR2/histeq.htm#1
          
     }
     public void gammacorrection(double basis){
        
        double maxred=0;
        double maxgreen=0;
        double maxblue=0;

        for(int a=0;a<width*height;a++){
        Color col=new Color(rgbs[a]);
        
        double red=col.getRed();
        double green=col.getGreen();
        double blue=col.getBlue();
        
         
        maxred=(maxred<red)?red:maxred;
        maxgreen=(maxgreen<green)?green:maxgreen;
        maxblue=(maxblue<blue)?blue:maxblue;
          }
          maxred=Math.pow(basis,maxred);
          maxgreen=Math.pow(basis,maxgreen);
          maxblue=Math.pow(basis,maxblue);
          
           double max=(maxred>maxgreen)?maxred:maxgreen;
            max=(maxblue>max)?maxblue:max;
            
            double ratio=255.0/max;

        for(int a=0;a<width*height;a++){
            
           
        Color col=new Color(rgbs[a]);
        
        double red=col.getRed();
        double green=col.getGreen();
        double blue=col.getBlue();
        
        red=(ratio*Math.pow(basis,red)-ratio);
        green=(ratio*Math.pow(basis,green)-ratio);
        blue=(ratio*Math.pow(basis,blue)-ratio);
               red=(red<0)?0:red;
              green=(green<0)?0:green;
              blue=(blue<0)?0:blue;
        
                red=(red>255)?255:red;
                green=(green>255)?255:green;
                blue=(blue>255)?255:blue;
        col=new Color((int)red,(int)green,(int)blue);
        
        
            rgbs[a]=col.getRGB();
            
    }}
    
    public void makecolor(int turn){
                for(int a=0;a<width*height;a++){
          Color col=new Color(rgbs[a]);
          
          int r=col.getRed();
          int g=col.getGreen();
          int b=col.getBlue();
          if(turn==0){col=new Color(r,r,r);}
          if(turn==1){col=new Color(r,r,g);}
          if(turn==2){col=new Color(r,r,b);}
          if(turn==3){col=new Color(r,g,r);}
          if(turn==4){col=new Color(r,g,g);}
          if(turn==5){col=new Color(r,g,b);}
          if(turn==6){col=new Color(r,b,r);}
          if(turn==7){col=new Color(r,b,g);}
          if(turn==8){col=new Color(r,b,b);}
          if(turn==9){col=new Color(g,r,r);}
          if(turn==10){col=new Color(g,r,g);}
          if(turn==11){col=new Color(g,r,b);}
          if(turn==12){col=new Color(g,g,r);}
          if(turn==13){col=new Color(g,g,g);}
          if(turn==14){col=new Color(g,g,b);}
          if(turn==15){col=new Color(g,b,r);}
          if(turn==16){col=new Color(g,b,g);}
          if(turn==17){col=new Color(g,b,b);}
          if(turn==18){col=new Color(b,r,r);}
          if(turn==19){col=new Color(b,r,g);}
          if(turn==20){col=new Color(b,r,b);}
          if(turn==21){col=new Color(b,g,r);}
          if(turn==22){col=new Color(b,g,g);}
          if(turn==23){col=new Color(b,g,b);}
          if(turn==24){col=new Color(b,b,r);}
          if(turn==25){col=new Color(b,b,g);}
          if(turn==26){col=new Color(b,b,b);}
          
                   
        rgbs[a]=col.getRGB();
        }
        
        
    
    
    
    }
    public void function(){
        for(int a=0;a<width*height;a++){
          Color col=new Color(rgbs[a]);
          
          int r=col.getRed();
          int g=col.getGreen();
          int b=col.getBlue();
          if(r>g&r>b){Color cole=new Color(255,0,0);
              ;rgbs[a]=cole.getRGB();
            }
          
        
        
    }
}
  
     
     
        
        
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CamereStart;
    private javax.swing.JButton Image_new_frame;
    public static javax.swing.JScrollPane JSP_Converted;
    public static javax.swing.JTextField b_percentage;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_capture;
    private javax.swing.JButton btn_crop;
    public static javax.swing.JButton btn_filter;
    public static javax.swing.JButton change_button;
    public static javax.swing.JButton change_cam;
    public static javax.swing.JDesktopPane dp;
    public static javax.swing.JButton filter;
    public static javax.swing.JTextField hCrop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JMenuItem jMI_Open;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JTextField new1;
    public static javax.swing.JTextField new2;
    public static javax.swing.JTextField new3;
    private javax.swing.JToggleButton panel_camera;
    private javax.swing.JPanel panel_graph;
    public static javax.swing.JTextField totalCrop;
    public static javax.swing.JTextField value_1;
    public static javax.swing.JTextField value_2;
    public static javax.swing.JTextField value_3;
    public static javax.swing.JTextField wCrop;
    public static javax.swing.JTextField w_percentage;
    public static javax.swing.JMenuItem web_cam;
    // End of variables declaration//GEN-END:variables
}
