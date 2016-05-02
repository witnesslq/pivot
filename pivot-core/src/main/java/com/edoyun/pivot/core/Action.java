package com.edoyun.pivot.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Action {

	private Goal goal;
	private List<Situation> situations = new ArrayList<Situation>();

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public List<Situation> getSituations() {
		return situations;
	}

	public void setSituations(List<Situation> situations) {
		this.situations = situations;
	}

}
