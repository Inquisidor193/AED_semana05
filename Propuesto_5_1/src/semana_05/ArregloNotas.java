package semana_05;

public class ArregloNotas {

	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};

    public ArregloNotas() {
    }

    public int tamanio() {
        return nota.length;
    }
    
    public double obtener(int i) {
		return nota[i];
	}
    
    public double notaPromedio() {
		double promedio = 0;
		double suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += nota[i];
		}
		promedio = suma / tamanio();
		return promedio;
	}

	public double notaMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] > mayor) {
				mayor = nota[i];
			}
		}
		return mayor;
	}

	public double notaMenor() {
		double menor = nota[0];
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] < menor) {
				menor = nota[i];
			}
		}
		return menor;
	}
	
	public int cantNotasAprobatorias() {
        int cant = 0;
        for (int n : nota) {
            if (n >= 13) {
                cant++;
            }
        }
        return cant;
    }
	
	public int cantNotasDesaprobatorias() {
        int cant = 0;
        for (int n : nota) {
            if (n < 13) {
            	cant++;
            }
        }
        return cant;
    }

    public int cantNotasMayoresA15() {
        int cant = 0;
        for (int n : nota) {
            if (n > 15) {
            	cant++;
            }
        }
        return cant;
    }
    
    public int posPrimeraNotaAprobatoria() {
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 13) {
                return i;
            }
        }
        return -1;
    }
	
    public int posPenultimaNotaDesaprobatoria() {
        int ultimoDesaprobado = -1;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] < 13) {
            	ultimoDesaprobado = i;
            }
        }
        if (ultimoDesaprobado >= 0) {
            return ultimoDesaprobado;
        } else {
            return -1;
        }
    }
    
    public void generarNotas() {
		for (int i = 0; i < tamanio(); i++)
			nota[i] = (int) aleatorio(0 , 20);
	}
    
    private double aleatorio(double min, double max) {
		return (double) ((max - min + 1) * Math.random()) + min;
	}
}
