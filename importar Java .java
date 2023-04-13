importar  Java . útil _ escáner ;

// Clase Producto
producto de clase {
    String  nombre ;
    doble  precio ;

    // Constructor de la clase Producto
    Producto ( String  nombre , doble  precio ) {
        esto _ nombre = nombre ;
        esto _ precio = precio ;
    }
}

// Clase ItemCarrito
class  ItemCarrito {
    producto  producto ;
    intcantidad  ; _

    // Constructor de la clase ItemCarrito
    ItemCarrito ( Producto  producto , int  cantidad ) {
        esto _ producto = producto ;
        esto _ cantidad = cantidad ;
    }

    // Método que calcula el subtotal del artículo en función de la cantidad y el precio
    // del producto
     total doble () {
        devolver  esto . producto _ precio * esto . cantidad ;
    }
}

// Clase Carrito
carrito de clase {
    ItemCarrito [] items ;

    // Constructor de la clase Carrito
    Carrito ( ItemCarrito [] items ) {
        esto _ elementos = elementos ;
    }

    // Método que calcula el subtotal del carrito sumando los subtotales de cada
    // artículo
     total doble () {
         total doble = 0 ;
        for ( ItemCarrito  item : this . items ) {
            total += artículo . totales ();
        }
        devolución  total ;
    }

    // Método que calcula el total del carrito aplicando un posible descuento
    doble  total ( descuento  descuento ) {
        if ( descuento != nulo ) {
            devolver  esto . total () * ( 1 - descuento . porcentaje );
        } más {
            devolver  esto . totales ();
        }
    }
}

// Clase de descuento
descuento clase {
    doble  porcentaje ;

    // Constructor de la clase Descuento
    Descuento ( doble  porcentaje ) {
        esto _ porcentaje = porcentaje ;
    }
}

public  class  Supermercado {

    public  static  void  main ( String [] args ) {

        // Creamos instancias de Producto
        producto [] productos = {
                Nuevo  Producto ( "Jabón en polvo" , 40 ),
                Nuevo  Producto ( "Chocolates" , 100 ),
                Nuevo  Producto ( "Esponjas" , 10 )
        };

        // Pedimos al usuario que seleccione la cantidad de cada producto
        Scanner  teclado = nuevo  Scanner ( System . in );
        int [] cantidades = new  int [ 3 ];
        for ( int  i = 0 ; i < productos . longitud ; i ++) {
            sistema _ fuera _ print ( "Ingrese la cantidad de " + productos [ i ]. nombre + ": " );
            cantidades [ i ] = teclado . siguienteInt ();
        }


        teclado . cerrar ();
        // Creamos instancias de ItemCarrito a partir de los productos seleccionados por
        // el usuario
        ArticuloCarrito [] articulos = {
                nuevo  ItemCarrito ( productos [ 0 ], cantidades [ 0 ]),
                nuevo  ItemCarrito ( productos [ 1 ], cantidades [ 1 ]),
                 artículo nuevoCarrito ( productos [ 2 ] , cantidades [ 2 ])
        };

        // Creamos una instancia de Carrito
        Carrito  carrito = carrito nuevo  ( items );

        // Imprimimos los detalles del carrito
        for ( int  i = 0 ; i < elementos . longitud ; i ++) {
            sistema _ fuera _ println (( cantidades [ i ]) + " " + productos [ i ]. precio + " " + productos [ i ]. nombre );
        }

        // Imprimimos el total
        sistema _ fuera _ println ( "total: " + carrito . total ());

      
    }
}"