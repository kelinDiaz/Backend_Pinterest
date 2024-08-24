package hn.unah.pinterest2_proyecto.DTOS;

import java.util.List;

import lombok.Data;

@Data
public class PinRequest {

    private String titulo;
    private String descripcion;
    private String urlPin;
    private Long codigoTablero; // ID del tablero existente (pued
    private String nombreNuevoTablero; // Nombre del nuevo tablero (solo se usará si no se proporciona un tablero existente)
    private List<Long> etiquetasId;
    
}
