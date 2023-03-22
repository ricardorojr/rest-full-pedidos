package com.ricardo.service;

import com.ricardo.domain.entity.Pedido;
import com.ricardo.domain.enums.StatusPedido;
import com.ricardo.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
