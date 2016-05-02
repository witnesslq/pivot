package com.edoyun.pivot.core;

import java.util.ArrayList;

import java.util.List;

public abstract class Thing {

	private List<Device> devices = new ArrayList<Device>();
	private List<Action> actions = new ArrayList<Action>();

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

}
