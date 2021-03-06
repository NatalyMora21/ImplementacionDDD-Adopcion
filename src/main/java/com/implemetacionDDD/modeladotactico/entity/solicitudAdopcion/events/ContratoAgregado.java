package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Contrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.ContratoId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.DocumentoContrato;

public class ContratoAgregado extends DomainEvent {

    private final ContratoId contratoId;
    private final DocumentoContrato documentoContrato;


    public ContratoAgregado(ContratoId contratoId, DocumentoContrato documentoContrato) {
        super("sofka.solicitudAdopcion.contratoAgregado");
        this.contratoId = contratoId;
        this.documentoContrato = documentoContrato;

    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public DocumentoContrato getDocumentoContrato() {
        return documentoContrato;
    }
}
