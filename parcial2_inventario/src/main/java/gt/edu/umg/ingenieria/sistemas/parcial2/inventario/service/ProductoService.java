package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarTodos() {
     return (List<ProductoEntity>) this.productoRepository.findAll();
       
        
    }
    
    public ProductoEntity actualizarStock(Long id, Vehiculo c1){
        return this.vehiculo.save(c1);
    }
    
     public ProductoEntity insertarProducto(ProductoEntity c1){
        return this.productoRepository.save(c1);
    }
    
}
