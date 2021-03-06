package com.ecomm.app.command;

import java.util.List;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import com.ecomm.app.aggregate.Items;

public class InitiateShippingCommand {

	@TargetAggregateIdentifier
	private String shipmentId;
	
	private String orderId;
	
	private String custId;
	
	private List<Items> items;
	
	private boolean delivered;
	
	public InitiateShippingCommand(String shipmentId, String orderId, String custId, boolean delivered, List<Items> items){
		this.shipmentId = shipmentId;
		this.orderId = orderId;
		this.custId = custId;
		this.delivered = delivered;
		this.items = items;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustId() {
		return custId;
	}

	public List<Items> getItems() {
		return items;
	}

	public boolean isDelivered() {
		return delivered;
	}
	
}
