package Hospital.model;

import java.time.LocalDate;

public class Medicamentos {
    private String nombre;
    private String formaFarmaceutica;
    private String dosis;
    private String principioActivo;
    private LocalDate fechaCaducidad;
    private String numeroLote;
    private double precio;
    private String indicaciones;
    private String contraindicaciones;

    public Medicamentos(String nombre, String formaFarmaceutica, String dosis, String principioActivo, LocalDate fechaCaducidad, String numeroLote, double precio, String indicaciones, String contraindicaciones) {
        this.nombre = nombre;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.principioActivo = principioActivo;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public String toString() {
        return "Medicamento{" +
                "Nombre='" + nombre + '\'' +
                ", Forma Farmacéutica='" + formaFarmaceutica + '\'' +
                ", Dosis='" + dosis + '\'' +
                ", Principio Activo='" + principioActivo + '\'' +
                ", Fecha de Caducidad=" + fechaCaducidad +
                ", Número de Lote='" + numeroLote + '\'' +
                ", Precio=" + precio +
                ", Indicaciones='" + indicaciones + '\'' +
                ", Contraindicaciones='" + contraindicaciones + '\'' +
                '}';
    }

}


