package com.edoyun.pivot.core;

import java.util.ArrayList;
import java.util.List;

import com.edoyun.pivot.element.Space;
import com.edoyun.pivot.element.State;
import com.edoyun.pivot.element.Time;

public class Situation {

	private Time time;
	private Space space;
	private List<State> states = new ArrayList<State>();

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Space getSpace() {
		return space;
	}

	public void setSpace(Space space) {
		this.space = space;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

}
