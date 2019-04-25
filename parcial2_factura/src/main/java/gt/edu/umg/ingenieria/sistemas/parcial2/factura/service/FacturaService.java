package gt.edu.umg.ingenieria.sistemas.parcial2.factura.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.CabeceraFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.dao.CabeceraFacturaRepository;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.dao.DetalleFacturaRepository;
import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FacturaService {

    @Autowired
    private CabeceraFacturaRepository cabeceraFacturaRepository;
    
    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;
    
    public List<CabeceraFacturaEntity> buscarTodasCabecerasFactura() {
        return (List<CabeceraFacturaEntity>) this.cabeceraFacturaRepository.findAll();
    }
    
    public List<DetalleFacturaEntity> buscarTodosDetallesFactura() {
        return (List<DetalleFacturaEntity>) this.detalleFacturaRepository.findAll();
    }
    
    public List<DetalleFacturaEntity> buscarTodosDetallesFactura(Long idCabeceraFactura) {
        return this.detalleFacturaRepository.findByHeader(idCabeceraFactura);
    }
    
     public DetalleFacturaEntity insertarFactura( DetalleFacturaEntity c1,Long id){
        return this.detalleFacturaRepository.save(c1);
    }
    
    public CabeceraFacturaEntity insertarCabecera(CabeceraFacturaEntity c1){
        return this.cabeceraFacturaRepository.save(c1);
        
    }
    
    
      public CabeceraFacturaEntity cabeceraid(Long id){
        return this.cabeceraFacturaRepository.findById(id).get();
    }
      
      
        
    
    
    
    
    String direccion = "//home//"+UserName+"//Desktop//var";
    
    private static String UserName = System.getProperty("user.name");
    
    public String generadorreporte(){
    File carpeta = new File(direccion);
    try{
    
        if(!carpeta.exists()){
        carpeta.mkdir();
        }
    }
    catch(Exception e){
    
    
    }
    carpeta = new File(direccion);
    int cantidad = carpeta.list().length;
    String Archivo = direccion+ "//Factura"+(cantidad+1)+".html";
    
    direccion = direccion + "\\wwww";
    }
      
}
