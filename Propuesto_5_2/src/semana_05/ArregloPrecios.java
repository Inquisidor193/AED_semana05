package semana_05;

public class ArregloPrecios {
	
	private double[] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};

    public ArregloPrecios() {
    }
    
    public int tamanio() {
        return precio.length;
    }
    
    public double obtener(int i) {
		return precio[i];
	}
    
    public double precioPromedio() {
		double promedio = 0;
		double suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += precio[i];
		}
		promedio = suma / tamanio();
		return promedio;
	}

	public double precioMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] > mayor) {
				mayor = precio[i];
			}
		}
		return mayor;
	}

	public double precioMenor() {
		double menor = precio[0];
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] < menor) {
				menor = precio[i];
			}
		}
		return menor;
	}
	
	public int cantMayoresPrecioPromedio() {
        double promedio = precioPromedio();
        int cant = 0;
        for (double p : precio) {
            if (p >= promedio) {
            	cant++;
            }
        }
        return cant;
    }

    public int cantMenoresPrecioPromedio() {
        double promedio = precioPromedio();
        int cant = 0;
        for (double p : precio) {
            if (p < promedio) {
            	cant++;
            }
        }
        return cant;
    }
    
    public int posPrimerPrecioMayorAlSegundo(double primerPrecio, double segundoPrecio) {
        for (int i = 0; i < precio.length; i++) {
            if (precio[i] > primerPrecio && precio[i] > segundoPrecio) {
                return i;
            }
        }
        return -1;
    }

    public int posUltimoPrecioMenorAlPenultimo() {
        int ultimoMenor = -1;
        for (int i = 0; i < precio.length - 1; i++) {
            if (precio[i] < precio[i + 1]) {
            	ultimoMenor = i;
            }
        }
        if (ultimoMenor >= 0) {
            return ultimoMenor;
        } else {
            return -1;
        }
    }
    
    public void generarPrecio() {
		for (int i = 0; i < tamanio(); i++)
			precio[i] = (int) aleatorio(0 , 20);
	}
    
    private double aleatorio(double min, double max) {
		return (double) ((max - min + 1) * Math.random()) + min;
	}

}
